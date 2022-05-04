grammar gramatica;

@parser::header{
    import java.io.PrintWriter;
    import java.io.FileWriter;
}
@parser:: members{
    private cNombreInput nombre;
    private PrintWriter fichHtml=null;
    public gramaticaParser(TokenStream input, cNombreInput n ){
        this(input);
        nombre = n;
        try{
            fichHtml = new PrintWriter(new FileWriter("./"+ nombre.getNombreInput() + ".html"));
            fichHtml.flush();
            }catch(Exception e){
                e.printStackTrace();
                }
     }

    public PrintWriter getOutput(){
                return fichHtml;
        }

}
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

prg : 'PROGRAM' IDENTIFIER ';' blq '.'
{fichHtml.println("<!DOCTYPE HTML><HTML><TITLE>"+nombre.getNombreInput()+"</TITLE><BODY> <A NAME =\"Inicio\"><H1> Programa: "+ nombre.getNombreInput() +"</H1><H2>Funciones y Procedimientos</H2></A><UL>" + $blq.bloque.imprimeGeneral()+"</BODY></HTML>");
 fichHtml.flush();
};
blq: dcllist 'BEGIN' sentlist 'END'{

};

dcllist:
       dcl dcllist {}
       | {};
sentlist: sent sentlist1{};
sentlist1:
    sent sentlist1 {}
    | {};

dcl :
    defcte {}
    | defvar {}
    | defproc {}
    | deffun {}
    ;

defcte: 'CONST' ctelist{};

ctelist: IDENTIFIER '=' simpvalue ';' ctelist1{

};

ctelist1 :
          IDENTIFIER '=' simpvalue ';' ctelist1 {}
          | {};

simpvalue returns [String v] :
        NUMERIC_INTEGER_CONST {$v = "<SPAN CLASS=\"cte\">" + $NUMERIC_INTEGER_CONST.text + "</SPAN>";}
        | NUMERIC_REAL_CONST {$v = "<SPAN CLASS=\"cte\">" + $NUMERIC_REAL_CONST.text + "</SPAN>";}
        | STRING_CONST {$v = "<SPAN CLASS=\"cte\">" + $STRING_CONST.text + "</SPAN>";}
        ;

defvar : 'VAR' defvarlist {};
defvarlist : varlist ':' tbas ';' defvarlist1{


                                                           };
defvarlist1 :
            varlist ':' tbas defvarlist1 {

            }
            | {}
            ;
varlist : IDENTIFIER varlist1{

                };
varlist1:
           ',' varlist {

                    }
           | {
             }
           ;

defproc  : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';'{

};
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';'{

};


formal_paramlist returns[String expr]:
            '(' formal_param ')'{

              }
             | {}
             ;
formal_param : varlist ':' tbas formal_param1{};

formal_param1:
            ';' formal_param {

                    }
            | {};


tbas returns[String t]:
    'integer' {$t = "integer";}
    | 'real' {$t = "real";}
    ;
sent :
    IDENTIFIER a{}
    |'IF' expcond 'THEN' blq 'ELSE' blq { }
    | 'WHILE' expcond 'DO' blq {}
    | 'REPEAT' blq 'UNTIL' expcond ';'{}
    | 'FOR' IDENTIFIER ':=' expe1=exp inc expe2=exp 'DO' blq {}
    ;

a:
    ':=' exp ';' {}
    | subpparamlist ';' {

                        }
    ;

exp : factor exp1{};

exp1 :
    op exp {}
    | {}
    ;

op returns[String opa]:
    '+' {$opa = " + ";}
   | '-' {$opa = " - ";}
   | '*' {$opa = " * ";}
   | 'DIV' {$opa = " DIV ";}
   | 'MOD' {$opa = " MOD ";}
   ;
factor:
        simpvalue {}
        | '(' exp ')' {}
        | IDENTIFIER subpparamlist {
         }
        ;
subpparamlist:
        '(' explist ')' {}
         | {}
         ;
explist: exp explist1{


};

explist1:
        ',' explist{}
        | {}
        ;
inc returns[String incr]:
    'TO' {$incr = "<SPAN CLASS = \"palres\"> TO </SPAN>";}
    | 'DOWNTO' {$incr = "<SPAN CLASS = \"palres\"> DOWNTO </SPAN>";}
    ;
expcond returns[String v] : factorcond expcond1[$factorcond.v]{$v = $expcond1.v;};

expcond1[String fc] returns[String v]:
        oplog expcond {$v = $fc + $oplog.opl + $expcond.v;}
        |  {$v = $fc;}
        ;
oplog returns[String opl]:
    'OR' {$opl ="<SPAN CLASS = \"palres\"> OR </SPAN>"; }
    | 'AND' {$opl = "<SPAN CLASS = \"palres\"> AND </SPAN>";}
    ;
factorcond returns[String v]:
    expe1=exp opcomp expe2=exp {$v = $expe1.v + $opcomp.opc + $expe2.v;}
    | '(' expcond ')' {$v = "("+ $expcond.v +")";}
    | 'NOT' factorcond {$v = "<SPAN CLASS = \"palres\"> NOT </SPAN>" + $factorcond.v;}
    | 'TRUE' {$v = "<SPAN CLASS = \"palres\"> TRUE </SPAN>";}
    | 'FALSE' {$v = "<SPAN CLASS = \"palres\"> FALSE </SPAN>";}
    ;
opcomp returns[String opc] :
    '<' {$opc = " < ";}
    | '>' {$opc = " > ";}
    | '<=' {$opc = " <= ";}
    | '>=' {$opc = " >= ";}
    | '=' {$opc = " = ";}
    ;