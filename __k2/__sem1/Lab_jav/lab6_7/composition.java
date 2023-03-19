package __k2.__sem1.Lab_jav.lab6_7;

public class composition {
   private  String name_composition;
   private  double during;
   private  String author;
   private  int year;
   static int numberOfComposition;
   composition(){
    numberOfComposition++;
   }
    composition(String name_composition,double during, int year,String author){
        this.setName(name_composition);
        this.setDuring(during);
        this.setYear(year);
        this.setAuthor(author);
        numberOfComposition++;
    }
    public void show_composition(){
        System.out.println(name_composition+" "+during+" "+year+" "+author);
    }
    public String toString(){
        return this.name_composition+" "+this.during+" "+this.year+" "+this.author;
    }
    public String getName(){
        return this.name_composition;
    }
    public double getDuring(){
        return this.during;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setName(String name_composition) {
		this.name_composition = name_composition;
	}
    public void setDuring(double during) {
        if(during> 100000){
            System.out.println("Error during is too much");
        }
        else{
            this.during = during;
        }
	}
    public void setAuthor(String author) {
		this.author = author;
	}
    public void setYear(int year) {
		this.year = year;
	}
		

}
