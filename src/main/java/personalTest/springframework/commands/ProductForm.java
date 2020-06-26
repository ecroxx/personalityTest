package personalTest.springframework.commands;


import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Egemen Ozkan on 26/06/2020.
 */
public class ProductForm {
    private String id;
    private String name;
    private String surname;
    private BigDecimal age;
    private String mail;
    private Integer[] points=new Integer[26];
    @Transient
    private Integer[] hardFactCategoryList;
    @Transient
    private Integer[]  lifestyleCategoryList;
    @Transient
    private Integer[]  introversionCategoryList;
    @Transient
    private Integer[]  passionCategoryList;
    private Map<String,Integer[]> categoryMap;
   //private List<Map<String,String>> list;

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

   /* private float avg;
    private float avgInfrastructure;
    private float avgCommunity;
    private float avgCooprate;
    private float avgTransportation;


    public void setAvg(){
        int sum=0;
        for(int i=0;i<20;i++){
            sum+=points[i];
            if(i==4){
                avgInfrastructure=(float)sum/5;
            }
            if(i==10){
                avgCommunity=((float)sum-(avgInfrastructure*5))/6;
            }
            if(i==13){
                avgCooprate=((float)sum-(avgInfrastructure*5)-(avgCommunity*6))/3;
            }
            if(i==19){
                avgTransportation=((float)sum-(avgInfrastructure*5)-(avgCommunity*6)-(avgCooprate*3))/6;
            }
        }
        avg=(float)sum/20;
    }

    public float getAvgInfrastructure() {
        setAvg();
        return avgInfrastructure;
    }

    public float getAvgCommunity() {
        setAvg();
        return avgCommunity;
    }

    public float getAvgCooprate() {
        setAvg();
        return avgCooprate;
    }

    public float getAvgTransportation() {
        setAvg();
        return avgTransportation;
    }

    public float getAvg() {
        setAvg();
        return avg;
    }
*/
/*
    public List<HashMap<String, String>> getList() {
        return list;
    }

    public void setList(List<HashMap<String, String>> list) {
        this.list = list;
    }
*/
/*
    public List<Integer> getHardFactCategoryList() {
        return hardFactCategoryList;
    }

    public void setHardFactCategoryList(List<Integer> hardFactCategoryList) {
        this.hardFactCategoryList = hardFactCategoryList;
    }

    public List<Integer> getLifestyleCategoryList() {
        return lifestyleCategoryList;
    }

    public void setLifestyleCategoryList(List<Integer> lifestyleCategoryList) {
        this.lifestyleCategoryList = lifestyleCategoryList;
    }

    public List<Integer> getIntroversionCategoryList() {
        return introversionCategoryList;
    }

    public void setIntroversionCategoryList(List<Integer> introversionCategoryList) {
        this.introversionCategoryList = introversionCategoryList;
    }

    public List<Integer> getPassionCategoryList() {
        return passionCategoryList;
    }

    public void setPassionCategoryList(List<Integer> passionCategoryList) {
        this.passionCategoryList = passionCategoryList;
    }

    public Map<String, List<Integer>> getCategoryMap() {
        return categoryMap;
    }

    public void setCategoryMap(Map<String, List<Integer>> categoryMap) {
        this.categoryMap = categoryMap;
    }
*/

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer[] getPoints() {
        return points;
    }

    public void setPoints(Integer[] points) {
        this.points = points;
    }
}
