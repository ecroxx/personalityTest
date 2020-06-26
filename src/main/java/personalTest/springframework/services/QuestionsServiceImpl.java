package personalTest.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personalTest.springframework.domain.Questions;
import personalTest.springframework.repositories.QuestionsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {


    private QuestionsRepository questionsRepository;


    @Autowired
    public QuestionsServiceImpl(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;

    }

    @Override
    public Questions getById(String id) {
        return questionsRepository.findById(id).orElse(null);
    }

    @Override
    public Questions saveOrUpdate(Questions questions) {
        questionsRepository.save(questions);
        return questions;
    }

    @Override
    public void delete(String id) {
        questionsRepository.deleteById(id);
    }
    @Override
    public List<Questions> listAll() {
        List<Questions> questions = new ArrayList<>();
        questionsRepository.findAll().forEach(questions::add); //fun with Java 8
        return questions;
    }


}
