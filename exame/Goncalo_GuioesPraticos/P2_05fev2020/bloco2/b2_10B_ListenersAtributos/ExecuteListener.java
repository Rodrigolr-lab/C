import java.util.*;

public class ExecuteListener extends SetCalculatorBaseListener {
   Map<String, MySet<String>> vars = new HashMap<>();

   // main
   @Override public void exitMain(SetCalculatorParser.MainContext ctx) {
      if (ctx.expr()!=null)
         System.out.println(String.format("result: %s", ctx.expr().s));
      else if (ctx.assign()!=null)
         System.out.println(String.format("result: %s", ctx.assign().s));
   }
   
   // expr
   @Override public void exitExprSetParentesis(SetCalculatorParser.ExprSetParentesisContext ctx) {
      ctx.s = ctx.expr().s;
   }
   
   @Override public void exitExprDifference(SetCalculatorParser.ExprDifferenceContext ctx) {
      ctx.s = MySet.<String>difference(ctx.expr(0).s, ctx.expr(1).s);
   }

   @Override public void exitExprInterseption(SetCalculatorParser.ExprInterseptionContext ctx) {
      ctx.s = MySet.<String>intersept(ctx.expr(0).s, ctx.expr(1).s);
   }
   
   @Override public void exitExprUnion(SetCalculatorParser.ExprUnionContext ctx) {
      ctx.s = MySet.<String>union(ctx.expr(0).s, ctx.expr(1).s);
   }

   @Override public void enterExprVarnameOp(SetCalculatorParser.ExprVarnameOpContext ctx) {
      ctx.s = vars.get(ctx.VARNAME().getText());
      if (ctx.s==null){
         System.err.println(String.format("ERROR! Variable %s is being used before having been created!", ctx.VARNAME().getText()));
         System.exit(0);
      }
   }

   @Override public void exitExprSet(SetCalculatorParser.ExprSetContext ctx) {
      ctx.s = ctx.set().s;
   }

   // assign
   @Override public void exitAssign(SetCalculatorParser.AssignContext ctx) {
      ctx.s = ctx.set().s; 
      vars.put(ctx.VARNAME().getText(), ctx.s); 
   }

   // set
   @Override public void exitSet(SetCalculatorParser.SetContext ctx) {
      ctx.s = new MySet<String>();
      for (SetCalculatorParser.SetWordContext el:ctx.setWord()) {
         ctx.s.add(el.getText());
      }
   }

}
