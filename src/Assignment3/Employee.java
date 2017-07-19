package Assignment3;

import java.util.Scanner;

public class Employee 
{
	private String employeeName;
	private int  employeeId;
	private String designation;
	private String department;
	//private int 
	private static int employeeCount;

	public static int Employeecount()
	{
		return employeeCount;
	}
	
	public Employee(String designation,String department)
	{
		System.out.println("Constructor storing employee designation and department");
		this.designation=designation;
		this.department=department;
	}
	
	public Employee(int employeeId,String employeeName,String designation,String department)
	{
		this(designation,department);
		System.out.println("Constructor storing employee id and name");
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
	}
	
	public void Display(Employee emp)
	{
		System.out.println("=============DETAILS===============");
		System.out.println("ID "+emp.employeeId);
		System.out.println("Name "+emp.employeeName);
		System.out.println("Designation "+emp.designation);
		System.out.println("Department "+emp.department);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String userInput = "y";
		int employeeId;
		String employeeName,designation,department;
		Employee emp =null;
			do
			{
				System.out.println("Number of employees present "+Employeecount());
				System.out.println("Enter employeeId");
				employeeId = sc.nextInt();
				System.out.println("Enter employeeName");
				employeeName = sc.next();
				System.out.println("Enter designation");
				designation = sc.next();
				System.out.println("Enter department");
				department = sc.next();
				emp = new Employee(employeeId,employeeName,designation,department);
				emp.Display(emp);
				Employee.employeeCount++;
				System.out.println("Do you want to continue (y/n) :");
				userInput = sc.next();
			}while(userInput.equals("y"));
	}
}


