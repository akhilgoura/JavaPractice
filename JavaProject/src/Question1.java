import java.util.Scanner;

public class Question1 {

    public static double CalculatePercentage(double marksSub1, double marksSub2, double marksSub3, double marksSub4, double marksSub5){
        double totalMarks = marksSub1 + marksSub2 + marksSub3 + marksSub4 + marksSub5;
        double percentage = (totalMarks / 500) * 100;
        return  percentage;
    }
    public static void main(String[] args) {
        /*
        double marks1, marks2, marks3, marks4, marks5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks for Subject 1: ");
        marks1 = input.nextDouble();
        System.out.println("Enter Marks for Subject 2: ");
        marks2 = input.nextDouble();
        System.out.println("Enter Marks for Subject 3: ");
        marks3 = input.nextDouble();
        System.out.println("Enter Marks for Subject 4: ");
        marks4 = input.nextDouble();
        System.out.println("Enter Marks for Subject 5: ");
        marks5 = input.nextDouble();
        System.out.println("The percentage is: " + CalculatePercentage(marks1, marks2, marks3, marks4, marks5));
         */

        // To check If a number entered by a person is integer or not
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        Boolean isInteger = input.hasNextInt();
        System.out.println("Whether the value you have entered is an Integer = " + isInteger);





    }
}
