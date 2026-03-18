grammar first;

prog:	block* EOF ;

stat: expr #expr_stat
    | IF_kw '(' cond=expr ')' then=block  ('else' else=block)? #if_stat
    | WHILE '(' cond=expr ')' body=block    #while_stat
    | '>' expr #print_stat
    ;

block : stat #block_single
    | '{' block* '}' #block_real
    ;

expr:
        l=expr op=(MUL|DIV) r=expr #binOp
    |	l=expr op=(ADD|SUB) r=expr #binOp
    |   l=expr op=(GT|LT|GE|LE|EQ|NE) r=expr #relOp
    |   l=expr op=(AND|OR) r=expr #logicOp
    |   NOT expr #notOp
    |	INT #int_tok
    |   ID #var
    |	'(' expr ')' #pars
    | <assoc=right> ID '=' expr # assign
    ;

IF_kw : 'if' ;
WHILE : 'while' ;

DIV : '/' ;
MUL : '*' ;
SUB : '-' ;
ADD : '+' ;

GT  : '>' ;
LT  : '<' ;
GE  : '>=' ;
LE  : '<=' ;
EQ  : '==' ;
NE  : '!=' ;

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