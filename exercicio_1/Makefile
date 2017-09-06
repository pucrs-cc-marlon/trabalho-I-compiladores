# only works with the Java extension of yacc:
# byacc/j from http://troi.lincom-asg.com/~rjamison/byacc/

JFLEX  = java -jar JFlex.jar
JAVAC  = javac

# targets:

all: TrabalhoI.class

run: TrabalhoI.class
	java TrabalhoI modelo.rtf saida.rtf

build: clean TrabalhoI.class

clean:
	rm -f *~ *.class Yylex.java TrabalhoI.java y.output saida.rtf

TrabalhoI.class: Yylex.java TrabalhoI.java
	$(JAVAC) TrabalhoI.java

Yylex.java: trabalho.flex
	$(JFLEX) trabalho.flex
