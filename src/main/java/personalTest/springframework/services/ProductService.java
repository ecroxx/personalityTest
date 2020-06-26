package personalTest.springframework.services;

import personalTest.springframework.commands.ProductForm;
import personalTest.springframework.domain.Product;

import java.util.List;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
