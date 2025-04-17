package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Assignment {

	public static void main(String[] args) {
		//Student Details Table
		//John Doe	20	Male	S12345		Computer Science	3.8	john@example.com	9876543210	123 Elm St
		//Jane Smith	21	Female	S12346	B	Mathematics	3.5	jane@example.com	9876543211	456 Oak St
		//Mike Brown	22	Male	S12347	A	Physics	3.9	mike@example.com	9876543212	789 Pine St
		Map<String,String>studentdetailsR1=new HashMap<String,String>();
		//Row1 Student details
		studentdetailsR1.put("Name", "John Doe");//Index(0)
		studentdetailsR1.put("Age", "20");//Index(1)
		studentdetailsR1.put("Gender", "Male");
		studentdetailsR1.put("Roll Number", "S12345");
		studentdetailsR1.put("Grade", "A");
		studentdetailsR1.put("Major", "Computer Science");
		studentdetailsR1.put("GPA", "3.8");
		studentdetailsR1.put("Email", "john@example.com");
		studentdetailsR1.put("Contact Number", "9876543210");
		studentdetailsR1.put("Address", "23 Elm St");
		System.out.println("studentdetailsR1:"+ studentdetailsR1);
		
		
		//Row2 Student details
		Map<String,String>studentdetailsR2=new HashMap<String,String>();
		studentdetailsR2.put("Name", "Smith");
		studentdetailsR2.put("Age", "21");
		studentdetailsR2.put("Gender", "Female");
		studentdetailsR2.put("Roll Number", "S12346");
		studentdetailsR2.put("Grade", "B");
		studentdetailsR2.put("Major", "Mathematics");
		studentdetailsR2.put("GPA", "3.5");
		studentdetailsR2.put("Email", "jane@example.com");
		studentdetailsR2.put("Contact Number", "9876543211");
		studentdetailsR2.put("Address", "456 Oak St");
		System.out.println("studentdetailsR2:"+ studentdetailsR2);
		
		//Row3 Student Details
		Map<String,String>studentdetailsR3=new HashMap<String,String>();
		studentdetailsR3.put("Name","Mike Brown");
		studentdetailsR3.put("Age", "22");
		studentdetailsR3.put("Gender", "Male");
		studentdetailsR3.put("Roll Number", "S12347");
		studentdetailsR3.put("Grade", "A");
		studentdetailsR3.put("Major", "Physics");
		studentdetailsR3.put("GPA", "3.9");
		studentdetailsR3.put("Email", "mike@example.com");
		studentdetailsR3.put("Contact Number", "9876543212");
		studentdetailsR3.put("Address", "789 Pine st");
		System.out.println("studentdetailsR3:"+ studentdetailsR3);
		//Now Storing all Student details in list
		List<Map<String,String>> studentdetails=new ArrayList<Map<String,String>>();
		studentdetails.add(studentdetailsR1);
		studentdetails.add(studentdetailsR2);
		studentdetails.add(studentdetailsR3);
		System.out.println("studentdetail:"+ studentdetails);
	
		
		//Employee Details
		//Employee ID	Name	Age	Gender	Department	Position	Salary	Email	Contact Number
		//E001	Alice Green	30	Female	Engineering	Software Engineer	75,000	alice@example.com	9876543213
		//Row1 Employee Details
		Map<String,String>employeeDetailsR1=new HashMap<String,String>();
		employeeDetailsR1.put("Employee ID","E001");
		employeeDetailsR1.put("Name","Alice");
		employeeDetailsR1.put("Age","30");
		employeeDetailsR1.put("Gender","Female");
		employeeDetailsR1.put("Department","Engineering");
	    employeeDetailsR1.put("Position","Software Engineer");
		employeeDetailsR1.put("Salary","75,000");
		employeeDetailsR1.put("Email","alice@example.com");
		employeeDetailsR1.put("Contact Number","9876543213");
		System.out.println("Employee Details:"+ employeeDetailsR1);
		//Row2 Employee Details
		//E002	Bob Johnson	35	Male	Marketing	Marketing Manager	85,000	bob@example.com	9876543214
		Map<String,String>employeeDetailsR2=new HashMap<String,String>();
		employeeDetailsR2.put("Employee ID","E002");
		employeeDetailsR2.put("Name","Bod Johnson");
		employeeDetailsR2.put("Age","35");
		employeeDetailsR2.put("Gender","Male");
		employeeDetailsR2.put("Department","Marketing ");
		employeeDetailsR2.put("Position","Marketing Manager");
		employeeDetailsR2.put("Salary","85,000");
		employeeDetailsR2.put("Email","bob@example.com");
		employeeDetailsR2.put("Contact Number","9876543214");
		System.out.println("Employee Details:"+ employeeDetailsR2);
		
		//ROW3 Employee Details
		//E003	Carol White	28	Female	Sales	Sales Executive	65,000	carol@example.com	9876543215
		Map<String,String>employeeDetailsR3=new HashMap<String,String>();
		employeeDetailsR3.put("Employee ID","E003");
		employeeDetailsR3.put("Name","Carol White");
		employeeDetailsR3.put("Age","28");
		employeeDetailsR3.put("Gender","Female");
		employeeDetailsR3.put("Department","Sales ");
		employeeDetailsR3.put("Position","Sales Executive");
		employeeDetailsR3.put("Salary","65,000");
		employeeDetailsR3.put("Email","carol@example.com");
		employeeDetailsR3.put("Contact Number","9876543215");
		System.out.println("Employee Details:"+ employeeDetailsR3);
		//Now Storing all the employee details
		
		List<Map<String,String>>employeeDetails=new ArrayList<Map<String,String>>();
		employeeDetails.add(employeeDetailsR1);
		employeeDetails.add(employeeDetailsR2);
		employeeDetails.add(employeeDetailsR3);
		System.out.println("Employee Details:"+ employeeDetails);
		
		
		
		//Product Details
		//Product ID	Name	Category	Price	Stock Quantity	Supplier	Warranty	Rating	Manufacturing Date	Expiry Date
		//P001	Laptop	Electronics	$1,200	50	Tech Supplies	2 years	4.5	15/1/2023	15/1/2025
		//P002	Desk Chair	Furniture	$150	100	Office Depot	1 year	4	10/2/2023	N/A
		//P003	Coffee Maker	Kitchen	$75	200	KitchenWorld	6 months	4.2	20/3/2023	20/3/2024
		//Row1 Product Details
		
		Map<String,String>productDetailsR1=new HashMap<String,String>();
		productDetailsR1.put("Product ID", "P001");
		productDetailsR1.put("Name", "Laptop");
		productDetailsR1.put("Category", "Electronics");
		productDetailsR1.put("Price", "$1,200");
		productDetailsR1.put("Stock Quantity", "50");
		productDetailsR1.put("Supplier", "Tech Supplies");
		productDetailsR1.put("Warranty", "2 years");
		productDetailsR1.put("Rating", "4.5");
		productDetailsR1.put("Manufacturing Date", "15/1/2023");
		productDetailsR1.put("Expiry Date", "15/1/2025");
		System.out.println("Product Details:"+ productDetailsR1);
		
		
		//Row2 Product Details
		//P002	Desk Chair	Furniture	$150	100	Office Depot	1 year	4	10/2/2023	N/A
		Map<String,String>productDetailsR2=new HashMap<String,String>();
		productDetailsR2.put("Product ID", "P002");
		productDetailsR2.put("Name", "Desk Chair");
		productDetailsR2.put("Category", "Furniture");
		productDetailsR2.put("Price", "$150	");
		productDetailsR2.put("Stock Quantity", "100");
		productDetailsR2.put("Supplier", "Office Depot");
		productDetailsR2.put("Warranty", "1 year");
		productDetailsR2.put("Rating", "4");
		productDetailsR2.put("Manufacturing Date", "10/2/2023");
		productDetailsR2.put("Expiry Date", "N/A");
		System.out.println("Product Details:"+ productDetailsR2);
		
		
		//Row3 Product Details
		//P003	Coffee Maker	Kitchen	$75	200	KitchenWorld	6 months	4.2	20/3/2023	20/3/2024
		Map<String,String>productDetailsR3=new HashMap<String,String>();
		productDetailsR3.put("Product ID", "P003");
		productDetailsR3.put("Name", "Coffee Maker");
		productDetailsR3.put("Category", "Kitchen	");
		productDetailsR3.put("Price", "$175	");
		productDetailsR3.put("Stock Quantity", "200");
		productDetailsR3.put("Supplier", "KitchenWorld");
		productDetailsR3.put("Warranty", "6 months");
		productDetailsR3.put("Rating", "4.2");
		productDetailsR3.put("Manufacturing Date", "20/3/2023");
		productDetailsR3.put("Expiry Date", "20/3/2024");
		System.out.println("Product Details:"+ productDetailsR3);
		//Now Storing all the Product Details
		
		List<Map<String,String>>ProductDetails=new ArrayList<Map<String,String>>();
		ProductDetails.add(productDetailsR1);
		ProductDetails.add(productDetailsR2);
		ProductDetails.add(productDetailsR3);
		System.out.println("Product Details:"+ ProductDetails);
		
		
		Map<String, List<Map<String,String>>>data=new HashMap<String ,List<Map<String,String>>>();
		data.put("StudentData",studentdetails);
		data.put("employeeDetails",employeeDetails);
		data.put("ProductData", ProductDetails);
		
		data.get("ProductData").get(1).get("Supplier");
		
		
		System.out.println(data.get("ProductData").get(1).get("Supplier"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
