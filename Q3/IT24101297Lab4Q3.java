import java.util.Scanner;
public class IT24101297Lab4Q3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        double number = scanner.nextInt();

        String Number = (number > 0) ? "The number is positive." :
                        (number < 0) ? "The number is negative." :
                        "The number is zero.";
    
        System.out.println(Number);
        scanner.close();
    }
}
