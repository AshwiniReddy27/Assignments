package language.basics;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		String[][][]semister= new String[5][6][6];
		semister[1][3][3]="Basic Electronics";
		semister[1][4][4]="Engineering Physcis";
		semister[3][2][2]="Fail(19)";
		semister[3][5][5]="Pass(87)";
		System.out.println(semister[1][3][3]);
		System.out.println(semister[1][4][4]);
		System.out.println(semister[3][2][2]);
		System.out.println(semister[3][5][5]);

	}

}