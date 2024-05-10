package Arrays;

//public class FibonacciSeries {
//    public static void main(String[] args){
//        long n = 5;
//        long first = 0;
//        long second = 1;
//        System.out.println("Fibonacci Series: ");
//        for (long i=0;i<n;i++){
//            System.out.println(first + " ");
//            long next = first + second;
//            first = second;
//            second = next;
//        }
//    }
//}


public class FibonacciSeries {
    public static int fibonacci(int n){
        if (n<=1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Fibonacci Series: ");
        for (int i=0;i<n;i++){
            System.out.println(STR."\{fibonacci(i)} ");
        }
    }
}