import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class HelloMain {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String lineText = null;
      int lineNum = 1;
      if (sc.hasNextLine())
         lineText = sc.nextLine();
      HelloParser parser = new HelloParser(null);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      GetNames visitor0 = new GetNames();
      while(lineText != null) {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromString(lineText + "\n");
         // create a lexer that feeds off of input CharStream:
         HelloLexer lexer = new HelloLexer(input);
         lexer.setLine(lineNum);
         lexer.setCharPositionInLine(0);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         parser.setInputStream(tokens);
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         ParseTreeWalker walker = new ParseTreeWalker();
         Namer names = new Namer();
         walker.walk(names,tree);

         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            System.out.println(visitor0.visit(tree));
         }
         if (sc.hasNextLine())
            lineText = sc.nextLine();
         else
            lineText = null;
         lineNum++;
      }
   }
}
