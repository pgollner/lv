package uebung.fuer.Klausur;

import java.util.ArrayList;
import java.util.HashMap;

public class Figure_Manager {
ArrayList<Figure> alF = new ArrayList<>();

/*public Figure_Manager(ArrayList<Figure> alF) {
	super();
	this.alF = alF;
}*/

	public void add(Figure f)
	{
		alF.add(f);
	}
	public double getMaxPerimeter()
	{
		double maxper=0;
		for (Figure figure : alF) 
		{
			if(maxper < figure.getPerimeter());
			{
				maxper = figure.getPerimeter();
			}
		}
		return maxper;
	}
	public double getAverageAreaSize()
	{
		double maxArea=0;
		double avgArea=0;
		double counter=0;
		for (Figure figure : alF) 
		{	
				maxArea+=figure.getArea();
				counter++;
		}
		avgArea= maxArea / counter;
		return avgArea;
	}
	
	public  HashMap<String, Double>
	getAreabySizeCategory()
	{
		double sumKL=0,sumMI=0,sumGR=0;
		for (Figure figure : alF) 
		{
			
			if(figure.getArea()<1000)
			{
				sumKL+=figure.getArea();
			}
			if(figure.getArea()<=4999)
			{
				sumMI+=figure.getArea();
			}
			else
			{
				sumGR+=figure.getArea();
			}
				
		}
		getAreabySizeCategory().put("Klein", sumKL);
		getAreabySizeCategory().put("Mittel", sumMI);
		getAreabySizeCategory().put("Gro�", sumGR);
		return getAreabySizeCategory();
	}
}
