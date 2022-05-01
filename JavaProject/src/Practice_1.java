import java.util.Scanner;

public class Practice_1 {

    public static int EncryptGrade(int grade){
        grade += 8;
        return grade;
    }
    public static int DecryptGrade(int encryptedGrade){
        return (encryptedGrade - 8);
    }
    public static void main(String[] args) {
        float a = 7f/4f * 9f/2f;
        System.out.println(a);

        // Encrypt a Grade
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the grade of the student: ");
        grade = input.nextInt();
        System.out.println("Encrypted value of the Grade is: " + EncryptGrade(grade));
        System.out.println("Decrypted Value of grade is: "+ DecryptGrade(EncryptGrade(grade)));

    }
}
