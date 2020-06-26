package personalTest.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import personalTest.springframework.domain.Questions;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
public interface QuestionsRepository extends CrudRepository<Questions, String> {
}
