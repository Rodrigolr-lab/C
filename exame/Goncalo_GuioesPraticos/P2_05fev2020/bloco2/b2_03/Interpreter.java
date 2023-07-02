public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      if(ctx.expr()!=null)
         System.out.println(String.format("Result: %.2f", visit(ctx.expr())));
      return null;
   }

   @Override public Double visitExprPosNeg(CalculatorParser.ExprPosNegContext ctx){
      //Initialize variables
      Double n = visit(ctx.expr());
      String sign = ctx.op.getText();
      Double result = null;
      //Get number value
      switch(sign){
         case ("+"):
            result=n;
            break;
         case("-"):
            result=-1.0*n;
            break;
      }
      return result;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      //Initialize variables
      Double n1 = visit(ctx.expr(0));
      Double n2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double result = null;
      //Compute result
      switch(op){
         case("+"):
            result = n1 + n2;
            break;
         case("-"):
            result = n1 - n2;
            break;
      }
      //Return
      return result;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Double.parseDouble(ctx.Integer().getText());
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      //Initialize variables
      Double n1 = visit(ctx.expr(0));
      Double n2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double result = null;
      //Compute result
      switch(op){
         case("*"):
            result = n1 * n2;
            break;
         case("/"):
            result = n1 / n2;
            break;
         case("%"):
            result = n1 % n2;
            break;
      }
      //Return
      return result;
   }
}
