grammar Expression;

@header {
    package generated;
}

/// Parsers
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
declaration: type ID ('=' (arraySizeDeclaration | expression))?;
arraySizeDeclaration: 'new' type'[' expression ']';
returnStatement: 'return' expression;
assignment: (ID | arrayAccess) '='? expression;
arrayAccess: ID'[' expression ']';

controlStatement : ifStatement | whileStatement;

ifStatement: 'if' '(' expression ')' (block  | statement) elseStatement?;
elseStatement: 'else' ((block  | statement) | ifStatement);

whileStatement: 'while' '(' expression ')' (block | statement);

printStatement: ('print' | 'println') '(' expression ')';

// Refrence: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
expression : functionInvocation
    | '(' expression ')'
    | arrayAccess
    | ( ('-' | '!') ) expression // unary operation
    | expression ('/' | '*') expression // multiplicative
    | expression ('+' | '-') expression // additive
    | expression ('<' | '>') expression // relational
    | expression ('==' | '!=') expression // equality
    | expression '&&' expression // logical AND
    | expression '||' expression // logical OR
    | ID
    | lengthOperation
    | literals;

functionInvocation: ID '(' argumentList? ')';
argumentList: expression (',' expression)*;
lengthOperation: (STRING_LITERAL | ID) '.' 'length';

literals: INTEGER_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | CHAR_LITERAL | STRING_LITERAL | arrayLiterals;
arrayLiterals: '{' (expression (',' expression)*)? '}';

type: primitiveType | arrayType;
primitiveType: INT | FLOAT | BOOL | CHAR | STRING;
arrayType: INT '[]' | FLOAT '[]' | CHAR '[]';
returnType: type | VOID;

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
INTEGER_LITERAL : ('0' | [1-9] Digits ?);
FLOAT_LITERAL : '-' ? (Digits '.' Digits ? | '.' Digits);
BOOL_LITERAL: 'true' | 'false';
CHAR_LITERAL: '\'' ([a-zA-Z!.,?=:()] | WhiteSpace) ? '\'';
STRING_LITERAL: '"' ([a-zA-Z!.,?=:() ] | EscapedQuote | WhiteSpace)* '"';

// Identifiers
ID: Letter LetterOrDigit*;

// Fragment rules
fragment Digits: [0-9]* ([0-9]* [0-9])?;
fragment Letter: [a-zA-Z_];
fragment LetterOrDigit: Letter | [0-9];
fragment WhiteSpace: ' ';
fragment EscapedQuote: '\\"';
