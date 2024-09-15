// Grammar for OFP
grammar Expression;

@header {
    package generated;
}

// ()
// |

// Parsers
start      : function+ EOF;
function: returnType ID '(' parameterList? ')' block;
parameterList: param (',' param)*;
param        : type ID;

block : '{' statement* '}';
statement: (declaration
            | returnStatement
            | printStatement
            | expression
            | assignment) ';'
        | controlStatement;

// Variable declaration
declaration: type ID ('=' (arrayInitialization | expression))?;
returnStatement: 'return' expression;
assignment: (ID | arrayItemAccess) '=' expression;

controlStatement : ifStatement | whileStatement;

ifStatement: 'if' '(' expression ')' (block  | statement) elseStatement?;
elseStatement: 'else' ((block  | statement) | ifStatement);

whileStatement: 'while' '(' expression ')' (block  | statement);

printStatement: PRINT_FUNCTION '(' expression ')';
expression : functionInvocation
    //| arrayItemAccess
    | '(' expression ')'
    | expression ('/' | '*') expression
    | expression ('+' | '-') expression
    | expression ('<' | '>' | '==') expression
    | expression ('&&' | '||') expression
    | '-' expression
    | arrayItemAccess
    | ID
    | lengthOperation
    | literals;

functionInvocation: ID '(' argumentList? ')';
argumentList: expression (',' expression)*;
arrayItemAccess: ID '[' expression ']';
lengthOperation: (STRING_LITERAL | ID)'.length';

literals: INTEGER_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | CHAR_LITERAL | STRING_LITERAL;
arrayLiteral:'{' (expression (',' expression)*)? '}';

arrayInitialization: 'new' arrayType '[' INTEGER_LITERAL ']' | arrayLiteral;

returnType: VOID | type;
arrayType: INT | FLOAT | CHAR;
type: INT | FLOAT | BOOL | CHAR | STRING | INT '[]' | FLOAT '[]' | CHAR '[]';

// LEXERS
// Keywords

INT : 'int';
FLOAT : 'float';
BOOL : 'bool';
CHAR : 'char';
STRING : 'string';
VOID : 'void';

PRINT_FUNCTION: 'print' | 'println';

// Whitespace and comments
COMMENT     : '#' ~[\r\n]* -> skip;
WS	:	[ \t\r\n]+ -> skip ;


// Literals
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