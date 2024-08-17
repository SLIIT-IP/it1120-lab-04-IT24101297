import java.util.Scanner;
public class IT24101297Lab4Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double examMarks;
		double labMarks;
		double examMarksPerc;
		double labMarksPerc;
		double finalExamMark;
		double finalLabMark;
		double finalMarks;

		System.out.println("Please enter Exam Marks (out of 100): ");
		examMarks = scanner.nextDouble();

		if (examMarks<0 || examMarks>100) {
			System.out.println("Invalid input for exam marks. Terminating program. ");
			System. exit(0);
		}

		System.out.println("Please enter lab submission marks (out of 100) : ");
		labMarks = scanner.nextDouble();

		if (labMarks<0 || labMarks>100) {
			System.out.println("Invalid input for lab marks. Terminating program.");
			System. exit(0);
		}
		
		System.out.println("Please enter the percentage given for the exam: ");
		examMarksPerc = scanner.nextDouble();
		System.out.println("Please enter the percentage given for the lab submission: ");
		labMarksPerc = scanner.nextDouble();

		if (examMarksPerc + labMarksPerc != 100) {
			System.out.println("The percentages must add up to 100. Terminating program.");
			System. exit(0);
		}

		finalExamMark = examMarks*examMarksPerc/100;
		finalLabMark = labMarks*labMarksPerc/100;

		finalMarks = finalExamMark + finalLabMark;

		System.out.println("Your Final Mark is " + finalMarks);




		
	}
}