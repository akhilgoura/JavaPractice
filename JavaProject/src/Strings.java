import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "akhil Goura yy y";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim()); // Deletes spaces from start and end of string
        System.out.println(name.substring(1,11));
        System.out.println(name.replace('A','r'));
        System.out.println(name.startsWith("Akhil"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(10));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a',11));
        System.out.println(name.lastIndexOf('a'));

        String testString = "My Name is Akhil Goura";
        System.out.println(testString.replace(' ', '_'));

        int age = 18;
        if(age<18){
            System.out.println("You are not eligible to drive");
        }else if(age == 18){
            System.out.println("Go For a learner's license");
        }else{
            System.out.println("You have a license");
        }

        // Calculate income tax

        double incomeInLakhs;
        System.out.println("Please enter your income in lakhs: ");
        Scanner inp = new Scanner(System.in);
        incomeInLakhs = inp.nextDouble();
        if(incomeInLakhs > 2.5 && incomeInLakhs < 5.0){
            System.out.println("Your tax will be "+incomeInLakhs*5/100);
        }else if(incomeInLakhs >= 5.0 && incomeInLakhs < 10.0){
            System.out.println("Your tax will be "+incomeInLakhs*20/100);
        } else if (incomeInLakhs >= 10.0) {
            System.out.println("Your tax will be "+incomeInLakhs*30/100);
        }else{
            System.out.println("Your income is too low to be taxed");
        }

        String givenURL = "google.com";
        if(givenURL.contains(".com")){
            System.out.println("International Website");
        }

    }
}
