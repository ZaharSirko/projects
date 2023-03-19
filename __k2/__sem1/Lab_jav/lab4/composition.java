package __k2.__sem1.Lab_jav.lab4;

public class composition extends _abstract implements _interf,Cloneable,Comparable<composition> {
   private  String name_composition;
   private  Double during;
   private  String author;
   private  Integer year;
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
    @Override
    public void show_composition(){
        System.out.println(name_composition+" "+during+" "+year+" "+author);
    }
    public String toString(){
        return this.name_composition+" "+this.during+" "+this.year+" "+this.author;
    }
    public boolean equal(composition composition){
        return this.year == composition.year;

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
		
    public Object clone() throws CloneNotSupportedException{
  return super.clone();
 }
 @Override
     public int compareTo(composition o) {
 
         int result = this.name_composition.compareTo(o.name_composition);
         if (result == 0) {
             result = this.during.compareTo(o.during);
         }
        else if (result == 0) {
            result = this.author.compareTo(o.author);
        }
        else if (result == 0) {
            result = this.year.compareTo(o.year);
        }
         return result;
     }
}
