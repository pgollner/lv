package lv;

import java.util.ArrayList;

public class PrintManager {
	private ArrayList<Document> documents;
	
	public PrintManager()
	{
		documents = new ArrayList<Document>();
	}
	
	public void addDocument(Document d)
	{
		documents.add(d);
	}
	
	public void printAll()
	{
		for (Document document : documents) {
			document.printDocument();
		}
	}
	
	public Document findDocument(String fileName)
	{
		for (Document document : documents) 
		{
			if (document.fileName.equals(fileName))
			{
				return document;
			}
		}
		return null;
	}
	
}

