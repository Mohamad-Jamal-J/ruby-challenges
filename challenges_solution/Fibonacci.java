// Note for the below two solutions the functions will return wrong values for big inputs, due to the range of values
// stepping outside the int range.
// we can catch that with extra input validation in the future.
public class Fibonacci {
    // This function returns the nth fibonacci term for a given number n, using constant space.
    public static double fibonacci(int n){
        if(n < 0){
            System.out.println("Invalid Input: "+n+", input must be a non-negative number.");
            return -1;
        }
        if(n == 0 || n == 1)
            return n;
        double fibonacci = 0;
        double secondPrev = 0; // (i-2)th fibonacci
        double prev = 1; // (i-1)th fibonacci
        for(double i = 2; i <= n; i++){
            fibonacci =  prev + secondPrev;
            prev = fibonacci;
            secondPrev = fibonacci - secondPrev;
        }
        return fibonacci;
    }
    // This function returns the fibonacci sequence up to the nth (input) term, using tabulation.
    // Note that this is the more familiar version, alongside the recursive one,
    // but I prefer the solution above when only the nth term is required, with constant space.
    public static int[] fibonacciSequence(int n){
        if(n < 0){
            System.out.println("Invalid Input: "+n+", input must be a non-negative number.");
            return new int[0];
        }
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        if (n == 0)
            return fibonacci;
        fibonacci[1] = 1;
        for(int i = 2; i <= n; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
