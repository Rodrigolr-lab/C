grammar Hello;

main: greetings* | EOF;
greetings: hello | bye;
hello: 'hello' name;
bye: 'bye' name;
name: ID+;

ID: [a-zA-ZçÇ]+;
WS: [ \t\r\n]+ -> skip;
