import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetCalculatorMain {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String lineText = null;
      int numLine = 1;
      if (sc.hasNextLine())
         lineText = sc.nextLine();
      SetCalculatorParser parser = new SetCalculatorParser(null);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      ExecuteVisitor visitor0 = new ExecuteVisitor();
      while(lineText != null) {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromString(lineText + "\n");
         // create a lexer that feeds off of input CharStream:
         SetCalculatorLexer lexer = new SetCalculatorLexer(input);
         lexer.setLine(numLine);
         lexer.setCharPositionInLine(0);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         parser.setInputStream(tokens);
         // begin parsing at prog rule:
         ParseTree tree = parser.prog();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            visitor0.visit(tree);
         }
         if (sc.hasNextLine())
            lineText = sc.nextLine();
         else
            lineText = null;
         numLine++;
      }
   }
}
