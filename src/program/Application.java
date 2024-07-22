package program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> studentsA = new HashSet<>();
		Set<Integer> studentsB = new HashSet<>();
		Set<Integer> studentsC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		addStudents(scanner.nextInt(), studentsA, scanner);
		
		System.out.print("How many students for course B? ");
		addStudents(scanner.nextInt(), studentsB, scanner);

		System.out.print("How many students for course C? ");
		addStudents(scanner.nextInt(), studentsC, scanner);

		Set<Integer> totalStudents = new HashSet<>(studentsA);
		totalStudents.addAll(studentsB);
		totalStudents.addAll(studentsC);
		
		System.out.println("Total students: " + totalStudents.size());
		scanner.close();
	}

	public static void addStudents(int studentsQuantity, Set<Integer> students, Scanner scanner) {
		for (int i = 0; i > studentsQuantity; i++) {
			students.add(scanner.nextInt());
		}
	}

}
