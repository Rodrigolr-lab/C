grammar SetCalculator;

@header {
    import java.util.*;
}

@members {
    Map<String, MySet<String>> vars = new HashMap<>();
}

// Sintatic rules
prog: (main? '\n')* EOF;

main: e=expr
    { System.out.println(String.format("result: %s", $e.s)); }
    | a=assign
    { System.out.println(String.format("result: %s", $a.s)); }
    ; 

expr returns[MySet<String> s]: 
    '(' e=expr ')'
    { $s = $e.s; }                      #ExprSetParentesis
    | s1=expr '\\' s2=expr         
    { 
        $s = MySet.<String>difference($s1.s, $s2.s);
    }                                   #ExprDifference
    | s1=expr '&' s2=expr         
    { 
        $s = MySet.<String>intersept($s1.s, $s2.s);
    }                                   #ExprInterseption
    | s1=expr '+' s2=expr         
    { 
        $s = MySet.<String>union($s1.s, $s2.s);
    }                                   #ExprUnion
    | VARNAME
    {
        $s = vars.get($VARNAME.text);
        if ($s==null){
            System.err.println(String.format("ERROR! Variable %s is being used before having been created!", $VARNAME.text));
            System.exit(0);
        }
    }                                   #ExprVarnameOp
    | se=set                            
    { $s = $se.s; }                     #ExprSet
    ;

assign returns[MySet<String> s]: VARNAME '=' se=set
    {
        $s = $se.s; 
        vars.put($VARNAME.text, $s); 
    }
    ;

set returns[MySet<String> s]: 
    '{' (setWord ',')* setWord? '}'
    { 
        $s = new MySet<String>();
        for (SetWordContext el:$ctx.setWord()) {
            $s.add(el.getText());    
        }
    }
    ;

setWord returns [String str]: 
    STRING
    | ('+'|'-')? INT
    ;

// Lexic rules
STRING: [a-z]+;
INT: [0-9]+;
VARNAME: [A-Z]+;
WS: [ \t] -> skip;
COMMENT: '--' .*? '\n' -> skip;