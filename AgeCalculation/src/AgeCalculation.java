import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class AgeCalculation {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String birthDate = JOptionPane.showInputDialog("Please input your birth date (MM/DD/YYYY): ");
		birthDate = birthDate.formatted(formatter);
		LocalDate parsedbirthDate = LocalDate.parse(birthDate, formatter);
		
		String currentDate = JOptionPane.showInputDialog("Please input the current date (MM/DD/YYYY): ");
		currentDate = currentDate.formatted(formatter);
		LocalDate parsedcurrentDate = LocalDate.parse(currentDate, formatter);
		
		Period age = Period.between(parsedbirthDate, parsedcurrentDate);
		
		JOptionPane.showMessageDialog(null, "You are " + age.getYears() + " years and " + age.getMonths() + " month(s) old.");
	}

}
