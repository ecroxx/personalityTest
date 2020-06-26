package personalTest.springframework.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
@Document
public class Product {
    @Id
    private ObjectId _id;
    private String name;
    private String surname;
    private BigDecimal age;
    private String mail;
    @Transient
    private Integer[] hardFactCategoryList;
    @Transient
    private Integer[]  lifestyleCategoryList;
    @Transient
    private Integer[]  introversionCategoryList;
    @Transient
    private Integer[]  passionCategoryList;
    private Map<String,Integer[]> categoryMap;

    {

        this.categoryMap=new HashMap<>();
        this.hardFactCategoryList =new Integer[5];

        this.lifestyleCategoryList =new Integer[10];
        this.introversionCategoryList =new Integer[5];
        this.passionCategoryList =new Integer[6];
        categoryMap.put("Hard Fact",hardFactCategoryList);
        categoryMap.put("Lifestyle",lifestyleCategoryList);
        categoryMap.put("Introversion",introversionCategoryList);
        categoryMap.put("Passion",passionCategoryList);
    }


    public Integer[] getHardFactCategoryList() {
        return hardFactCategoryList;
    }

    public void setHardFactCategoryList(Integer[] hardFactCategoryList) {
        this.hardFactCategoryList = hardFactCategoryList;
    }

    public Integer[] getLifestyleCategoryList() {
        return lifestyleCategoryList;
    }

    public void setLifestyleCategoryList(Integer[] lifestyleCategoryList) {
        this.lifestyleCategoryList = lifestyleCategoryList;
    }

    public Integer[] getIntroversionCategoryList() {
        return introversionCategoryList;
    }

    public void setIntroversionCategoryList(Integer[] introversionCategoryList) {
        this.introversionCategoryList = introversionCategoryList;
    }

    public Integer[] getPassionCategoryList() {
        return passionCategoryList;
    }

    public void setPassionCategoryList(Integer[] passionCategoryList) {
        this.passionCategoryList = passionCategoryList;
    }

    public Map<String, Integer[]> getCategoryMap() {
        return categoryMap;
    }

    public void setCategoryMap(Map<String, Integer[]> categoryMap) {
        this.categoryMap = categoryMap;
    }

    public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

    public BigDecimal getAge () {
            return age;
        }

        public void setAge (BigDecimal age){
            this.age = age;
        }

        public String getMail () {
            return mail;
        }

        public void setMail (String mail){
            this.mail = mail;
        }



    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }
}

