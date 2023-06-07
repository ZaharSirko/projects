package __k2.__sem2.diskr.lab5;

import java.util.HashMap;

import __k2.__sem2.diskr.lab5.Parser.AndNode;
import __k2.__sem2.diskr.lab5.Parser.BiconditionalNode;
import __k2.__sem2.diskr.lab5.Parser.ImplicationNode;
import __k2.__sem2.diskr.lab5.Parser.NotNode;
import __k2.__sem2.diskr.lab5.Parser.OrNode;
import __k2.__sem2.diskr.lab5.Parser.ParContentNode;
import __k2.__sem2.diskr.lab5.Parser.ParseResult;
import __k2.__sem2.diskr.lab5.Parser.VarNode;
import __k2.__sem2.diskr.lab5.Parser.XorNode;
import __k2.__sem2.diskr.lab5.tokens.Token;

public class Interpreter {
	
	private HashMap<String, Boolean> map;
	
	public boolean process(ParseResult parse, boolean[] values) {
		if(map == null)
			map = new HashMap<>();
		else map.clear();
		
		for(int i = 0; i < parse.variables.size(); i++) {
			Token token = parse.variables.get(i);
			map.put(token.value, values[i]);
		}
		
		return interpret(parse.node);
	}
	
	public boolean interpret(Object node) {
		if(node instanceof NotNode) return !interpret(((NotNode)node).node);
		if(node instanceof AndNode) return interpret(((AndNode)node).a) && interpret(((AndNode)node).b);
		if(node instanceof OrNode) return interpret(((OrNode)node).a) || interpret(((OrNode)node).b);
		if(node instanceof XorNode) return interpret(((XorNode)node).a) != interpret(((XorNode)node).b);
		if(node instanceof VarNode) return map.get(((VarNode) node).token.value);
		
		if(node instanceof ImplicationNode) {
			boolean a = interpret(((ImplicationNode)node).a);
			if(!a) return true;
			boolean b = interpret(((ImplicationNode)node).b);
			return b;
		}
		if(node instanceof BiconditionalNode) {
			boolean a = interpret(((BiconditionalNode)node).a);
			boolean b = interpret(((BiconditionalNode)node).b);
			
			return a==b;
		}
		if(node instanceof ParContentNode) {
			boolean a = interpret(((ParContentNode)node).node);
			return a;
		}
		
		return false;
	}
	
}