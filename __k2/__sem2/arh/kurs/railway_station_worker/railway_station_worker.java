package __k2.__sem2.arh.kurs.railway_station_worker;

public class railway_station_worker {
    int id;
    String name;
    String surename;
    String gender;
    int children;
    int age;
    String chief;
    int department;
    int workExp;
    int salary;
    public railway_station_worker() {
    }
    public railway_station_worker(int id, String name, String surename,int age, String gender, int children, String chief,
            int department, int workExp, int salary) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.gender = gender;
        this.children = children;
        this.chief = chief;
        this.department = department;
        this.workExp = workExp;
        this.salary = salary;
    }
    public int getId() {
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getChildren() {
        return children;
    }
    public void setChildren(int children) {
        this.children = children;
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
    public int getWorkExp() {
        return workExp;
    }
    public void setWork_exp(int workExp) {
        this.workExp = workExp;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
