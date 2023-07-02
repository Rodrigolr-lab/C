import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ExecuteListener extends questionsBaseListener {

   // Attributes
   private List<Question> questions = new ArrayList<>();
   private ParseTreeProperty<Answer> answerContext = new ParseTreeProperty<>();
   private ParseTreeProperty<Question> questionsContext = new ParseTreeProperty<>();

   // Getters
   public List<Question> getQuestions() {
      return questions;
   }

   public Question getQuestion(String id) {
      Question q = null;
      // Get question
      for (Question qu:questions) {
         if(qu.getId().equalsIgnoreCase(id))
            q=qu;
      }
      return q;     
   }

   // Listener

   @Override public void enterProg(questionsParser.ProgContext ctx) {
      // Feedback
      System.out.println("# Started Listener! Reading questions...");
   }

   @Override public void exitProg(questionsParser.ProgContext ctx) {
      // Feedback
      System.out.println(String.format(
         "# There were read %d questions!",
         questions.size()
      ));
   }

   @Override public void enterQuestion(questionsParser.QuestionContext ctx) {
      // Construct question
      Question q = new Question(
         ctx.ID().getText(), 
         ctx.q.getText().substring(1, ctx.q.getText().length()-1)
      );
      //System.out.println(q);
      questionsContext.put(ctx, q);
   }

   @Override public void exitQuestion(questionsParser.QuestionContext ctx) {
      Question q = questionsContext.get(ctx);
      // Add answers to it
      for(questionsParser.AnswerContext a:ctx.answer()) {
         q.addAnswer(answerContext.get(a));
      }
      // Store on questions array
      questions.add(q);
      // Feedback
      System.out.println(String.format(
         "%4s%s",
         "",
         q
      ));
   }

   @Override public void exitAnswer(questionsParser.AnswerContext ctx) {
      // Construct answer
      Answer a = new Answer(
         ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1),
         Integer.parseInt(ctx.INTEGER().getText())
      );
      answerContext.put(ctx, a);
   }

}
