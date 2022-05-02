public class Methods {
    void nonStaticFunction(){
        System.out.println("This is a non static function");
    }
    static void staticFunction(){
        System.out.println("This is a static function hence is called without creating an object for the class");
    }

    static void changeTheArray(int[] array){
        array[0] = 0;
        System.out.println("The value of address of Array inside the Method is: " + array);
    }

    static void methodOverloading(int a){
        System.out.println("This function only accepts one parameter:  and you have passed: " + a);
    }
    static void methodOverloading(int a, int b){
        System.out.println("This function accepts two parameters and you have passed: " + a + " and " + b);
    }
    public static void main(String[] args) {
        // Normally to call a function/method we first need to create an object of that method and then make function cal
        // But if we use static we don't need to create an object
        /*
        Static Keyword is used to associate a method of a given class with a class rather than the object.
        Static method in a class is shared by all the objects
         */

        //Calling a non-static function
        Methods obj = new Methods();
        obj.nonStaticFunction();

        //Calling a static function
        staticFunction();

        /*
        Call by Value and Call by Reference
        In case the parameters passed to a function is of Primitive type like INT, CHAR, FLOAT, a copy of value is passed
        But in case of objects and arrays the reference/address to that actual array is passed
         */

        int[] marks = {93,24,36,55,19};
        System.out.println(marks[0]);
        changeTheArray(marks);
        System.out.println("The value of address of Array inside the Main is: " + marks);
        System.out.println(marks[0]);

        // Method Overloading
        /*
        Two methods with same name but different parameter can perform two different tasks
        This is called method overloading
        The calling function has arguments and the called function has parameters
        Arguments are actual
         */
        methodOverloading(10);
        methodOverloading(10,20);

    }
}
