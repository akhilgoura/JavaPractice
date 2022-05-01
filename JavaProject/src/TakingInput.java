import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of the two numbers that you entered is: " + sum);
        System.out.println("Let's try to enter one string, so please enter a string or your name: ");
        String myName = sc.nextLine();
        System.out.println("Your name is: " + myName);
    }
}
