package personalTest.springframework.repositories;

import personalTest.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
