public class ExecuteL extends Java8ParserBaseListener {

   @Override public void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
      System.out.println("-------------------------------");
      System.out.println(
         String.format(
            "New class declaration! It is called '%s'",
            ctx.Identifier().getText()
         )
      );
   }

   @Override public void exitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
      // Class declaration
      //   classModifier* 'class' Identifier typeParameters? superclass? superinterfaces? classBody
      System.out.println("-------------------------------");
   }

   @Override public void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
      // Method declaration
      //   methodModifier* methodHeader methodBody
      System.out.println(
         String.format(
            ">'%s', with %d modifiers",
            ctx.methodHeader().nomeMetodo,
            ctx.methodModifier().size()
         )
      );
   }

   @Override public void exitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
      // Method header declaration
      //   result methodDeclarator throws_?
      // | typeParameters annotation* result methodDeclarator throws_?
      if (ctx.methodDeclarator()!=null)
         ctx.nomeMetodo = ctx.methodDeclarator().nomeMetodo;
      else
         ctx.nomeMetodo = "";
         
   }

   @Override public void exitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
      // Method declarator (finally!)
      //   Identifier '(' formalParameterList? ')' dims?
      ctx.nomeMetodo = ctx.Identifier().getText();
   }

}
