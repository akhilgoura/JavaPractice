import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        // While Loop
        int i = 0;
        while (i<=10){
            System.out.print(i + " ");
            i++;
        }


        //Do-While Loops
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while(j<3);


        // For loop
        for (int z = 0; z<4; z++){
            System.out.println("The value of Z is: "+ z);
        }
        // Break Statement and Contine statement
        System.out.println("Test code for break");
        for (int  a = 0; a<10; a++){
            if(a == 2){
                continue;
            }
            if(a == 5){
                break;
            }
            System.out.println(a);
        }

        // Program to print a pattern
        System.out.println(
                "Please enter a number of stars you want in the pattern"
        );
        Scanner input = new Scanner(System.in);
        int numberOfStars = 5;
        for (int f = numberOfStars; f >0; f--){
            for(int g =numberOfStars; g > 0; g--){
                System.out.print("*");
            }
            System.out.println("");
            numberOfStars--;
        }

        // Sum of First even numbers
        int n = 5;
        int sum = 0;
        for(int a = 0; a<n; a++){
            sum += 2*a;
        }
        System.out.println(sum);

        // Write multiplication table

        n = 17;
        for(i =1; i<=10;i++){
            System.out.println("11 * " + i + " = " + n*i);
        }

        // Table in reverse order
        for(i =10; i>=1;i--){
            System.out.println("11 * " + i + " = " + n*i);
        }

        // Factorial of a number
        long factorial = 1;
        n = 40;
        for(i= 1; i<= n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

        // Foreach loop
        String [] nameArray = {"Akhil", "Ayush", "Akshit", "Jassur"};
        for (String name: nameArray)
        {
            System.out.println(name);
        }
    }
}
