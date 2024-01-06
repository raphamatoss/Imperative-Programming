
public class Employee {
	int code;
	int hours;
	int dependents;
	double inss;
	double ir;
	double salary;
	double finalSalary;
	
	public String toString() {
		return "Code: " + this.code + "\nINSS: " + this.inss + "\nIR: " + this.ir + "\nFinal Salary: " + this.finalSalary + "\n";
	}
}