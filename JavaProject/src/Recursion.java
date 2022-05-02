public class Recursion {
    // Important thing is Recursion is that it requires a base condition
    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return factorial(n-1)*n;
    }
    static int sumNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        int sum = 0;
        sum = sumNaturalNumbers(n-1) + n;
        return sum;
    }
    public static void main(String[] args) {
        int value = factorial(5);
        System.out.println(value);
        // Recursion to calculate sum of first n natural number;
        int naturalNumberSum = sumNaturalNumbers(100);
        System.out.println(naturalNumberSum);
    }


}
