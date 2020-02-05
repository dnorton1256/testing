
public class transcriptDriver {
	public static void main(String args[]) {
		transcript t1 = new transcript("85108D4");
		transcript t2 = new transcript("85108D5");
		
		registrar g1 = new registrar("CS1003", "4CH", "B");
		registrar g2 = new registrar("CS2033", "4CH", "A");
		registrar g3 = new registrar("ECE2213", "4CH", "3.3");
		registrar g4 = new registrar("ECON1001", "3CH", "2.0");
		
		t1.addGrade(g1);
		t1.addGrade(g2);
		t1.addGrade(g3);
		t1.addGrade(g4);
		
		t1.calculateGPA();
		
		System.out.print(t1.printStudent()+ "\n");
		System.out.print(t2.printStudent());
	}
}
