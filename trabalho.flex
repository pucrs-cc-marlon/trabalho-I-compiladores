%%


%public
%class TrabalhoI
%integer
%unicode
%line
%ignorecase


%{

public static int DATA = 257;
public static int NOME = 258;
public static int VALOR = 259;
public static int NUMERO = 260;
public static int JUROS = 261;
public static int PARCELAS = 262;


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
    TrabalhoI scanner;
    if (argv.length == 0) {
      try {
          scanner = new TrabalhoI( System.in );
	        int line;
          while ( !scanner.zzAtEOF ){
		      line = scanner.yyline+1;
	        System.out.println("Line: "+line+" token: "+scanner.yylex()+"\t<"+scanner.yytext()+">");
	    }
        }
        catch (Exception e) {
            System.out.println("Unexpected exception:");
            e.printStackTrace();
        }
    } else {
      java.util.Scanner console = new java.util.Scanner ( System.in );
      System.out.println("Informe a data de hoje: ");
      String dataHoje = console.nextLine();

      System.out.println("Informe seu nome: ");
      String nome = console.nextLine();

      System.out.println("Informe o valor do empréstimo: ");
      String valorEmprestimo = console.nextLine();

      System.out.println("Informe número de parcelas: ");
      String nParcelas = console.nextLine();

      System.out.println("Informe a taxa de juros: ");
      String taxaJuros = console.nextLine();

      for (int i = 0; i < argv.length; i++) {
        scanner = null;
        try {
          scanner = new TrabalhoI( new java.io.FileReader(argv[i]) );
	        int line;
          while ( !scanner.zzAtEOF ){
		      line = scanner.yyline+1;
          System.out.println("Line: "+line+" token: "+scanner.yylex()+"\t<"+scanner.yytext()+">");
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

WHITE_SPACE_CHAR=[\n\r\ \t\b\012]

%%

"#data#" 		{ return DATA; }
"#nome#"	{ return NOME; }
"#valor#"	 	{ return VALOR; }
"#numero#"	 	{ return NUMERO; }
"#juros#"		{ return JUROS; }
"#parcelas#"		{ return PARCELAS; }

{WHITE_SPACE_CHAR}+ { }

. { }
