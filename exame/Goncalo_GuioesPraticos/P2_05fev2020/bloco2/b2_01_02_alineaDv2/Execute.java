import org.antlr.v4.runtime.tree.TerminalNode;

public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitHello(HelloParser.HelloContext ctx) {
      System.out.println(String.format(">Olá %s! Tudo bem contigo?", visit(ctx.name())));
      return null;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      System.out.println(String.format(">Adeus %s! Até à próxima!", visit(ctx.name())));
      return null;
   }

   @Override public String visitName(HelloParser.NameContext ctx) {
      StringBuilder str = new StringBuilder();
      for(TerminalNode name:ctx.ID()){
         str.append(name);
         str.append(' ');
      }
      return str.toString();
   }
}
