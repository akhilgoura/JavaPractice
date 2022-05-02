public class Arrays {
    public static void main(String[] args) {
        int [] marksOfStudents = new int[5];
        System.out.println(marksOfStudents.length);
        for(int i =0; i<5; i++){
            marksOfStudents[i] = i * 5 + 5;
        }
        for (int element: marksOfStudents
             ) {
            System.out.println(element);
        }

        System.out.println(marksOfStudents);
        int [] newArray = {1,2,3,4,5};
        System.out.println(newArray.length);

        // 2-D Array

        int [][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i = 0; i<flats.length; i++){
            for (int j =0; j<flats[i].length; j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println("");
            System.out.println("--------------");
        }

        // Array of 5 floats and calculate their sum

        float [] floatArray = {1.1f, 6.6f, 8.0f, 9.1f, 66.7f};
        float floatSum = 0;
        for (float value: floatArray
             ) {
            floatSum += value;
        }
        System.out.println(floatSum);

        // Problem 2 - Find wther a given integer is present in an array or not>
        int [] problem2Array = {1,2,3,4,5,6};
        int numberToCheck = 5;
        Boolean isPresent = false;
        for(int i =0; i<problem2Array.length; i++){
            if(problem2Array[i] == numberToCheck){
                System.out.println("The number: " + problem2Array[i] + " is present in the array");
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            System.out.println("The number: " + numberToCheck + " is not present in the array");
        }

        // Add Two Matrix
        int[][] matrix1 = {{1,1},{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1},{1,1}};
        int [][] sumMatrix = new int[3][2];
        for(int i = 0; i<matrix1.length; i++){
            for (int j = 0 ; j<matrix1[i].length; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i<matrix1.length; i++){
            for (int j = 0 ; j<matrix1[i].length; j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println("");
        }

        // Reverse an Array
        int [] normalArray = {1,0,3,4,5,6};
        int [] reverseArray = new int[normalArray.length];
        int startIndex = 0;
        int value = normalArray.length;
        for(int i = normalArray.length; i>0; i--){
            reverseArray[startIndex] = normalArray[i-1];
            startIndex++;
        }
        for (int value1: reverseArray
             ) {
            System.out.println(value1);
        }

        // Find Whether an array is sorted or not

        for(int i = 0; i<normalArray.length - 1; i++){
            if(normalArray[i] > normalArray[i+1]){
                System.out.println("Array is not sorted");
            }
        }
    }
}
