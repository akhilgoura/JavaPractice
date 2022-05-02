public class VariableArgument {
    // Using this type of Param we can send any number of integer
    static int VarArgs(int ...arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int VarArgs(String name, int ...arr){
        System.out.println(name);
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(VarArgs(1,23,4,5,56,6,6));
        System.out.println(VarArgs("Akhil", 2,3,4,5,5,65,44,3));

    }
}
