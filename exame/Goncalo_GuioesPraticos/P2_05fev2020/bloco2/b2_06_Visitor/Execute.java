import java.util.*;

public class Execute extends Java8ParserBaseVisitor<String> {

   //Compile
   //a4main -i Java8Parser compilationUnit -visitor Execute

   @Override public String visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
      // Class declaration
      //   classModifier* 'class' Identifier typeParameters? superclass? superinterfaces? classBody
      String className = ctx.Identifier().getText();
      List<Java8Parser.ClassModifierContext> modifiers = ctx.classModifier();      
      System.out.println("---------------------------");
      System.out.println(
         String.format(
            "Declared a new class called '%s', with %d modifier(s).",
            className,
            modifiers.size()
         )
      );
      System.out.println("The methods defined inside it are:");
      return visitChildren(ctx);
   }

   @Override public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
      // Method declaration
      //   methodModifier* methodHeader methodBody
      System.out.println(
         String.format(
            "> '%s', with %d modifiers",
            visit(ctx.methodHeader()),
            ctx.methodModifier().size()
         )
      );
      return visitChildren(ctx);
   }

   @Override public String visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
      // Method header declaration
      //   result methodDeclarator throws_?
	   // | typeParameters annotation* result methodDeclarator throws_?
      if (ctx.methodDeclarator()!=null)
         return visit(ctx.methodDeclarator());
      return visitChildren(ctx);
   }

   @Override public String visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
      // Method declarator (finally!)
      //   Identifier '(' formalParameterList? ')' dims?
      return ctx.Identifier().getText();
      //return visitChildren(ctx);
   }

}
