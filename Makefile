CLASSPATH = lib/*:.
test: MarkdownParseTest.class
	java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:lib/commonmark-0.18.1.jar:. org.junit.runner.JUnitCore MarkdownParseTest
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:lib/commonmark-0.18.1.jar:. MarkdownParseTest.java
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java