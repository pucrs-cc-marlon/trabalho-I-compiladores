%%


%public
%class TrabalhoI
%integer
%unicode
%line
%ignorecase


%{

public final static int DATA = 257;
public final static int NOME = 258;
public final static int VALOR = 259;
public final static int NUMERO = 260;
public final static int JUROS = 261;
public final static int PARCELAS = 262;
public final static int RESTO = 263;
public final static int NOVALINHA = 263;




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
      // System.out.println("Informe a data de hoje: ");
      // String dataHoje = console.nextLine();

      String timeStamp = new java.text.SimpleDateFormat("dd/MM/yyyy").format(java.util.Calendar.getInstance().getTime());

      try{

          System.out.println("Informe seu nome: ");
          String nome = console.nextLine();

          System.out.println("Informe o valor do empréstimo: ");
          double valorEmprestimo = console.nextDouble();

          System.out.println("Informe número de parcelas: ");
          int nParcelas = console.nextInt();

          System.out.println("Informe a taxa de juros: ");
          double taxaJuros = console.nextDouble();

          java.io.Writer writer = null;

          scanner = null;
          writer = null;
          try {
              scanner = new TrabalhoI( new java.io.FileReader( argv[0]) );
    	        int line;
              writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(argv[1]), "utf-8"));
              // writer.write("Something");
              while ( !scanner.zzAtEOF ){
    		          line = scanner.yyline+1;
                  switch(scanner.yylex()){
                      case DATA:
                          writer.write(timeStamp);
                          break;

                      case NOME:
                          writer.write(nome);
                          break;

                      case VALOR:
                          writer.write(String.valueOf(valorEmprestimo));
                          break;

                      case NUMERO:
                          writer.write(String.valueOf(nParcelas));
                          break;

                      case JUROS:
                          writer.write(String.valueOf(taxaJuros));
                          break;

                      case PARCELAS:
                          for(int j=1; j <= nParcelas; j++){
                              writer.write(String.valueOf(j) + " - " + String.valueOf((valorEmprestimo/nParcelas)*taxaJuros));
                              writer.write(" \\par ");
                          }
                          break;

                      case NOVALINHA:
                          writer.write(scanner.yytext());
                          break;

                      default:
                          writer.write(scanner.yytext());
                          break;
                  }
                  // System.out.println("Line: "+line+" token: "+scanner.yylex()+"\t<"+scanner.yytext()+">");
    	        }
          }
          catch (java.io.FileNotFoundException e) {
              System.out.println("File not found : \""+argv[0]+"\"");
          }
          catch (java.io.IOException e) {
              System.out.println("IO error scanning file \""+argv[0]+"\"");
              System.out.println(e);
          }
          catch (Exception e) {
              System.out.println("Unexpected exception:");
              e.printStackTrace();
          } finally {
              try {writer.close();} catch (Exception ex) {/*ignore*/}
          }
        }catch (java.util.InputMismatchException e){
            System.out.println("Tipo de valor incorreto.");
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

{WHITE_SPACE_CHAR}+ { return NOVALINHA; }

. { return RESTO; }
