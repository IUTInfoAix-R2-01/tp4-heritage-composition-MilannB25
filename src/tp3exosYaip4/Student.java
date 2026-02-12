package tp3exosYaip4;

public class Student extends Person {
	private String program;
	private int years;
	private double fee;
	
	public Student(String name, String address, String program, int years, double fee) {
		super(name, address);
		this.program = program;
		this.years = years;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [program=" + program + ", years=" + years + ", fee=" + fee + "]";
	}
	
	
	
	

}
