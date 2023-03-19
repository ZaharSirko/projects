package __k2.__sem1.algo_lab;
public class lab_9 {
    public static void main(String[] args) {
        String s = "hey";
		System.out.println(s);
		System.out.println(AsciiToTripledBinary(s));
		System.out.println(decode("011010000110010101111001"));
    }
	private static String decode(String str) {
		char val;
		String word = "";
		for( int i=0; i<str.length(); i+=8 ) { 
		  val = (char) Integer.parseInt( str.substring( i, i+8 ), 2 );  
		  word += val; 
		} 
		return word;
	}

  public static String AsciiToTripledBinary(String asciiString){  
	byte[] bytes = asciiString.getBytes();  
	StringBuilder binary = new StringBuilder(); 
	for (byte b : bytes)  
	{  
	   int val = b;  
	   for (int i = 0; i < 8; i++)  
	   {  
		  binary.append((val & 128) == 0 ? 0 : 1); 
		  binary.append((val & 128) == 0 ? 0 : 1);  
		  binary.append((val & 128) == 0 ? 0 : 1);   
		  val <<= 1;  
	   }  
	}  
	return binary.toString();  
}  
}