import org.antlr.runtime.*;
public class Test{
   public static void main(String[] args) throws Exception
   {
	ANTLRInputStream input = new ANTLRInputStream(System.in);
	
	EjerLexer lexer = new EjerLexer(input);

	CommonTokenStream tokens = new CommonTokenStream(lexer);

	EjerParser parser = new EjerParser(tokens);

	parser.inicio();
   }
}