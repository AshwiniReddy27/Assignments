package language.basics;

public class Employeegroups {

	public static void main(String[] args) {
		String[] names=new String[3];
		int[] ids=new int[3];
		Employees employees = new Employees();
		names[0]=employees.employeeName1;
		names[1]=employees.employeeName2;
		names[2]=employees.employeeName3;
		ids[0]=employees.empId1;
		ids[1]=employees.empId2;
		ids[2]=employees.empId3;
		System.out.println("Employee name : "+names[0] + ",Employee id : "+ids[0]);
		System.out.println("Employee name : "+names[1] + ",Employee id : "+ids[1]);
		System.out.println("Employee name :"+names[2] + ",Employee id i: "+ids[2]);
		
	}

}
