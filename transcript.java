import java.text.NumberFormat;

public class transcript {
	
	private String id;
	private registrar[] grades;
	private int count;				//number of grades counter
	private double GPA;
	
	public transcript(String id) {
		this.id = id;
		
		grades = new registrar[50];	//45 grades because 4 years times 
		count = 0;					//5 average courses is 40, and then
		GPA = 0;					//10 extra.
	}
	
	public void addGrade(registrar input) {
		grades[count] = input;
		count++;
	}
	
	public String getID() {
		return id;
	}
	
	public void calculateGPA() {
		double y = 0, z = 0, w = 0;
		for(int i = 0; i < count; i++) {
			char temp = grades[i].getCredit().charAt(0);
			int hours = (temp - 48);
			
			y = (hours * grades[i].getNumberGrade());
			z += y;
			w += hours;
		}
		GPA = z/w;
		
	}
	
	public String printStudent() {
		NumberFormat f1 = NumberFormat.getNumberInstance();
		f1.setMinimumFractionDigits(2);
		f1.setMaximumFractionDigits(2);
		String result = "Student " + id + ":\n";
		for(int i = 0; i < count; i++) {
			result += grades[i].getCourse() + " " + grades[i].getCredit() + " " + grades[i].getNumberGrade() +
					" (" + grades[i].getGrade() + ")\n";
		}
		if(GPA == 0 && count == 0)
			result += "GPA: NaN";
		else 
			result += "GPA: " + f1.format(GPA) + "\n";
		return result;
	}
}
