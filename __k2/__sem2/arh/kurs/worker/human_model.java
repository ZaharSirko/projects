package __k2.__sem2.arh.kurs.worker;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class human_model {
    protected IntegerProperty human_id;
    protected StringProperty name;
    protected StringProperty surename; 
    protected IntegerProperty age;
    protected StringProperty gender;
    public human_model(){}
    public human_model(int human_id,String name, String suremname,int age,String gender){
        this.human_id = new SimpleIntegerProperty(human_id);
        this.name = new SimpleStringProperty(name);
        this.surename = new SimpleStringProperty(suremname);
        this.age =new SimpleIntegerProperty(age);
        this.gender = new SimpleStringProperty(gender);

    }
    public human_model(int human_id, String name, int age) {
        this.human_id  = new SimpleIntegerProperty(human_id);
        this.name =  new SimpleStringProperty(name);
        this.age = new SimpleIntegerProperty(age);
    }
    public human_model(int human_id, String name, String surename, int age) {
        this.human_id = new SimpleIntegerProperty(human_id);
        this.name =  new SimpleStringProperty(name);
        this.surename = new SimpleStringProperty(surename);
        this.age = new SimpleIntegerProperty(age);
    }
    public IntegerProperty getHuman_id() {
        return human_id;
    }
    public void setHuman_id(IntegerProperty human_id) {
        this.human_id = human_id;
    }
    public StringProperty getName() {
        return name;
    }
    public void setName(StringProperty name) {
        this.name = name;
    }
    public StringProperty getSurename() {
        return surename;
    }
    public void setSurename(StringProperty surename) {
        this.surename = surename;
    }
    public IntegerProperty getAge() {
        return age;
    }
    public void setAge(IntegerProperty age) {
        this.age = age;
    }
    public StringProperty getGender() {
        return gender;
    }
    public void setGender(StringProperty gender) {
        this.gender = gender;
    }
}
