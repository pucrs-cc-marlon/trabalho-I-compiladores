# only works with the Java extension of yacc:
# byacc/j from http://troi.lincom-asg.com/~rjamison/byacc/

JFLEX  = java -jar JFlex.jar
JAVAC  = javac

# targets:

all: MeuLexico.class

run: MeuLexico.class
	java MeuLexico modelo.rtf saida.rtf

build: clean MeuLexico.class

clean:
	rm -f *~ *.class Yylex.java MeuLexico.java y.output saida.rtf

MeuLexico.class: Yylex.java MeuLexico.java
	$(JAVAC) MeuLexico.java

Yylex.java: meuLexico.flex
	$(JFLEX) meuLexico.flex
