grammar Calculator;

program:
    stat* EOF;

stat:
    (expr|assignment)? NEWLINE;

assignment:
    ID '=' expr                     #ExprAtribution
    ;

expr:
    op=('+'|'-') expr               #ExprPosNeg
    | expr op=('*'|'/'|'%') expr    #ExprMultDivMod
    | expr op=('+'|'-') expr        #ExprAddSub
    | Integer                       #ExprInteger
    | '(' expr ')'                  #ExprParent
    | ID                            #ExprID
    ;

Integer: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
ID: [a-zA-Z_]+;
COMMENT: '#' .*? '\n' -> skip;