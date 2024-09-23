
import java.util.Random;

public class Prime {
    public static void main (String[] args) {
    
    Random random = new Random();
    final int NUM = random.nextInt(0, 100);
        int i = 0;

    if(NUM >= 2) {
        i = 2;
    }
    while (NUM%i != 0) { i++; }

    System.out.printf("%d %s primo. \n", NUM, NUM == i ? "es" : "no es");  
    }
}