grammar Hello;

greetings: hello | bye;
hello: 'hello' ID+;
bye: 'bye' ID;

ID: [a-zA-ZçÇ]+;
WS: [ \t\r\n]+ -> skip;
