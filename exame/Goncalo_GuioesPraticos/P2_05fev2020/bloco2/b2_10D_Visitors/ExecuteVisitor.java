import java.util.*;

public class ExecuteVisitor extends SetCalculatorBaseVisitor<MySet<String>> {
   Map<String, MySet<String>> vars = new HashMap<>();

   // main
   @Override public MySet<String> visitMain(SetCalculatorParser.MainContext ctx) {
      System.out.println(String.format("result: %s", visitChildren(ctx)));
      return null;
   }

   // expr
   @Override public MySet<String> visitExprSetParentesis(SetCalculatorParser.ExprSetParentesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public MySet<String> visitExprDifference(SetCalculatorParser.ExprDifferenceContext ctx) {
      MySet<String> s1 = visit(ctx.expr(0));
      MySet<String> s2 = visit(ctx.expr(1));
      return MySet.<String>difference(s1, s2);
   }

   @Override public MySet<String> visitExprInterseption(SetCalculatorParser.ExprInterseptionContext ctx) {
      MySet<String> s1 = visit(ctx.expr(0));
      MySet<String> s2 = visit(ctx.expr(1));
      return MySet.<String>intersept(s1, s2);
   }

   @Override public MySet<String> visitExprUnion(SetCalculatorParser.ExprUnionContext ctx) {
      MySet<String> s1 = visit(ctx.expr(0));
      MySet<String> s2 = visit(ctx.expr(1));
      return MySet.<String>union(s1, s2);
   }

   @Override public MySet<String> visitExprVarnameOp(SetCalculatorParser.ExprVarnameOpContext ctx) {
      MySet<String> s = vars.get(ctx.VARNAME().getText());
      if (s==null){
         System.err.println(String.format("ERROR! Variable %s is being used before having been created!", ctx.VARNAME().getText()));
         System.exit(0);
      }
      return s;
   }

   // assign
   @Override public MySet<String> visitAssign(SetCalculatorParser.AssignContext ctx) {
      MySet<String> s = visit(ctx.set());
      vars.put(ctx.VARNAME().getText(), s);
      return s;
   }

   @Override public MySet<String> visitSet(SetCalculatorParser.SetContext ctx) {
      MySet<String> s = new MySet<String>();
      for (SetCalculatorParser.SetWordContext el:ctx.setWord()) {
         s.add(el.getText());
      }
      return s;
   }
}
