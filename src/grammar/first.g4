grammar first;

prog:	stat* EOF ;

stat:  IF_kw '(' cond=expr ')' then=block  ('else' else=block)? #if_stat
    | ID '(' paramList ')' block #funcDef
    | expr #expr_stat
    | '>' expr #print_stat
    ;

block : stat #block_single
    | '{' block* '}' #block_real
    ;

expr:
        l=expr op=(MUL|DIV) r=expr #binOp
    |	l=expr op=(ADD|SUB) r=expr #binOp
    |	INT #int_tok
    |   ID '(' argList? ')' #funcCall
    |   ID #var
    |	'(' expr ')' #pars
    | <assoc=right> ID '=' expr # assign
    ;

paramList : ID (',' ID)* ;

argList   : expr (',' expr)* ;

IF_kw : 'if' ;

DIV : '/' ;
MUL : '*' ;
SUB : '-' ;
ADD : '+' ;

AND : '&&' ;
OR  : '||' ;
NOT : '!' ;

//NEWLINE : [\r\n]+ -> skip;
NEWLINE : [\r\n]+ -> channel(HIDDEN);

//WS : [ \t]+ -> skip ;
WS : [ \t]+ -> channel(HIDDEN) ;

INT     : [0-9]+ ;


ID : [a-zA-Z_][a-zA-Z0-9_]* ;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;