package personalTest.springframework.converters;

import personalTest.springframework.commands.ProductForm;
import personalTest.springframework.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null  && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(new ObjectId(productForm.getId()));
        }
        product.setName(productForm.getName());
        product.setSurname(productForm.getSurname());
        product.setAge(productForm.getAge());
        product.setMail(productForm.getMail());
        product.setPoints(productForm.getPoints());
        product.setCategoryMap(productForm.getCategoryMap());
        product.setHardFactCategoryList(productForm.getHardFactCategoryList());
        product.setIntroversionCategoryList(productForm.getIntroversionCategoryList());
        product.setLifestyleCategoryList(productForm.getLifestyleCategoryList());
        product.setPassionCategoryList(productForm.getPassionCategoryList());



        return product;
    }
}
