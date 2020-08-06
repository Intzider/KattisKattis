package kattis_kattis.dif_3;

        import java.math.BigInteger;
        import java.util.Scanner;

public class PseudoprimeNumbers {
    static final BigInteger ONE = BigInteger.ONE;
    private static boolean isPrime(BigInteger p) {
        BigInteger sqrt = p.sqrt();
        BigInteger i = BigInteger.valueOf(2);
        for (; i.compareTo(sqrt) <= 0; i = i.add(ONE)) {
            if (p.mod(i).equals(BigInteger.valueOf(0)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger p, a;

        while(!((p = in.nextBigInteger()).equals(BigInteger.valueOf(0))) && !((a = in.nextBigInteger()).equals(BigInteger.valueOf(0)))){
            if(!isPrime(p) && a.modPow(p, p).equals(a))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        in.close();
    }
}