package personalTest.springframework.domain;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import personalTest.springframework.services.QuestionsService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
@Document
public class Questions {
    @Id
    private   ObjectId _id;
    private   String name ;


    private  final Map<String, HashMap<String, Integer>> hardFactCategoryMap;
    private  final Map<String, HashMap<String, Integer>> lifestyleCategoryMap;
    private  final Map<String, HashMap<String, Integer>> introversionCategoryMap;
    private  final Map<String, HashMap<String, Integer>> passionCategoryMap;
    private  final Map<String, Map<String, HashMap<String, Integer>>> cathegories;


   {
        cathegories=new HashMap<String, Map<String, HashMap<String, Integer>>>();

        //intialize static data (question / values) of hardFact Category
        hardFactCategoryMap=new HashMap<String, HashMap<String, Integer>>();
        //QUESTION 1
        hardFactCategoryMap.put("What is your gender?", new HashMap<String, Integer>(){{
            put("not answered",0);
            put("male",1);
            put("female",2);
            put("other",3);
        }});
        //QUESTION 2
        hardFactCategoryMap.put("How important is the gender of your partner?", new HashMap<String, Integer>(){{
              put("not answered",0);
              put("not Important",1);
              put("important",2);
              put("very Important",3);
          }});
        //QUESTION 3
        hardFactCategoryMap.put("How important is the age of your partner to you?", new HashMap<String, Integer>(){{
              put("not answered",0);
              put("not Important",1);
              put("important",2);
              put("very Important",3);
          }});
      //QUESTION 4
      hardFactCategoryMap.put("Do any children under the age of 18 live with you?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("yes",1);
          put("sometimes",2);
          put("no",3);
      }});

      //intialize static data (question / values) of lifestyle Category
      lifestyleCategoryMap=new HashMap<String, HashMap<String, Integer>>();
      //QUESTION 5
      lifestyleCategoryMap.put("How should your potential partner respond to this question?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("yes",1);
          put("sometimes",2);
          put("no",3);
      }});
      //QUESTION 6
      lifestyleCategoryMap.put("Could you imagine having children with your potential partner?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("yes",1);
          put("sometimes",2);
          put("no",3);
      }});
      //QUESTION 7
      lifestyleCategoryMap.put("How should your potential partner respond to this question?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("yes",1);
          put("sometimes",2);
          put("no",3);
      }});
      //QUESTION 8
      lifestyleCategoryMap.put("What is your marital status?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("never Married",1);
          put("seperated",2);
          put("divorced",3);
          put("widowed",4);
      }});
      //QUESTION 9
      lifestyleCategoryMap.put("How often do your drink alcohol?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("never",1);
          put("once or twice a year",2);
          put("once or twice a month",3);
          put("once or twice a week",4);
          put("I'm drinking my 3rd mojito now, and it's only 11am",5);
      }});

      //QUESTION 10
      lifestyleCategoryMap.put("How often do you smoke?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("never",1);
          put("once or twice a year",2);
          put("socially",3);
          put("frequently",4);
      }});

      //QUESTION 11
      lifestyleCategoryMap.put("What is your attitude towards drugs?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("never",1);
          put("I'm completely opposed",2);
          put("I've been know to dabble",3);
          put("drugs enrich my life",4);
      }});

      //QUESTION 12
      lifestyleCategoryMap.put("You are looking for?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("friendship",1);
          put("a hot date",2);
          put("an affair",3);
          put("a short-term relationship",4);
          put("a long-term relationship",5);
      }});

      //QUESTION 13
      lifestyleCategoryMap.put("Would you like to get married", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("yes",1);
          put("probably",2);
          put("eventually",3);
          put("no",4);
      }});

      //QUESTION 14
      lifestyleCategoryMap.put("What is your ideal living arrangement ?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("cohabitation",1);
          put("separate flat / room in the same building",2);
          put("separate flats in the same area",3);
          put("weekend-relationship",4);
          put("long distance relationship",5);
      }});

      //intialize static data (question / values) of introversion Category
      introversionCategoryMap=new HashMap<String, HashMap<String, Integer>>();
      //QUESTION 15
      introversionCategoryMap.put("Do you enjoy spending time alone?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("most of the time",1);
          put("often",2);
          put("sometimes",3);
          put("rarely",4);
          put("not at all",5);
      }});
      //QUESTION 16
      introversionCategoryMap.put("When you're alone, do you get lonely quickly?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("most of the time",1);
          put("often",2);
          put("sometimes",3);
          put("rarely",4);
          put("not at all",5);
      }});

      //QUESTION 17
      introversionCategoryMap.put("Do you enjoy going on holiday by yourself ?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("most of the time",1);
          put("often",2);
          put("sometimes",3);
          put("rarely",4);
          put("not at all",5);
      }});

      //QUESTION 18
      introversionCategoryMap.put("I consciously take me time?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("most of the time",1);
          put("often",2);
          put("sometimes",3);
          put("rarely",4);
          put("not at all",5);
      }});

      //QUESTION 19
      introversionCategoryMap.put("Should one keep little secrets from one's partner?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("most of the time",1);
          put("often",2);
          put("sometimes",3);
          put("rarely",4);
          put("not at all",5);
      }});

      //intialize static data (question / values) of passion Category
      passionCategoryMap=new HashMap<String, HashMap<String, Integer>>();
      //QUESTION 20
      passionCategoryMap.put("How often do you think about sex?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("a few times a day",1);
          put("daily",2);
          put("a few times a week",3);
          put("a few times a month",4);
          put("rarely",5);
      }});

      //QUESTION 21
      passionCategoryMap.put("If you were alone on a desert island, how long would you last before pleasuring yourself?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("less than a day",1);
          put("one day",2);
          put("one week",3);
          put("one month",4);
          put("I'd never do something like that",5);
      }});

      //QUESTION 22
      passionCategoryMap.put("How often would you like to have sex with your prospective partner?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("every day",1);
          put("a few times a week",2);
          put("once a week",3);
          put("every two month",4);
          put("infrequently",5);
          put("rarely",6);
      }});

      //QUESTION 23
      passionCategoryMap.put("Do you like trying out new things in bed and experimenting?", new HashMap<String, Integer>(){{
          put("not answered",0);
          put("Yes, definitely!",1);
          put("Now and then - why not?",2);
          put("I'd give it a try",3);
          put("I don't know",4);
          put("Absolutely not",5);

      }});

      //QUESTION 24
      passionCategoryMap.put("I can enjoy sex without love?", new HashMap<String, Integer>(){{
          put("always",0);
          put("often",1);
          put("sometimes",2);
          put("rarely",3);
          put("never",4);

      }});

      //QUESTION 25
      passionCategoryMap.put("For me, a stable relationship is a prerequisite for really good sex?", new HashMap<String, Integer>(){{
          put("always",0);
          put("often",1);
          put("sometimes",2);
          put("rarely",3);
          put("never",4);

      }});


        cathegories.put("Hard Fact",hardFactCategoryMap);
        cathegories.put("Lifestyle",lifestyleCategoryMap);
        cathegories.put("Introversion",introversionCategoryMap);
        cathegories.put("Passion",passionCategoryMap);


    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, HashMap<String, Integer>> getHardFactCategoryMap() {
        return hardFactCategoryMap;
    }

    public Map<String, HashMap<String, Integer>> getLifestyleCategoryMap() {
        return lifestyleCategoryMap;
    }

    public Map<String, HashMap<String, Integer>> getIntroversionCategoryMap() {
        return introversionCategoryMap;
    }

    public Map<String, HashMap<String, Integer>> getPassionCategoryMap() {
        return passionCategoryMap;
    }

    public Map<String, Map<String, HashMap<String, Integer>>> getCathegories() {
        return cathegories;
    }
}
