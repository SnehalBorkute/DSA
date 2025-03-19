 import java.util.Scanner;
public class NPrimeSqare
{  
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to find the N-th term of Alice's sequence
    static int nthAliceChoice(int n) {
        int count = 0, num = 2, prime = 0;
        
        while (count < n) {
            if (isPrime(num)) {
                prime = num;
                count++;
            }
            num++;
        }
        return prime * prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println("The " + N + "-th term of Alice's sequence is: " + nthAliceChoice(N));
    }
}
