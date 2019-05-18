
grammar MxStar;

/*
    PARSER
*/

program
    : (classDef | functionDef | varDefStatement)*
;

/*
    class
*/

classDef
    : Class Identifier classBody
;

classBody
    : '{' (noAssignVarDec | functionDef)*  constructFunc?  (noAssignVarDec | functionDef)* '}'
;

noAssignVarDec
    : paraDec (',' Identifier)* ';'
;

constructFunc
    : Identifier '('')' block
;

/*
    function
*/

functionDef
    : (typeId | Void) Identifier '(' paraDecList? ')' block
;

paraDecList
    : paraDec (',' paraDec)*
;

paraDec
    : typeId Identifier
;

/*
    statement
*/

statement
    : block             #blkState
    | expression ';'    #exprState
    | condStatement     #condState
    | loopStatement     #loopState
    | jumpStatement     #jumpState
    | ';'               #nullState
;

varDefStatement
    : typeId varDefList ';'
;

typeId
    : typeId '[' ']'    #arrayTId
    | noArrayTypeId     #noArrTId
;

noArrayTypeId
    : simpleTypeId
    | Identifier
;

simpleTypeId
    : Bool
    | Int
    | String
;

varDefList
    : varDef (',' varDef)*
;

varDef
    : Identifier ('=' expression)?
;

block
    : '{' (statement | varDefStatement)* '}'
;

condStatement
    : If '(' expression ')' statement (Else statement)?
;

loopStatement
    : While '(' expression ')' statement                                                                    #whileState
    | For '(' (initExp = expression)? ';' (condExp = expression)? ';' (loopExp = expression)? ')' statement #forState
;

jumpStatement
    : Return expression? ';' #returnState
    | Break ';'              #breakState
    | Continue ';'           #continueState
;

/*
    expression
*/

expression
    : assignExpr
;

assignExpr
    : logicOrExpr                       #logOrExp
    | logicOrExpr (op = '=') assignExpr #logOrAgnExp
;

logicOrExpr
    : logicAndExpr                          #logAndExp
    | logicOrExpr (op = '||') logicAndExpr  #logOrLogAndExp
;

logicAndExpr
    : orExpr                            #orExp
    | logicAndExpr (op = '&&') orExpr   #logAndOrExp
;

orExpr
    : xorExpr                   #xorExp
    | orExpr (op = '|') xorExpr #orXorExp
;

xorExpr
    : andExpr                       #andExp
    | xorExpr (op = '^') andExpr    #xorAndExp
;

andExpr
    : equalExpr                     #equExp
    | andExpr (op = '&') equalExpr  #andEquExp
;

equalExpr
    : compExpr                                  #compExp
    | equalExpr (op = ('==' | '!=')) compExpr   #equCompExp
;

compExpr
    : shiftExpr                                 #shiftExp
    | compExpr (op = ('>=' | '<=')) shiftExpr   #compshiftExp
    | compExpr (op = ('>'  | '<' )) shiftExpr   #compshiftExp
;

shiftExpr
    : addExpr                                   #addExp
    | shiftExpr (op = ('<<' | '>>')) addExpr    #shiftAddExp
;

addExpr
    : mulExpr                               #mulExp
    | addExpr (op = ('+' | '-')) mulExpr    #addMulExp
;

mulExpr
    : leftUnaryExpr                                     #lfUExp
    | mulExpr (op = ('*' | '/' | '%')) leftUnaryExpr    #mullfUExp
;

leftUnaryExpr
    : rightUnaryExpr                        #rtUExp
    | (op = ('++' | '--')) leftUnaryExpr    #leftUExp
    | (op = ('~'  | '!' )) leftUnaryExpr    #leftUExp
    | (op = ('+'  | '-' )) leftUnaryExpr    #leftUExp
    | New newVar                            #newExp
;

newVar
    : noArrayTypeId ('['expression']')+ ('['']')*
    | Identifier ('(' ')')?
;

rightUnaryExpr
    : primaryExpr                           #priExp
    | rightUnaryExpr (op = ('++' | '--'))   #rightUExp
;

primaryExpr
    : elementExpr                       #eleExp
    | primaryExpr '.' elementExpr       #priPntExp
    | primaryExpr '[' expression ']'    #priArrExp
;

elementExpr
    : literal                               #literEleExp
    | This                                  #thisEleExp
    | Identifier                            #varEleExp
    | Identifier '(' expressionList? ')'    #funEleExp
    | '(' expression ')'                   #sonEleExp
;

expressionList
    : expression (',' expression)*
;

literal
    : LogicLiteral  #logicLiter
    | IntLiteral    #intLiter
    | StringLiteral #stringLiter
    | NullLiteral   #nullLiter
;

/*
    LEXER
*/

/*
    literal
*/

LogicLiteral
    : True
    | False
;

IntLiteral
    : ([1-9] (DIGIT)*)
    | '0'
;

StringLiteral
    : '"' (ESC | .)*? '"'
;

fragment
ESC
    : '\\"'
    | '\\\\'
;

NullLiteral
    : Null
;

/*
    key word
*/

Bool    : 'bool' ;

Int     : 'int' ;

String  : 'string' ;

Void    : 'void' ;

Null    : 'null' ;

True    : 'true' ;

False   : 'false' ;

If      : 'if' ;

Else    : 'else' ;

For     : 'for' ;

While   : 'while' ;

Break   : 'break' ;

Continue: 'continue' ;

Return  : 'return' ;

New     : 'new' ;

Class   : 'class' ;

This    : 'this' ;

/*
    identifier
*/

Identifier
    : LETTER (LETTER | DIGIT | '_')*
;

fragment
LETTER
    : [a-zA-Z]
;

fragment
DIGIT
    : [0-9]
;

/*
    comment
*/

Comment
    : '//' ~ [\r\n]* -> skip
;

WhiteSpace
    : [ \t\r\n]+ -> skip
;
