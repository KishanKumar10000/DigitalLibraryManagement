import java.util.Scanner;
public class Student {
	String studentName;
	String recommendedbooks;
	String recommendedAuthors;
	String regNum;
	Book borrowedBooks[] = new Book[3];
	public int booksCount = 0;
	Scanner sc = new Scanner(System.in);
	public Student()
	{
		System.out.println("Enter Student Name:");
		this.studentName = sc.nextLine();
		System.out.println("Enter Registration Number:");
		this.regNum = sc.nextLine();
	}
}