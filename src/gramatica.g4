grammar gramatica;
r: (IDENTIFIER|NUMERIC_INTEGER_CONST|NUMERIC_REAL_CONST|STRING_CONST|COMENTARIOS)*;

IDENTIFIER:[a-zA-Z_][a-zA-Z0-9_]*;
NUMERIC_INTEGER_CONST:[+-]?[0-9]*;
NUMERIC_REAL_CONST:(PUNTO_FIJO|EXPONENCIAL|MIXTO)*;
STRING_CONST:('\''~[\r\n]*'\'' | '"'~[\r\n]*'"');

fragment
PUNTO_FIJO:[+-]?[0-9]*'.'[0-9]*;
fragment
EXPONENCIAL:[+-]?[0-9]*[eE][+-]?[0-9]*;
fragment
MIXTO:PUNTO_FIJO[eE][+-]?[0-9]*;

COMENTARIOS:('{'~[\r\n]*'}' | '(*'(~[*]|'*'+~[)*])*'*'+')') -> skip;
WS: [ \r\n\t]* -> skip;

prg : 'PROGRAM' IDENTIFIER ';' blq '.';
blq : dcllist 'BEGIN' sentlist 'END';
dcllist : dcl dcllist| ;
sentlist : sent sentlist1;
sentlist1 : sent sentlist1| ;
dcl : defcte | defvar | defproc | deffun;
defcte : 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' ctelist1;
ctelist1 : IDENTIFIER '=' simpvalue ';' ctelist1| ;
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
defvar : 'VAR' defvarlist;
defvarlist : varlist ':' tbas ';' defvarlist1;
defvarlist1 :  varlist ':' tbas defvarlist1| ;
varlist : IDENTIFIER varlist1;
varlist1 : ',' varlist | ;
defproc : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';';
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';';
formal_paramlist : '(' formal_param ')'| ;
formal_param : varlist ':' tbas formal_param1;
formal_param1 : ';' formal_param | ;
tbas : 'integer' | 'real';
sent : IDENTIFIER a|'IF' expcond 'THEN' blq 'ELSE' blq | 'WHILE' expcond 'DO' blq | 'REPEAT' blq 'UNTIL' expcond ';' | 'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq;
a : ':=' exp ';'| subpparamlist ';';
exp : factor exp1;
exp1 : op exp| ;
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : '(' explist ')'| ;
explist : exp explist1;
explist1 : ',' explist | ;
inc : 'TO' | 'DOWNTO';
expcond : factorcond expcond1;
expcond1 : oplog expcond| ;
oplog : 'OR' | 'AND';
factorcond : exp opcomp exp | '(' expcond ')' | 'NOT' factorcond | 'TRUE' | 'FALSE';
opcomp : '<' | '>' | '<=' | '>=' | '=';