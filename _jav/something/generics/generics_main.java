package _jav.something.generics;

public class generics_main {
    public static void main(String[] args) {
        Integer[] intArr ={1,2,3,4,5};
        Double[] doubleArr = {1.2,5.4,6.5,7.6,8.7};
        Character[] charArr ={'H','E','L','L','O'};
        String[] stringArr = {"B","Y","E"};

        // displayArray(intArr);
        // displayArray(doubleArr);
        // displayArray(charArr);
        // displayArray(stringArr);

        System.out.println(getFirst(intArr));   
        System.out.println(getFirst(doubleArr));
        System.out.println(getFirst(charArr));
        System.out.println(getFirst(stringArr));
 
      }
      
      public static <Thing> void displayArray(Thing[] array){
        for(Thing x : array   ){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array){
      return array[0];
    }
}

// public static <Thing> void draw(Thing x){

// x.draw()
// }

