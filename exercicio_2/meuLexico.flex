%%


%public
%class MeuLexico
%integer
%unicode
%line


%{

/**
  * Alunos:
  * Marlon Baptista de Quadros
  * Eurico Saldanha
  * Daniel Lopes
  *
  */

private final static int IDENT		= 257;
private final static int NUM			= 258;

private final static int IF 			= 259;
private final static int ELSE 		= 260;
private final static int PUBLIC 	= 261;
private final static int PRIVATE = 262;
private final static int CLASS		= 263;
private final static int EQUALS	= 264;
private final static int SWITCH  = 265;
private final static int CASE    = 266;

private final static int DEFAULT    = 268;
private final static int WHILE    = 269;
private final static int BREAK    = 270;


/**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    MeuLexico scanner;
    if (argv.length == 0) {
      try {
          scanner = new MeuLexico( System.in );
          while ( !scanner.zzAtEOF )
	        System.out.println("token: "+scanner.yylex()+"\t<"+scanner.yytext()+">");
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }

    }
    else {
      for (int i = 0; i < argv.length; i++) {
        scanner = null;
        try {
          scanner = new MeuLexico( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ){
              switch((int)scanner.yylex()){
                case IDENT:
                    System.out.println("token: "+scanner.yylex()+"\t<IDENT>");
                    break;
                case NUM:
                    System.out.println("token: "+scanner.yylex()+"\t<NUM>");
                    break;
                case IF:
                    System.out.println("token: "+scanner.yylex()+"\t<IF>");
                    break;
                case ELSE:
                    System.out.println("token: "+scanner.yylex()+"\t<ELSE>");
                    break;
                case PUBLIC:
                    System.out.println("token: "+scanner.yylex()+"\t<PUBLIC>");
                    break;
                case PRIVATE:
                    System.out.println("token: "+scanner.yylex()+"\t<PRIVATE>");
                    break;
                case CLASS:
                    System.out.println("token: "+scanner.yylex()+"\t<CLASS>");
                    break;
                case EQUALS:
                    System.out.println("token: "+scanner.yylex()+"\t<EQUALS>");
                    break;
                case SWITCH:
                    System.out.println("token: "+scanner.yylex()+"\t<SWITCH>");
                    break;
                case CASE:
                    System.out.println("token: "+scanner.yylex()+"\t<CASE>");
                    break;
                case DEFAULT:
                    System.out.println("token: "+scanner.yylex()+"\t<DEFAULT>");
                    break;
                case WHILE:
                    System.out.println("token: "+scanner.yylex()+"\t<WHILE>");
                    break;
                case BREAK:
                    System.out.println("token: "+scanner.yylex()+"\t<BREAK>");
                    break;
                default:
                    System.out.println("token: "+scanner.yylex()+"\t<"+scanner.yytext()+">");
                    break;
              }
          }
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


%}

DIGIT=		[0-9]
LETTER=		[a-zA-Z]
WHITESPACE=	[ \t]
LineTerminator = \r|\n|\r\n

%%

if				{return IF;}
else			{return ELSE;}
public		{return PUBLIC;}
private		{return PRIVATE;}
class			{return CLASS;}
switch    {return SWITCH;}
case      {return CASE;}
default      {return DEFAULT;}
while      {return WHILE;}
break      {return BREAK;}

{LETTER}({LETTER}|{DIGIT})* {return IDENT;}
{DIGIT}+                    {return NUM;}

"=" |
"+" |
"*" |
";" |
"{" |
"}" |
"." |
":" |
"," |
"(" |
">" |
"<" |
")"                         {return yytext().charAt(0);}
"=="                        {return EQUALS;}
{WHITESPACE}*               { }
{LineTerminator}		{}

"//"[^\n\r]* {}

.          {System.out.println(yyline+1 + ": caracter invalido: "+yytext());}
