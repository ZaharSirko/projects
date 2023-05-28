package __k2.__sem2.arh.kurs.worker;

public class worker extends human {
protected String chief;
protected int department = 0;
protected int workExperience = 0;
protected int children = 0;
protected int salary = 0;
public worker(int id, String name, int age, int department) {
    super(id, name, age);
    this.department = department;
}
public worker(){
    super();
}
public worker(int id, String name, String surename, int age, int department, int salary) {
    super(id, name, surename, age);
    this.department = department;
    this.salary = salary;
}
public worker(int id, String name, String surename, int age, String gender, String chief, int department,
        int workExperience, int children, int salary) {
    super(id, name, surename, age, gender);
    this.chief = chief;
    this.department = department;
    this.workExperience = workExperience;
    this.children = children;
    this.salary = salary;
}
public worker(int id, String name, String surename, int age, String gender, int workExperience, int salary) {
    super(id, name, surename, age, gender);
    this.workExperience = workExperience;
    this.salary = salary;
}
public String getChief() {
    return chief;
}
public void setChief(String chief) {
    this.chief = chief;
}
public int getDepartment() {
    return department;
}
public void setDepartment(int department) {
    this.department = department;
}
public int getWorkExperience() {
    return workExperience;
}
public void setWorkExperience(int workExperience) {
    this.workExperience = workExperience;
}
public int getChildren() {
    return children;
}
public void setChildren(int children) {
    this.children = children;
}
public int getSalary() {
    return salary;
}
public void setSalary(int salary) {
    this.salary = salary;
}
}
