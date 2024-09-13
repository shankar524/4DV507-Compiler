// Grammar for OFP
grammar Expression;

@header {
    package generated;
}

// Parsers
start      : function+ EOF;
function: (INT | FLOAT | BOOL | STRING | CHAR | VOID) ID LPAREN paramList? RPAREN block;
paramList    : (param COMMA)* param;
param        : (INT | FLOAT | BOOL | STRING | CHAR ) ID;
block : LBRACE statement* RBRACE;

statement : variableDeclaration | assignment;

variableDeclaration: (INT | FLOAT | BOOL | STRING | CHAR | VOID) ID (EQUAL expression)? SEMICOLON;
assignment: ID ASSIGN expression SEMICOLON;

expression: INTEGER_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | CHAR_LITERAL | STRING_LITERAL;


// LEXERS
// Keywords

INT : 'int';
FLOAT : 'float';
BOOL : 'bool';
CHAR : 'char';
STRING : 'string';
VOID : 'void';
IF : 'if';
RETURN : 'return';
ELSE : 'else';
WHILE : 'while';
NEW : 'new';

// Literals

INTEGER_LITERAL : ('0' | SUB?[1-9] Digits?);
FLOAT_LITERAL : SUB?(Digits '.' Digits? | '.' Digits);
BOOL_LITERAL: 'true' | 'false';
CHAR_LITERAL: '\'' . '\'';
STRING_LITERAL: '"' (ESC | ~["\\])* '"';


// Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMICOLON   : ';';
COMMA  : ',';
DOT    : '.';

// Operators

ASSIGN   : '=';
GT       : '>';
LT       : '<';
EQUAL    : '==';
NOTEQUAL : '!=';
AND      : '&&';
OR       : '||';
INC      : '++';
DEC      : '--';
ADD      : '+';
SUB      : '-';
MUL      : '*';
DIV      : '/';
BITAND   : '&';
BITOR    : '|';
CARET    : '^';
MOD      : '%';
HASH	 : '#';

// Whitespace and comments

COMMENT     : HASH ~[\r\n]* -> skip;
WS	:	[ \t\r\n]+ -> skip ;


// Identifiers

ID: Letter LetterOrDigit*;

// Fragment rules

fragment Digits: [0-9] ([0-9_]* [0-9])?;
fragment Letter: [a-zA-Z_];
fragment LetterOrDigit: Letter | [0-9];
fragment ESC: '\\' [btnfr"\\];

