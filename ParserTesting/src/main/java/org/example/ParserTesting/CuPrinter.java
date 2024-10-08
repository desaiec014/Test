package org.example.ParserTesting;

import java.io.FileInputStream;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

public class CuPrinter {
	
	public static void main(String[] args) throws Exception {
	    // creates an input stream for the file to be parsed
	    FileInputStream in = new FileInputStream("C:\\Users\\Swarna\\eclipse-workspace\\ParserTesting\\src\\main\\java\\org\\example\\ParserTesting\\test.java");

	    CompilationUnit cu;
	    try {
	        // parse the file
	        cu = JavaParser.parse(in);
	    } finally {
	        in.close();
	    }

	    // prints the resulting compilation unit to default system output
	    System.out.println(cu.toString());
	}

}
