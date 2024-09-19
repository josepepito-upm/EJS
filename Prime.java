
import java.util.Random;

public class Prime {
    public static void main (String[] args) {
    
    Random random = new Random();
    final int NUM = 2;
    boolean isPrime = false;

    if(NUM >= 2) {
        int i = 2;
    }
    while (NUM%i != 0) { i++; }

    isPrime = NUM == i;

    System.out.printf("%d %s primo. \n", NUM, isPrime ? "es" : "no es");  
    }
}