package _jav.oop.oop9;



public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		new Friends("Sponegbob");
		 new Friends("Patrick");
		 new Friends("Patrick");
		
		System.out.println(Friends.numberOfFriends);
	}
}