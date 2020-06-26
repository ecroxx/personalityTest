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


        return "user/index";
    }


    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/user/list";
    }

    @RequestMapping({"/user/list", "/user"})
    public String listProducts(Model model){
        model.addAttribute("products", productService.listAll());
        return "user/list";
    }

    @RequestMapping("/user/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "user/show";
    }

    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Product product = productService.getById(id);
        ProductForm productForm = productToProductForm.convert(product);

        model.addAttribute("productForm", productForm);
        return "user/productform";
    }

    @RequestMapping("/user/new")
    public String newProduct(Model model){
        model.addAttribute("productForm", new ProductForm());
        return "user/productform";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String saveOrUpdateProduct(@Valid ProductForm productForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "user/productform";
        }

        Product savedProduct = productService.saveOrUpdateProductForm(productForm);

        return "redirect:/user/show/" + savedProduct.getId();
    }

    @RequestMapping("/user/delete/{id}")
    public String delete(@PathVariable String id){
        productService.delete(id);
        return "redirect:/user/list";
    }





}
