grammar questions;

prog: main* EOF;

main: question? '\n';

question: ID '(' q=STRING ')' '{' '\n' answer+ '}';

answer: STRING ':' INTEGER ';' '\n';

STRING: '"' (ESC|.)*? '"';
ESC: '\\"' | '\\\\';

INTEGER: [0-9]+;

ID: [A-Za-z0-9.]+;


COMMENT: ('#' (.)*? '\n' | '/*' (.)*? '*/') -> skip;
WS: [ \t] -> skip;