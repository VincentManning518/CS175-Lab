import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class RoachPopulation {
	
		double population;
	    DecimalFormat decFormat = new DecimalFormat("0");
	      
	      public RoachPopulation(double initial)
	      {
	    	  population = initial;
	    	  JOptionPane.showMessageDialog(null, "The initial Roach Populaton is: " + decFormat.format(population));	      
	      }
	      
	      public void breed(int repeat)
	      {
	    	  population = population * 2;
	    	  JOptionPane.showMessageDialog(null, "The Roach Population after cycle " + repeat + " breeding is : " + decFormat.format(population));	      
	      }
		
	      public void spray(double SprayPct, int repeat)
	      {
	    	  population = population - (population * SprayPct);
	    	  double form = SprayPct * 100;
	    	  JOptionPane.showMessageDialog(null, "The Roach Population after cycle " + repeat + " " + form + "% spraying is : " + decFormat.format(population));	      
	      }
	      
	      public String getRoaches()
	      {
	    	  return decFormat.format(population);
	      }
	}

