import java.util.Scanner;
public class IT24103504Lab7Q1b {
    public static void main(String[] args) {

        int count;
        double avg;
        double mark1, mark2, mark3, mark4;
        Scanner input = new Scanner(System.in);
      
        for(count=1;count<=3;count++){

        System.out.println("Student "+ count);
        System.out.print("Enter marks:"+" "+" "+" "+" ");
                mark1 = input.nextDouble();
                mark2 = input.nextDouble();
                mark3 = input.nextDouble();
                mark4 = input.nextDouble();

        avg = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Average is: " + avg);
        if (100 >= avg && avg >= 75) {
            System.out.println("overall grade is: Distinction");
        } else if (75 >= avg && avg >= 50) {
            System.out.println("overall grade is: Credit");
        } else if (0 <= avg && avg < 50) {
            System.out.println("overall grade is: Fail.Work Hard");
        } else 
            System.out.println("Invalid marks"); 
        
        }
    }
}