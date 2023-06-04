package __k2.__sem2.arh.kurs.worker;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class worker_model extends human_model {
protected StringProperty chief;
protected IntegerProperty department;
protected IntegerProperty workExperience;
protected IntegerProperty children;
protected IntegerProperty salary;

public worker_model(int human_id, String name, int age, int department) {
    super(human_id, name, age);
    this.department = new SimpleIntegerProperty(department);
}
public worker_model(){
    super();
}
public worker_model(int human_id, String name, String surename, int age, int department, int salary) {
    super(human_id, name, surename, age);
    this.department = new SimpleIntegerProperty(department);
    this.salary =  new SimpleIntegerProperty(salary);
}
public worker_model(int human_id, String name, String surename, int age, String gender, String chief, int department,
        int workExperience, int children, int salary) {
    super(human_id, name, surename, age, gender);
    this.chief = new SimpleStringProperty(chief);
    this.department = new SimpleIntegerProperty(department);
    this.workExperience =  new SimpleIntegerProperty(workExperience);
    this.children =  new SimpleIntegerProperty(children);
    this.salary =  new SimpleIntegerProperty(salary);
}
public worker_model(int human_id, String name, String surename, int age, String gender, int workExperience, int salary) {
    super(human_id, name, surename, age, gender);
    this.workExperience =  new SimpleIntegerProperty(workExperience);
    this.salary =  new SimpleIntegerProperty(salary);
}
public StringProperty getChief() {
    return chief;
}
public void setChief(StringProperty chief) {
    this.chief = chief;
}
public IntegerProperty getDepartment() {
    return department;
}
public void setDepartment(IntegerProperty department) {
    this.department = department;
}
public IntegerProperty getWorkExperience() {
    return workExperience;
}
public void setWorkExperience(IntegerProperty workExperience) {
    this.workExperience = workExperience;
}
public IntegerProperty getChildren() {
    return children;
}
public void setChildren(IntegerProperty children) {
    this.children = children;
}
public IntegerProperty getSalary() {
    return salary;
}
public void setSalary(IntegerProperty salary) {
    this.salary = salary;
}
}
