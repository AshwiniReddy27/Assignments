package language.basics;

public class Operators {

	public static void main(String[] args) {
	String[]studentNames= {"Suresh","Mahesh","Naresh"};
	int[]marks= {75,80,82};
	
	
	
	int[]updatedMarks= {
			marks[0]+=10,
			marks[1]+=10,
			marks[2]+=10
			};	
	
	System.out.println("UpdatedMarks:");
	System.out.println("Suresh"+ ":"+updatedMarks[0]);
	System.out.println("Mahesh"+ ":"+updatedMarks[1]);
	System.out.println("Naresh"+ ":"+updatedMarks[2]);
	System.out.println("Average Marks of all Students" + ":"+(updatedMarks[0]+updatedMarks[1]+updatedMarks[2] )/3);
	
	 
	
	
	
	
			
			
	}
}
