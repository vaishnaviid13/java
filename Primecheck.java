import java.util.*;
 class PrimeCheck {
    public static void main(String[] args)
    {
        int num =
        Integer.parseInt(args[0]);
        boolean isPrime = true;
        if (num<= 1) isPrime = false;
        for(int i = 2; i<= num/2; i++)
        {
            if (num % i ==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        System.out.println(num + "is a prime number.");
        else
        System.out.println(num + "is not a prime number");
    }
}