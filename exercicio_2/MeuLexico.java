/* The following code was generated by JFlex 1.4.3 on 06/09/17 20:52 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/09/17 20:52 from the specification file
 * <tt>meuLexico.flex</tt>
 */
public class MeuLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\4\22\0\1\3\7\0\1\30\1\30"+
    "\1\30\1\30\1\30\1\0\1\30\1\31\12\1\1\30\1\30\1\30"+
    "\1\27\1\30\2\0\32\2\6\0\1\21\1\15\1\16\1\25\1\10"+
    "\1\7\1\2\1\24\1\6\1\2\1\26\1\11\3\2\1\13\1\2"+
    "\1\17\1\12\1\22\1\14\1\20\1\23\3\2\1\30\1\0\1\30"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\3\1\10\4\2\5\1\2"+
    "\1\6\11\4\1\7\1\1\11\4\1\10\5\4\1\11"+
    "\5\4\1\12\1\13\1\14\1\4\1\15\1\16\2\4"+
    "\1\17\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\116\0\150\0\202\0\32\0\234"+
    "\0\266\0\320\0\352\0\u0104\0\u011e\0\u0138\0\u0152\0\u016c"+
    "\0\32\0\u0186\0\116\0\u01a0\0\u01ba\0\u01d4\0\u01ee\0\u0208"+
    "\0\u0222\0\u023c\0\u0256\0\u0270\0\32\0\u028a\0\u02a4\0\u02be"+
    "\0\u02d8\0\u02f2\0\u030c\0\u0326\0\u0340\0\u035a\0\u0374\0\116"+
    "\0\u038e\0\u03a8\0\u03c2\0\u03dc\0\u03f6\0\116\0\u0410\0\u042a"+
    "\0\u0444\0\u045e\0\u0478\0\116\0\116\0\116\0\u0492\0\116"+
    "\0\116\0\u04ac\0\u04c6\0\116\0\116";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\4"+
    "\1\11\1\4\1\12\1\13\1\4\1\14\1\15\4\4"+
    "\1\16\1\4\1\17\1\4\1\20\1\21\1\22\33\0"+
    "\1\3\31\0\2\4\3\0\21\4\6\0\1\5\33\0"+
    "\1\7\25\0\2\4\3\0\1\4\1\23\17\4\4\0"+
    "\2\4\3\0\3\4\1\24\15\4\4\0\2\4\3\0"+
    "\15\4\1\25\3\4\4\0\2\4\3\0\6\4\1\26"+
    "\2\4\1\27\7\4\4\0\2\4\3\0\11\4\1\30"+
    "\7\4\4\0\2\4\3\0\3\4\1\31\7\4\1\32"+
    "\5\4\4\0\2\4\3\0\16\4\1\33\2\4\4\0"+
    "\2\4\3\0\2\4\1\34\16\4\32\0\1\35\33\0"+
    "\1\36\1\0\2\4\3\0\4\4\1\37\14\4\4\0"+
    "\2\4\3\0\1\40\20\4\4\0\2\4\3\0\7\4"+
    "\1\41\11\4\4\0\2\4\3\0\1\42\20\4\4\0"+
    "\2\4\3\0\2\4\1\43\16\4\4\0\2\4\3\0"+
    "\13\4\1\44\5\4\4\0\2\4\3\0\4\4\1\45"+
    "\14\4\4\0\2\4\3\0\1\46\20\4\4\0\2\4"+
    "\3\0\1\4\1\47\17\4\3\0\4\36\2\0\24\36"+
    "\1\0\2\4\3\0\2\4\1\50\16\4\4\0\2\4"+
    "\3\0\14\4\1\51\4\4\4\0\2\4\3\0\3\4"+
    "\1\52\15\4\4\0\2\4\3\0\12\4\1\53\6\4"+
    "\4\0\2\4\3\0\13\4\1\54\5\4\4\0\2\4"+
    "\3\0\4\4\1\55\14\4\4\0\2\4\3\0\2\4"+
    "\1\56\16\4\4\0\2\4\3\0\3\4\1\57\15\4"+
    "\4\0\2\4\3\0\13\4\1\60\5\4\4\0\2\4"+
    "\3\0\10\4\1\61\10\4\4\0\2\4\3\0\1\62"+
    "\20\4\4\0\2\4\3\0\13\4\1\63\5\4\4\0"+
    "\2\4\3\0\20\4\1\64\4\0\2\4\3\0\4\4"+
    "\1\65\14\4\4\0\2\4\3\0\2\4\1\66\16\4"+
    "\4\0\2\4\3\0\6\4\1\67\12\4\4\0\2\4"+
    "\3\0\16\4\1\70\2\4\4\0\2\4\3\0\10\4"+
    "\1\71\10\4\4\0\2\4\3\0\14\4\1\72\4\4"+
    "\4\0\2\4\3\0\3\4\1\73\15\4\4\0\2\4"+
    "\3\0\2\4\1\74\16\4\4\0\2\4\3\0\14\4"+
    "\1\75\4\4\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1248];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\1\11\11\1\1\11\13\1\1\11"+
    "\40\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

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




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MeuLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public MeuLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 102) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { System.out.println(yyline+1 + ": caracter invalido: "+yytext());
          }
        case 17: break;
        case 11: 
          { return CLASS;
          }
        case 18: break;
        case 10: 
          { return BREAK;
          }
        case 19: break;
        case 16: 
          { return DEFAULT;
          }
        case 20: break;
        case 4: 
          { return IDENT;
          }
        case 21: break;
        case 6: 
          { return IF;
          }
        case 22: break;
        case 15: 
          { return PRIVATE;
          }
        case 23: break;
        case 8: 
          { return ELSE;
          }
        case 24: break;
        case 9: 
          { return CASE;
          }
        case 25: break;
        case 5: 
          { return yytext().charAt(0);
          }
        case 26: break;
        case 3: 
          { return NUM;
          }
        case 27: break;
        case 14: 
          { return PUBLIC;
          }
        case 28: break;
        case 7: 
          { return EQUALS;
          }
        case 29: break;
        case 12: 
          { return WHILE;
          }
        case 30: break;
        case 13: 
          { return SWITCH;
          }
        case 31: break;
        case 1: 
          { 
          }
        case 32: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
