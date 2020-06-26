package personalTest.springframework.converters;

import personalTest.springframework.commands.ProductForm;
import personalTest.springframework.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId().toHexString());
        productForm.setName(product.getName());
        productForm.setSurname(product.getSurname());
        productForm.setAge(product.getAge());
        productForm.setMail(product.getMail());
        productForm.setPoints(product.getPoints());
        productForm.setCategoryMap(product.getCategoryMap());
        productForm.setHardFactCategoryList(product.getHardFactCategoryList());
        productForm.setIntroversionCategoryList(product.getIntroversionCategoryList());
        productForm.setLifestyleCategoryList(product.getLifestyleCategoryList());
        productForm.setPassionCategoryList(product.getPassionCategoryList());

        return productForm;
    }
}
