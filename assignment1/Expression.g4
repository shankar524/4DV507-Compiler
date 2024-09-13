// Grammar for OFP
grammar Expression;

@header {
    package generated;
}

// Parsers
start      : function+ EOF;
nonVoidTypes: INT | FLOAT | BOOL | STRING | CHAR;
returnType : nonVoidTypes | VOID;
function: returnType ID '(' paramList? ')' block;
paramList    : (param ',')* param;
param        : (INT | FLOAT | BOOL | STRING | CHAR ) ID;
block : '{' statement* '}';

statement : variableDeclaration | assignment | ifStatement | printStatement;
variableDeclaration: nonVoidTypes ID ('=' expression)? SEMICOLON;
assignment: ID '=' expression SEMICOLON;
ifStatement: 'if' '(' expression ')' (statement | block) elseStatement?;
elseStatement: 'else' (ifStatement | (block | statement ));
printStatement: ('print' | 'println') '('( (ID | literals)',' )* (ID | literals)')'SEMICOLON;
expression: '(' expression ')'
    | expression ('/' | '*') expression
    | expression ('+' | '-') expression
    | expression ( '<' | '>' | '==') expression
    | literals;
literals: numericLiterals | FLOAT_LITERAL | BOOL_LITERAL | CHAR_LITERAL | STRING_LITERAL;
numericLiterals: INTEGER_LITERAL | (STRING_LITERAL | ID)'.length';

// LEXERS
// Keywords

INT : 'int';
FLOAT : 'float';
BOOL : 'bool';
CHAR : 'char';
STRING : 'string';
VOID : 'void';


// Whitespace and comments

COMMENT     : '#' ~[\r\n]* -> skip;
WS	:	[ \t\r\n]+ -> skip ;


// Literals
SEMICOLON : ';';
INTEGER_LITERAL : ('0' | '-'?[1-9] Digits?);
FLOAT_LITERAL : '-'?(Digits '.' Digits? | '.' Digits);
BOOL_LITERAL: 'true' | 'false';
CHAR_LITERAL: '\'' . '\'';
STRING_LITERAL: '"' (ESC | ~["\\])* '"';

// Identifiers

ID: Letter LetterOrDigit*;

// Fragment rules

fragment Digits: [0-9] ([0-9_]* [0-9])?;
fragment Letter: [a-zA-Z_];
fragment LetterOrDigit: Letter | [0-9];
fragment ESC: '\\' [btnfr"\\];
