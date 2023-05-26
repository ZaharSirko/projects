package __k2.__sem2.arh.kurs.brigade_worker;

public class brigade_worker {
    private int id;
    private String name;
    private String surename;
    private int age;
    private int salary;
    private int department;
    public brigade_worker() {
    }
    public brigade_worker(int id, String name, String surename, int age, int salary, int department) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public int getId(int check) {
         if(id==check) return id;
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurename() {
        return surename;
    }
    public void setSurename(String surename) {
        this.surename = surename;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
}
