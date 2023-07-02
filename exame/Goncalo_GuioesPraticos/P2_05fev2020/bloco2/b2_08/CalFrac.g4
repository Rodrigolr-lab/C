grammar CalFrac;

main: comando* EOF;

comando: ((atribuicao | instrucao) ';')? (ONELINECOMMENT|NEWLINE);

atribuicao: expr '->' ID;

instrucao: 'print' expr;

expr:
    '(' expr ')' '^' neg='-'? NUM   #ExprPow
    | '(' expr ')'                  #ExprParentesis
    | '-' expr                      #ExprNegative
    | NUM '/' NUM                   #ExprFrac
    | expr op=('+'|'-'|'*'|':') expr#ExprSumSubMult
    | NUM                           #ExprNum
    | 'reduce' expr                 #ExprReduce
    | 'read' STRING                 #ExprRead
    | ID                            #ExprID
    ;

STRING: '"' (. | ESCAPE )*? '"';
fragment ESCAPE: '\\"' | '\\\\';
NUM: [0-9]+;
ID: [a-zA-Z]+;
NEWLINE: '\r'? '\n';
WS: [ \t] -> skip;
ONELINECOMMENT: '//' .*? '\n';
MULTILINECOMMENT: '/*' .*? '*/' -> skip;