import java.util.Scanner;
public class IT24103504Lab7Q1 {
    public static void main(String[] args) {

        double avg;
        double mark1, mark2, mark3, mark4;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for 4 subjects:");
        System.out.println("Enter subject mark 1: ");
        mark1 = input.nextDouble();

        System.out.println("Enter subject mark 2: ");
        mark2 = input.nextDouble();

        System.out.println("Enter subject mark 3: ");
        mark3 = input.nextDouble();

        System.out.println("Enter subject mark 4: ");
        mark4 = input.nextDouble();

        avg = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Average is: " + avg);
        if (100 >= avg && avg >= 75) {
            System.out.println("overall grade is: Distinction");
        } else if (75 >= avg && avg >= 50) {
            System.out.println("overall grade is: Credit");
        } else if (0 <= avg && avg < 50) {
            System.out.println("overall grade is: Fail.Work Hard");
        } else {
            System.out.println("Invalid marks");
        }
    }
}