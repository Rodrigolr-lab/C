import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ExecuteListener extends SetCalculatorBaseListener {
   Map<String, MySet<String>> vars = new HashMap<>();
   ParseTreeProperty<MySet<String>> ctxHelper = new ParseTreeProperty<>();

   // main
   @Override public void exitMain(SetCalculatorParser.MainContext ctx) {
      if (ctx.expr()!=null)
         System.out.println(String.format("result: %s", ctxHelper.get(ctx.expr())));
      else if (ctx.assign()!=null)
         System.out.println(String.format("result: %s", ctxHelper.get(ctx.assign())));
   }
   
   // expr
   @Override public void exitExprSetParentesis(SetCalculatorParser.ExprSetParentesisContext ctx) {
      ctxHelper.put(ctx, ctxHelper.get(ctx.expr()));
   }
   
   @Override public void exitExprDifference(SetCalculatorParser.ExprDifferenceContext ctx) {
      ctxHelper.put(ctx, MySet.<String>difference(ctxHelper.get(ctx.expr(0)), ctxHelper.get(ctx.expr(1))));
   }

   @Override public void exitExprInterseption(SetCalculatorParser.ExprInterseptionContext ctx) {
      ctxHelper.put(ctx, MySet.<String>intersept(ctxHelper.get(ctx.expr(0)), ctxHelper.get(ctx.expr(1))));
   }
   
   @Override public void exitExprUnion(SetCalculatorParser.ExprUnionContext ctx) {
      ctxHelper.put(ctx, MySet.<String>union(ctxHelper.get(ctx.expr(0)), ctxHelper.get(ctx.expr(1))));
   }

   @Override public void enterExprVarnameOp(SetCalculatorParser.ExprVarnameOpContext ctx) {
      MySet<String> s = vars.get(ctx.VARNAME().getText());
      ctxHelper.put(ctx, s);
      if (s==null){
         System.err.println(String.format("ERROR! Variable %s is being used before having been created!", ctx.VARNAME().getText()));
         System.exit(0);
      }
   }

   @Override public void exitExprSet(SetCalculatorParser.ExprSetContext ctx) {
      ctxHelper.put(ctx, ctxHelper.get(ctx.set()));
   }

   // assign
   @Override public void exitAssign(SetCalculatorParser.AssignContext ctx) {
      MySet<String> s = ctxHelper.get(ctx.set());
      vars.put(ctx.VARNAME().getText(), s);
      ctxHelper.put(ctx, s); 
   }

   // set
   @Override public void exitSet(SetCalculatorParser.SetContext ctx) {
      MySet<String> s = new MySet<String>();
      for (SetCalculatorParser.SetWordContext el:ctx.setWord()) {
         s.add(el.getText());
      }
      ctxHelper.put(ctx, s);
   }

}
