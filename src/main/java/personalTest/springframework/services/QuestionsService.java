package personalTest.springframework.services;

import personalTest.springframework.domain.Questions;

import java.util.List;

public interface QuestionsService {
    List<Questions> listAll();

    Questions getById(String id);

    Questions saveOrUpdate(Questions product);

    void delete(String id);
}
