grammar spl;

@header {
package compiler;
}

program : '***' '//' block '\\';

block : initialization '.'
| initialization '.' block
| declaration '.'
| declaration '.' block
| if_check block
| if_check
| performtill block
| performtill
| unary '.' block
| unary '.'
| assignment '.'
| assignment '.' block
| perform
| perform block
| performInRange
| performInRange block
| ternary '.' block
| ternary '.'
| show '.' block
| show '.'

;

initialization : integer
| string
| bool;

integer: 'digit' identifier '**=' number                #digitInitNum
| 'digit' identifier '**=' identifier                   #digitInitIden
| 'digit' identifier '**=' expression                   #digitInitEpr
;


string : 'word' identifier '**=' identifier       #wordInitId
|'word' identifier '**=' '"' sentence '"'         #wordInitSen;

bool : 'dual' identifier '**=' identifier           #dualInitId
| 'dual' identifier '**=' bop=('true' | 'false')    #dualDef
;

declaration :  'digit' identifier     # digitDeclaration
| 'word' identifier               # wordDeclaration
| 'dual' identifier                 # dualDeclaration
;

assignment : identifier '**=' number                #digitAssign
| identifier '**=' boolean_value=('true' | 'false') #dualAssign
| identifier '**=' '"' sentence '"'                 #wordAssign
| identifier '**=' expression                       #exprAssign
;

unary : identifier '++'          #increment
| identifier '--'                #decrement;

show : 'show' sentence  #showSentence
|'show' expression      #showExpr
;


if_check : 'if_check' condition '{' block '}' #ifCheck
| 'if_check' condition '{' block '}' 'else' '{' block '}' #ifCheckElse ;

condition : expression conditional_operator=('*==' | '*<' | '*>' | '*<=' | '*>=' | '*!=' ) expression #starCond
| boolean_value=('true' | 'false' ) #starDualCond;

performtill : 'performtill' '('condition')' '{' block '}';

perform : 'perform' '(' integer ','  condition ','  option ')' '{' block '}';
option : unary ;

performInRange : 'performInRange'  identifier  'in' 'range' '('number ',' number')'  '{' block '}'   #rangePerform
|'performInRange'  identifier  'in' 'range' '('number ',' number ',' number ')' '{' block '}'   #stepRangePerform
;

ternary : 'digit' identifier  '**=' condition ':' expression ',' expression #ternaryInitDigit
|'word' identifier  '**=' condition ':' '"' sentence '"' ',' '"' sentence '"' #ternaryInitWord
|'dual' identifier  '**=' condition ':' boolean_value=('true' | 'false') ',' boolean_value=('true' | 'false') #ternaryInitDual;

expression : term '*+' expression #starAddition
| term '*-' expression #starSubtraction
| term #starPrecedence;

term : factor '**' term #starMultiplication
| factor '*/' term #starDivision
| factor #starFact;

factor : identifier #starIdenExpr
| number #starDigitExpr;

sentence : sent_option*;
sent_option : number |str_sent| special_char;

str_sent: Str;
Str: '"' (~["])+ '"';
identifier : ID;
ID : [a-zA-Z][a-zA-Z0-9_]*;
special_char : Special_char;
Special_char : [$&+,:;=?@#|'<>.^*()%!-];

number : Digit;

Digit : '0'
    | '-'?[1-9][0-9]*
    ;

WS  : [ \t\r\n]+ -> skip;

COMMENT:            '???' .*? '???'    -> channel(HIDDEN);
LINE_COMMENT:       '??' ~[\r\n]*    -> channel(HIDDEN);
