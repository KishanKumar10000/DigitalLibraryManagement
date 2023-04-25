import java.util.Scanner;


public class Library {

		public static void main(String[] args)
	{
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(
				"~~~~~~~~~~~~Welcome to the Library Management System!~~~~~~~~~~~~~~~~~");
			System.out.println(
				"	       Select From The Following Options:			 ");
			System.out.println(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			
			Books ob = new Books();
			
			Students obStudent = new Students();

			int choice;
			int searchChoice;
			do {

				ob.dispMenu();
				choice = sc.nextInt();

				
				switch (choice) {

					
				case 1:
						ob.addBook();
					break;

				case 2:
					ob.upgradeBQuantity();
					break;

				
				case 3:

					System.out.println(
						" press 1 to Search with Book Serial No.");
					System.out.println(
						" Press 2 to Search with Book's Author Name.");
					searchChoice = sc.nextInt();

					
					switch (searchChoice) {

						
					case 1:
						ob.searchBySNo();
						break;

						
					case 2:
						ob.searchByAuthorName();
					break;

					}
				case 4:
					ob.showAllBooks();
					break;

				
				case 5:
					Student s = new Student();
					obStudent.addStudent(s);
					break;

					
				case 6:
					obStudent.showAllStudents();
					break;

					
				case 7:
					obStudent.checkOutBook(ob);
					break;

					
				case 8:
					obStudent.checkInBook(ob);
					break;

				default:
					System.out.println("ENTER BETWEEN 0 TO 8.");
				}

			}
			while (choice != 0);
		}
	}
}