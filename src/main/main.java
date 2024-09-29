package main;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import dom.DomWriter;
import dom.DomReader;

public class main {

	public static void main(String[] args) {

		// Read an existing xml document
		DomReader domReader = new DomReader();
		domReader.readDocument();
		
		//Create a new xml document
		DomWriter domWriter = new DomWriter();
		domWriter.generateDocument();
		
	}

}
