package exercicio03.entities;

public class Student {
	
	public String name;
	public double[] grades = new double[3];
	
	public double finalGrade() {
		return grades[0] + grades[1] + grades[2];
	}
	
	public double missingPoints() {
		if(finalGrade() < 60) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;	
		}
		
	}
	
}
