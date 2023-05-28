package __k2.__sem2.arh.kurs.worker;

public class human {
    protected int id = 0;
    protected String name;
    protected String surename; 
    protected int age = 0;
    protected String gender;
    public human(){}
    public human(int id, String name, String surename, int age) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.age = age;
    }
    public human(int id, String name, String surename, int age, String gender) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSurename() {
        return surename;
    }
    public void setSurename(String surename) {
        this.surename = surename;
    }
}
