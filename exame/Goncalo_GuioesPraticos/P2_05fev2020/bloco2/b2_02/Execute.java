public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   //This method is optional. Without it, everything would work exactly the same
   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      //If expression is given, visit it and compute result, otherwise, nothing to be done
      if (ctx.expr()!=null)
         System.out.println(String.format("Result: %.2f", visit(ctx.expr())));
      return null;
   }


   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      //Get elements that compose the expression values
      String op = ctx.op.getText();
      Double n1 = visit(ctx.expr(0));
      Double n2 = visit(ctx.expr(1));
      //Compute result
      Double result = null;
      switch(op){
         case "+":
            result = n1 + n2;
            break;
         case "*":
            result = n1 * n2;
            break;
         case "-":
            result = n1 - n2;
            break;
         case "/":
            result = n1 / n2;
            break;     
      }
      //Return
      return result;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }
   
}
