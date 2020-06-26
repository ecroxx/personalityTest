package personalTest.springframework.controllers;

import personalTest.springframework.commands.ProductForm;
import personalTest.springframework.converters.ProductToProductForm;
import personalTest.springframework.domain.Product;
import personalTest.springframework.domain.Questions;
import personalTest.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import personalTest.springframework.services.QuestionsService;
import personalTest.springframework.services.QuestionsServiceImpl;

import javax.validation.Valid;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
@Controller
public class ProductController {

    private ProductService productService;
    private static Questions questions;

    @Autowired
    private QuestionsService questionsService;


    private ProductToProductForm productToProductForm;

    @Autowired
    public void setQuestionsService(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    @Autowired
    public void setProductToProductForm(ProductToProductForm productToProductForm) {
        this.productToProductForm = productToProductForm;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/welcome")
    public String welcomeToList(){
        if(ProductController.questions==null){
            ProductController.questions=new Questions();
            questionsService.saveOrUpdate(questions);
        }


        return "product/index";
    }


    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/product/list";
    }

    @RequestMapping({"/product/list", "/product"})
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAll());
     /*   model.addAttribute("avarage", productService.listAll().stream().mapToDouble(Product::getAvg).average().getAsDouble());
        model.addAttribute("avarageInfrastructure",productService.listAll().stream().mapToDouble(Product::getAvgInfrastructure).average().getAsDouble());
        model.addAttribute("avarageCommunity",productService.listAll().stream().mapToDouble(Product::getAvgCommunity).average().getAsDouble());
        model.addAttribute("avarageCoparate",productService.listAll().stream().mapToDouble(Product::getAvgCooprate).average().getAsDouble());
        model.addAttribute("avarageTransportation",productService.listAll().stream().mapToDouble(Product::getAvgTransportation).average().getAsDouble());
     */
        return "product/list";
    }

    @RequestMapping("/product/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product/show";
    }

    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Product product = productService.getById(id);
        ProductForm productForm = productToProductForm.convert(product);

        model.addAttribute("productForm", productForm);
        return "product/productform";
    }

    @RequestMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("productForm", new ProductForm());
        return "product/productform";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid ProductForm productForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productform";
        }

        Product savedProduct = productService.saveOrUpdateProductForm(productForm);

        return "redirect:/product/show/" + savedProduct.getId();
    }

    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable String id){
        productService.delete(id);
        return "redirect:/product/list";
    }

   /* @RequestMapping("/product/survey")
    public String getSurvey( Model model){
        //model.addAttribute("product", productService.getById(id));
        return "redirect:/product/thanks";
    }

    @RequestMapping(value = "/product/thanks", method = RequestMethod.POST)
    public String saveOrUpdateSurvey(@Valid ProductForm productForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productform";
        }

        Product savedProduct = productService.saveOrUpdateProductForm(productForm);

        return "/product/thanks" + savedProduct.getId();
    }
    */




}
