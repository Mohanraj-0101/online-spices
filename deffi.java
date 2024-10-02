
import java.util.Scanner;

public class deffi {

    public static void main(String[] args) {
        long P, G, a, b, x, y, ka, kb;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the public key for u1: ");
        P = sc.nextLong();

        System.out.println(" Enter the public key for u1: ");
        G = sc.nextLong();

        System.out.println(" Enter the private key for u1: ");
        a = sc.nextLong();
        System.out.println(" Enter the private key for u1: ");
        b = sc.nextLong();

        x = calpow(P, a, G);
        y = calpow(P, b, G);

        ka = calpow(y, a, G);
        kb = calpow(x, b, G);

        System.out.println(" Secret key for u1: "+ka);
        System.out.println(" Secret key for u2: "+kb);

    }

    public static long calpow(long x, long y, long g) {

        long result = 0;
        if (y == 1) {
            result = x;
            return result;
        }

        result = ((long) Math.pow(x, y) % g);
        return result;

    }
}
