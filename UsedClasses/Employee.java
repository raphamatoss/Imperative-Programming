// question 19
package UsedClasses;

public class Employee {
	public int code;
	public int hours;
	public int dependents;
	public double inss;
	public double ir;
	public double salary;
	public double finalSalary;
	
	public String toString() {
		return "Code: " + this.code + "\nINSS: " + this.inss + "\nIR: " + this.ir + "\nFinal Salary: " + this.finalSalary + "\n";
	}
}
