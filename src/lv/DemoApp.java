package lv;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		
		Document document = new Document("testdocument.txt");
		document.printDocument();
		
		TextDocument textDocument = new TextDocument("textdocument.txt", "das ist ein testdocument");
		textDocument.printDocument();
		
		ImageDocument image = new ImageDocument("image.png", 100, 200, "red");
		image.printDocument();
		
		CsvDocument csvDocument = new CsvDocument("demo.csv", new ArrayList<String>());
		csvDocument.addLine("line;column2;usw");
		csvDocument.addLine("line;column2;usw");
		csvDocument.printDocument();
		
		System.out.println();
		ArrayList<String> csv = new ArrayList<>();
		csv.add("line3");
		csv.add("line4");
		Document csvDocument2 = new CsvDocument("demo2", csv);
		//csvDocument2.addLine("line3;column2;usw");
		csvDocument2.printDocument();
		/*
		Document d = textDocument;
		Document d2 = image;
		
		TextDocument d1 = (TextDocument) d;
		textDocument = (TextDocument) d;
		System.out.println(d1.toString());
		d1.printDocument();

		TextDocument x = (TextDocument) d2;

		*/		
		
		System.out.println("PrintManager");
		PrintManager manager = new PrintManager();
		manager.addDocument(textDocument);
		manager.addDocument(image);
		manager.addDocument(csvDocument);
		manager.addDocument(document);
		
		System.out.println("\nprintAll");
		manager.printAll();
		
		System.out.println("\nfindDocument");
		if (manager.findDocument("image.png") != null)
		{
			System.out.println("image.png gefunden");
		}
		if (manager.findDocument("imageXY.png") != null)
		{
			System.out.println("imageXY.png gefunden");
		}
	}

}
