/**
 * Define a grammar called Expressions
 */
grammar myGrammar;


@header {    // Define name of package for generated Java files.
    package generated;
}

start : 'program' ID '{' decl* stmt* '}';

decl : 'int' ID ('=' expr)? ';';

stmt : expr ';'
    | assign
    | 'while' '(' expr ')' block
    | 'if' '(' expr ')' block elseStmt?
    | 'print' '(' expr')';

block : '{' stmt+ '}';

elseStmt : 'else' block;

assign : ID '=' expr;

expr : '(' expr ')'
    | expr ('/' | '*') expr // NOTE: ADDING OPERATOR HERE GIVES MORE PRIORITY OVER ADDITION AND SUBSTRACTION
    | expr ('+' | '-') expr
    | expr ( '<' | '>' | '==') expr
    | (INT | ID | BOOL);

INT : '0'
    | '-'?('1'..'9')+;

ID : [A-Z]+[0-9A-Z]*;

BOOL : 'true' | 'false';
