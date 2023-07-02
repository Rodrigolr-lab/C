public class MyVisitorHelloBye extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitHello(HelloParser.HelloContext ctx) {
      System.out.println(String.format(">Olá %s! Como estás?", ctx.ID()));
      System.out.println(String.format("\t>>ctx.ID() is of type %s", ctx.ID().getClass()));
      System.out.println(String.format("\t>>Foram dados %d nomes", ctx.ID().size()));
      System.out.println(String.format("\t>>Primeiro nome é %s", ctx.ID(0)));
      System.out.println(String.format("\t>>Primeiro nome é %s", ctx.ID().get(0))); //Similar way
      return visitChildren(ctx);
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      System.out.println(String.format(">Adeus %s, até breve!", ctx.ID()));
      System.out.println(String.format("\t>>ctx.ID() is of type %s", ctx.ID().getClass()));
      return visitChildren(ctx);
   }
}