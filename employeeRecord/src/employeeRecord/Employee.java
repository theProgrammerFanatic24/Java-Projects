package employeeRecord;
public class Employee extends Person {
	double annualSalary;
	int yearHired;
	String IDNum;
	
	public Employee(double annualSalary,int yearHired,String IDNum,String name) {
		super(name);
		this.annualSalary = annualSalary;
		this.yearHired = yearHired;
		this.IDNum = IDNum;		
	}
	
	public Employee() {
		annualSalary = 0.0;
		yearHired = 0;
		IDNum = null;	
	}
	
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public double getannualSalary() {
		return annualSalary;
	}
	
	
	
	public void setyearHired(int yearHired) {
		this.yearHired = yearHired;
	}
	public int getyearHired() {
		return yearHired;
	}
	
	
	public void setIDNum(String IDNum) {
		this.IDNum=IDNum;
	}
	
	public String getIDNum(){
		return IDNum;
	}
	
	@Override
	public String toString()
	{
		String string = "Name : "+super.getName()+ "\n"+
				        "Salary : "+getannualSalary()+"\n"+
				        "Hire Date : "+getyearHired()+"\n"+
				        "ID: "+getIDNum();
		return string;
	}
}
