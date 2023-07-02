import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;

// Changes made are between MYSTUFF and MYSTUFFEND

public class questionsMain {
   public static void main(String[] args) throws Exception {
      // MYSTUFF: Read arguments and validate them
      FileInputStream f = null;
      String questionId = null;
      int choices = 0;
      boolean invalidArguments = false;
      if (args.length != 3) {
         System.err.println("Usage: <progName> <file to load questions from> <question to show id> <number of choices>");
         System.exit(0);
      } else {
         questionId = args[1];
         choices = Integer.parseInt(args[2]);
         try {
            f = new FileInputStream(args[0]);
         } catch (FileNotFoundException e){
            System.err.println("The file given was not found!");
            System.exit(0);
         }
      }
      // MYSTUFFEND

      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(f);
      // create a lexer that feeds off of input CharStream:
      questionsLexer lexer = new questionsLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      questionsParser parser = new questionsParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at prog rule:
      ParseTree tree = parser.prog();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         ParseTreeWalker walker = new ParseTreeWalker();
         ExecuteListener listener0 = new ExecuteListener();
         // Execute Listener
         System.out.println("# Executing Listener...");
         walker.walk(listener0, tree);
         System.out.println("# Listener executed!");

         // MYSTUFF: Show question
         System.out.println(String.format("\n# Showing question selected (%s)...\n", questionId));
         Question q = listener0.getQuestion(questionId);
         if (q==null) {
            System.err.println("Error! Question with given id not found!");
            System.exit(0);
         }
         System.out.println(q.computeQuestion(choices));
         // MYSTUFFEND
      }
   }
}
