// Defining our grammar to detect the correct syntax for the basic looping syntax specifications (while, for, do-while, break, continue) of the C.

grammar syntaxGrammar;


LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;

WHILE : 'while' ;
FOR : 'for' ;
DO : 'do' ;

EQUALS : '==' ;
NOTEQUALS : '!=' ;
AND : '&&' ;
OR : '||' ;
LT : '<' ;
LTE : '<=' ;
GT : '>' ;
GTE : '>=' ;

SEMI : ';' ;
INT : 'int' ;
FLOAT : 'float' ;
CHAR : 'char' ;
DOUBLE : 'double' ;

expression
    : atom 
    | ID
    | expression AND expression
    | expression OR expression 
    | expression EQUALS expression 
    | expression NOTEQUALS expression 
    | expression LT expression   
    | expression LTE expression    
    | expression GT expression   
    | expression GTE expression 
    ;

var 
    : INT
    | FLOAT
    | CHAR
    | DOUBLE
    ;
    
atom
    : DIGIT 
    | bool
    ;


DIGIT
    : [0-9]+
    ;

check
    : whileLoop
    | forLoop
    | doWhileLoop
    ;

whileLoop
    : WHILE LPAREN expression RPAREN LBRACE RBRACE
    ;

doWhileLoop
    : DO LBRACE RBRACE WHILE LPAREN expression RPAREN
    ;

forLoop
    : FOR LPAREN ID ' ' '=' ' ' DIGIT SEMI ' ' ID ' ' (LT | LTE | GT | GTE) ' ' DIGIT SEMI ' ' ID ' ' '=' ' 'ID ' ' SIGN ' ' DIGIT RPAREN LBRACE RBRACE
    ;

bool
    : TRUE
    | FALSE
    ;

TRUE
    : 'True'
    | 'true'
    ;

FALSE
    : 'False'
    | 'false'
    ;

BODY
    : WS
    | COMMENT
    | LINE_COMMENT
    | ID '=' ID
    | ID '=' DIGIT
    | ID '=' ID SIGN DIGIT
    ;

SIGN
    : '+'
    | '-'
    | '*'
    | '/'
    ;
ID
    : [a-zA-Z0-9]+
    ;

WS  
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
