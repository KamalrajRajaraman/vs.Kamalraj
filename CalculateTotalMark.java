package ClosedBook;

public class CalculateTotalMark {
	public static void main(String[] args) {
		int Student[][] = {
				{10,10},{20,20}
		};
		
		for(int i =0;i<Student.length;i++) {
			int mark =0;
			System.out.print("Student :"+(i+1)+"=");
			for(int j=0;j<Student[i].length;j++) {
				mark = mark+Student[i][j];
				
			}
			System.out.println("marks:"+mark);
		}
	}
	
}
