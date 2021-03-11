import javax.swing.JOptionPane;
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String PopInput = JOptionPane.showInputDialog("Enter the initial roach population: ");
	    double initial = Double.parseDouble(PopInput);    
		
		RoachPopulation bugs = new RoachPopulation(initial);
		
		//
		int repeat = 1;
		bugs.breed(repeat);
		
	    String input0 = JOptionPane.showInputDialog("Enter spray percentage:");
	    double SprayPct0 = Double.parseDouble(input0);
	    
	    bugs.spray(SprayPct0, repeat);
	    
	    //
	    repeat = 2;
	    bugs.breed(repeat);
		
	    String input1 = JOptionPane.showInputDialog("Enter spray percentage:");
	    double SprayPct1 = Double.parseDouble(input1);
	    
	    bugs.spray(SprayPct1, repeat);
	    
	    //
	    repeat = 3;
	    bugs.breed(repeat);
		
	    String input2 = JOptionPane.showInputDialog("Enter spray percentage:");
	    double SprayPct2 = Double.parseDouble(input2);
	    
	    bugs.spray(SprayPct2, repeat);

	    //
	    repeat = 4;
	    bugs.breed(repeat);
		
	    String input3 = JOptionPane.showInputDialog("Enter spray percentage:");
	    double SprayPct3 = Double.parseDouble(input3);
	    
	    bugs.spray(SprayPct3, repeat);
	    
	}

}
