grammar SetCalculator;

// Sintatic rules
prog: (main? '\n')* EOF;

main: expr
    | assign
    ; 

expr: 
    '(' expr ')'                        #ExprSetParentesis
    | expr '\\' expr                    #ExprDifference
    | expr '&' expr                     #ExprInterseption
    | expr '+' expr                     #ExprUnion
    | VARNAME                           #ExprVarnameOp
    | set                               #ExprSet
    ;

assign: VARNAME '=' set;

set returns[MySet s]: '{' (setWord ',')* setWord? '}';

setWord: 
    STRING
    | ('+'|'-')? INT
    ;

// Lexic rules
STRING: [a-z]+;
INT: [0-9]+;
VARNAME: [A-Z]+;
WS: [ \t] -> skip;
COMMENT: '--' .*? '\n' -> skip;