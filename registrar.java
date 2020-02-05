
public class registrar {
	
	private String course;
	private String credits;
	private String grade;

	
	public registrar(String course, String credits, String grade) {
		this.course = course;
		this.credits = credits;
		this.grade = grade;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String getCredit() {
		return credits;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public double getNumberGrade() {
		double result = 0.0;
		if(grade.equals("A+")) {
			result = 4.3;
		}
		else if(grade.equals("A")) {
			result = 4.0;
		}
		else if(grade.equals("A-")) {
			result = 3.7;
		}
		else if(grade.equals("B+")) {
			result = 3.3;
		}
		else if(grade.equals("B")) {
			result = 3.0;
		}
		else if(grade.equals("B-")) {
			result = 2.7;
		}
		else if(grade.equals("C+")) {
			result = 2.3;
		}
		else if(grade.equals("C")) {
			result = 2.0;
		}
		else if(grade.equals("D")) {
			result = 1.0;
		}
		else if(grade.equals("F") || grade.equals("WF")) {
			result = 0.0;
		}
		else if(grade.equals("4.3")) {
			result = 4.3;
			grade = "A+";
		}
		else if(grade.equals("4.0")) {
			result = 4.0;
			grade = "A";
		}
		else if(grade.equals("3.7")) {
			result = 3.7;
			grade = "A-";
		}
		else if(grade.equals("3.3")) {
			result = 3.3;
			grade = "B+";
		}
		else if(grade.equals("3.0")) {
			result = 3.0;
			grade = "B";
		}
		else if(grade.equals("2.7")) {
			result = 2.7;
			grade = "B-";
		}
		else if(grade.equals("2.3")) {
			result = 2.3;
			grade = "C+";
		}
		else if(grade.equals("2.0")) {
			result = 2.0;
			grade = "C";
		}
		else if(grade.equals("1.0")) {
			result = 1.0;
			grade = "D";
		}
		else if(grade.equals("0.0")) {
			result = 0.0;
			grade = "F";
		}
		
		return result;
	}
}
