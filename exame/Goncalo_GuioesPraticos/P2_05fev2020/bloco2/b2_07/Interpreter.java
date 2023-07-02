import java.util.HashMap;

public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      if(ctx.expr()!=null){
         Double value = visit(ctx.expr());
         if(value!=null)
            System.out.println(String.format("%.2f", value));
      }
      else if (ctx.assignment()!=null)
         visit(ctx.assignment());
      System.out.println();
      return null;
   }

   //assignment
   @Override public Double visitExprAtribution(CalculatorParser.ExprAtributionContext ctx){
      System.out.print(String.format("%s = ", ctx.ID().getText()));
      visit(ctx.expr());
      return null;
   }
	
	@Override public Double visitExprID(CalculatorParser.ExprIDContext ctx){
      System.out.print(ctx.ID().getText() + " ");
      return null;
   }

   //expr
   @Override public Double visitExprPosNeg(CalculatorParser.ExprPosNegContext ctx){
      visit(ctx.expr());
      System.out.print("!" + ctx.op.getText() + " ");
      return null;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.print(ctx.op.getText()+ " ");
      return null;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      visit(ctx.expr());
      return null;
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      System.out.print(ctx.Integer().getText()+ " ");
      return null;
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.print(ctx.op.getText()+ " ");
      return null;
   }
}
