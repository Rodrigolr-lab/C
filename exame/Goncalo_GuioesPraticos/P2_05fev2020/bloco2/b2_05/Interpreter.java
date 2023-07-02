import java.util.HashMap;

public class Interpreter extends CalculatorBaseVisitor<Double> {

   private HashMap<String,Double> vars = new HashMap<String,Double>();

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      if(ctx.expr()!=null){
         Double value = visit(ctx.expr());
         if(value!=null)
            System.out.println(String.format("%.2f", value));
      }
      else if (ctx.assignment()!=null)
         visit(ctx.assignment());
      return null;
   }

   //assignment
   @Override public Double visitExprAtribution(CalculatorParser.ExprAtributionContext ctx){
      String name = ctx.ID().getText();
      Double value = visit(ctx.expr());
      if(value!=null)
         vars.put(name, value);
      return null;
   }
	
	@Override public Double visitExprID(CalculatorParser.ExprIDContext ctx){
      String name = ctx.ID().getText();
      Double value = vars.get(name);
      if(value==null)
         System.out.println(String.format("ERROR! Variable '%s' hasn't been declared yet!", name));
      return value;
   }

   //expr
   @Override public Double visitExprPosNeg(CalculatorParser.ExprPosNegContext ctx){
      //Initialize variables
      Double n = visit(ctx.expr());
      String sign = ctx.op.getText();
      Double result = null;
      //Get number value
      if(n!=null){
         switch(sign){
            case ("+"):
               result=n;
               break;
            case("-"):
               result=-1.0*n;
               break;
         }
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
      if(n1!=null && n2!=null){
         switch(op){
            case("+"):
               result = n1 + n2;
               break;
            case("-"):
               result = n1 - n2;
               break;
         }
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
      if(n1!=null && n2!=null){
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
      }
      //Return
      return result;
   }
}
