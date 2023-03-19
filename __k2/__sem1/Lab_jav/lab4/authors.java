package __k2.__sem1.Lab_jav.lab4;

public enum authors{
    BETHOVEN ("Bethoven"),
    MOZART ("Mozart");

    private String name;

    authors(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

