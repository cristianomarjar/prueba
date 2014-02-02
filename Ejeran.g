grammar Ejer;
options{backtrack=true;} 
@header {
	import java.util.HashMap;
}

@members{
	public void displayRecognitionError(String[] tokenNames, RecognitionException e){    
   String hdr = getErrorHeader(e);  
   String msg = getErrorMessage(e, tokenNames);    
   System.out.println("Que te fijes!!!: " + hdr + " " + msg) ;
}
HashMap memory = new HashMap();
}

//----------------Clases----------------
inicio		:	'clase' ModificadorDeAcceso  ID '{'(declaraciones|metodo)*'}'  ;

//--------------Metodos----------------
metodo		:	ModificadorDeAcceso (tipoEnt|tipoFlot|tipoString) ID '(' argumentos* ')' '{'instrucciones+'}'  ;

//------------Cuerpo Metodos-------------
argumentos	:	(declInt|declFlot|declString) (',' (declInt|declFlot|declString))* 				;

//-------------Instrucciones general----------
instrucciones:	declaraciones |asignacion | cambiar | ciclos | ifelse | ret | sis | bloque ; 

//---------------Switch (Cambiar)--------------
cambiar		:	'cambio''(' expr')' '{' ('caso' (ID ':' ID'(''"'ID'"'')' ';' instrucciones* 'romper' ';')+ 
										('predeterminado' ':' ID'(''"'ID'"'')' ';' (instrucciones | cond)* 'romper' ';')?'}') ;
//---------------Ciclos General-----------------
ciclos		:	para | while1 	;

//-----------------Condicional IFELSE------------
ifelse		:	'si' cond 'entonces' (cuerpo|instrucciones) ('contrario' (cuerpo|instrucciones))? ;

//----------------Return-----------------
ret		: 'retorno' atomo ';' ;

//----------------System-------------------
sis			 : ID (P ID)*  ('('   mExpr? ')' )? ';'  ;

P 			: '.'				;

//---------------Ciclos FOR-------------------
para		:	'ciclo' '(' asignacion eRR ';' ID ('++'|'--'|asignacion) ')' '{' (instrucciones)* '}' ; 

//----------------Ciclos WHILE ----------------
while1		:	'mientras' (cond) '{' (instrucciones)*  '}'  ;

//----------------CUERPO IF-----------------
cuerpo		:	'{'instrucciones*'}'				;

//----------------Condicional reglas----------------

cond        :	'(' e ')' | eR          		  	;

e           :	cond (('y'|'o' ) cond )*  			;

eR          :	'(' atomo OPrelacional atomo ')'  	;


eRR			:	atomo OPrelacional atomo ;

//----------------Operadores Relacionales (Ciclos,Condicional)---------

OPrelacional:	'==' | '<=' | '!=' | '>=' | '<' | '>' ; 

//--------------Try Catch-----------------------------------
bloque		:	'intentar' cuerpo catche+ ( 'finally' cuerpo )* ;
						
catche		:	'captura' '(' exepcion 'e' ')' cuerpo;

exepcion	:	'Exception'|'NullReferenceException'|'RuntimeException';

//-----------------DECLARACIONES----------------------								
declaraciones: declInt | declFlot | declString	;

declInt: tipoEnt t1=ID { System.out.println("var int: "+$t1.text); memory.put($t1.text, new Integer(1));  } 
		(','  t2=ID { System.out.println("var int: "+$t2.text); memory.put($t2.text, new Integer(1));  })*     ';'?			;

declFlot: tipoFlot t1=ID { System.out.println("var flot: "+$t1.text); memory.put($t1.text, new Integer(2));  } 
		(','  t2=ID { System.out.println("var flot: "+$t2.text); memory.put($t2.text, new Integer(2));  })*     ';'?			;
		
declString: tipoString t1=ID { System.out.println("var string: "+$t1.text); memory.put($t1.text, new Integer(3));  } 
		(','  t2=ID { System.out.println("var string: "+$t2.text); memory.put($t2.text, new Integer(3));  })*     ';'?			;
		
asignacion: ID '=' expr ';'	{Integer t= (Integer)memory.get($ID.text);
                             if (t==null) System.out.println("Variable no declarada: " +$ID.text); 
							 else {int tipoexpr=$expr.valor; 
								if (t.intValue()!=tipoexpr) 
								System.out.println("Error de tipos en asignacion: "+$ID.text + "=" + $expr.text);} }			;

expr returns [int valor]: t1 = mExpr {$valor=$t1.valor;} (('+'|'-') t2 = mExpr {if ($t1.valor!=$t2.valor){System.out.println
							("Error de tipos: " +$t1.text+ " + o - " +$t2.text); $valor=3;} else {$valor=$t1.valor;}})*			;

mExpr returns [int valor]: t1 = atomo {$valor=$t1.valor;} ('*' t2=atomo{if ($t1.valor!=$t2.valor){System.out.println
							("Error de tipos: " +$t1.text+ " * " +$t2.text); $valor=3;} else {$valor=$t1.valor;}})*			;
							
atomo returns [int valor]: msg |ENT {$valor = 1;} | FLOT {$valor = 2;} | STRI {$valor = 4;} | ID {Integer t = (Integer)memory.get($ID.text);
						  if(t==null)System.out.println("Variable no declarada: "+ $ID.text); else $valor = t.intValue();} 
						  | '(' expr ')' {$valor = $expr.valor;} ;
		
ModificadorDeAcceso: ('publica'|'publico')|('privada'|'privado')|('protegida'|'protegido')                ;

tipoEnt		:	'entero' ;
tipoFlot	:	'flotante';
tipoString	:	'cadena';

msg: '"'ID'"' (p2 '"'ID'"'  | p2 ID '.' ID )* | ID '.' ID (p2 '"'ID'"'  | p2 ID '.' ID )* ;


p2: '+';

ID: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*   ; 
STRI:('a'..'z')*;
ENT: ('0'..'9') +	;
FLOT: ('0'..'9')+ '.' ('0'..'9')+	;




WS  : (' ' | '\n' | '\t' | '\r' )+    
                     { $channel=HIDDEN; }  ; 	