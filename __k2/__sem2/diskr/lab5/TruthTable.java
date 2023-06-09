package __k2.__sem2.diskr.lab5;

import java.util.ArrayList;
import java.util.Scanner;

import __k2.__sem2.diskr.lab5.Parser.ParseResult;
import __k2.__sem2.diskr.lab5.tokens.Token;

public class TruthTable {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			System.out.println("Enter boolean expression: ");
			String sequence = scanner.nextLine();
			if(sequence.equals("stop")) {
				running = false;
				continue;
			}
			
			process(sequence);
		}
		
		scanner.close();
	}
	
	public static void process(String sequence) {
		Parser parser = new Parser();
		Interpreter interpreter = new Interpreter();
		ArrayList<Token> tokens = Lexer.process(sequence);
		
		ParseResult result = parser.process(tokens);
		
		Display.header(result.variables);
		Display.display(interpreter, result);
	}
	
}