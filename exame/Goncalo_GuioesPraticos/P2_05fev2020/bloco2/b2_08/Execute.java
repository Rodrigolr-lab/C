import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Execute extends CalFracBaseVisitor<Fraction> {

   private HashMap<String,Fraction> vars = new HashMap<>();

   @Override public Fraction visitAtribuicao(CalFracParser.AtribuicaoContext ctx) {
      String varname = ctx.ID().getText();
      Fraction varvalue = visit(ctx.expr());
      vars.put(varname, varvalue);
      return null;
   }

   @Override public Fraction visitInstrucao(CalFracParser.InstrucaoContext ctx) {
      Fraction result = visit(ctx.expr());
      if (result!=null)
         System.out.println(result.toString());
      return null;
   }

   @Override public Fraction visitExprPow(CalFracParser.ExprPowContext ctx) { 
      Fraction f = visit(ctx.expr());
      Fraction powed = new Fraction(f);
      Integer pow = Integer.parseInt(ctx.NUM().getText());
      for(int a=0; a<pow-1; a++)
         powed = powed.multiply(f);
      if (ctx.neg!=null)
         return powed.invert();
      return powed;
   }

   @Override public Fraction visitExprParentesis(CalFracParser.ExprParentesisContext ctx) { 
      return visit(ctx.expr()); 
   }

   @Override public Fraction visitExprNegative(CalFracParser.ExprNegativeContext ctx) {
      return visit(ctx.expr()).multiply(new Fraction(-1));
   }

   @Override public Fraction visitExprFrac(CalFracParser.ExprFracContext ctx) {
      int numerador = Integer.parseInt(ctx.NUM(0).getText());
      int denominador = Integer.parseInt(ctx.NUM(1).getText());
      return new Fraction(numerador, denominador);
   }

   @Override public Fraction visitExprSumSubMult(CalFracParser.ExprSumSubMultContext ctx) {
      Fraction f1 = visit(ctx.expr(0));
      Fraction f2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch(op){
         case "*":
            return  f1.multiply(f2);
         case ":":
            return  f1.divide(f2);
         case "+":
            return f1.add(f2);
         case "-":
            return f1.subtract(f2);
      }
      return null;
   }

   @Override public Fraction visitExprNum(CalFracParser.ExprNumContext ctx) {
      return new Fraction (Integer.parseInt(ctx.NUM().getText()));
   }

   @Override public Fraction visitExprReduce(CalFracParser.ExprReduceContext ctx) { 
      Fraction f = visit(ctx.expr());
      f.reduce();
      return f;
   }

   @Override public Fraction visitExprID(CalFracParser.ExprIDContext ctx) {
      String varname = ctx.ID().getText();
      Fraction varvalue = vars.get(varname);
      if (varvalue==null)
         System.out.println(String.format("ERRO! Variável '%s' a ser utilizada antes de declarada!", varname));
      return varvalue;
   }

   @Override public Fraction visitExprRead(CalFracParser.ExprReadContext ctx) { 
      Scanner sc = null;
      //sc = new Scanner(System.in); Dá erro, pois há conflito entre o input de dados no antlr4 e o Scanner
      try {
         sc = new Scanner(new File("/dev/tty"));
      } catch (FileNotFoundException e){
         System.err.println("Error! Can not read from terminal!!");
         System.exit(0);
      }
      System.out.print(String.format("Insert value for variable %s: ", ctx.STRING().getText()));
      String str = sc.nextLine();
      //Does not read until 
      sc.close();
      String [] fr = str.split("/");
      return new Fraction(Integer.parseInt(fr[0]), Integer.parseInt(fr[1]));
   }
}
