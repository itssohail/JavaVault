package ExceptionHandling.ExceptionTasks;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3, 4, 5};
            int index =6;
            array(arr,index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        System.out.println(a / b);
    }

    static void array(int[] arr,int index) {
            if (index >= arr.length || index < 0) {  // Check if index is out of bounds
                throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of length " + arr.length);
            }
            System.out.println("Element at index " + index + ": " + arr[index]); // Safe access
        }

}