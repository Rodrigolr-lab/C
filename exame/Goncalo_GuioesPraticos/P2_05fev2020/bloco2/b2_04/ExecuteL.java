import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ExecuteL extends CalculatorBaseListener {
   ParseTreeProperty<Double> map = new ParseTreeProperty<>();

   @Override public void exitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr()!=null)
         System.out.println(String.format("Result: %.2f", map.get(ctx.expr())));
   }

   @Override public void exitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double n1 = map.get(ctx.expr(0));
      Double n2 = map.get(ctx.expr(1));
      Double result = null;
      switch(ctx.op.getText()){
         case "+":
            result = n1 + n2;
            break;
         case "-":
            result = n1 - n2;
            break;
      }
      if (result!=null)
         map.put(ctx, result);
   }

   @Override public void exitExprParent(CalculatorParser.ExprParentContext ctx) {
      map.put(ctx, map.get(ctx.expr()));
   }

   @Override public void exitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      map.put(ctx, Double.parseDouble(ctx.Integer().getText()));
   }

   @Override public void exitExprPosNeg(CalculatorParser.ExprPosNegContext ctx) {
      Double result = map.get(ctx.expr());
      if (result!=null) {
         if (ctx.op.getText().equals("+"))
            map.put(ctx, result);
         else
            map.put(ctx, -1.0*result);
      }
   }

   @Override public void exitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double n1 = map.get(ctx.expr(0));
      Double n2 = map.get(ctx.expr(1));
      Double result = null;
      switch(ctx.op.getText()){
         case "*":
            result = n1 * n2;
            break;
         case "/":
            result = n1 / n2;
            break;
         case "%":
            result = n1 % n2;
            break;
      }
      if (result!=null)
         map.put(ctx, result);
   }

}
