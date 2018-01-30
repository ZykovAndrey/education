package HelloNeHello;

public class Matematica {
    public static long fact(int n) {
        long fact = 1;
        if (n == 0)
            return fact;
        if (n < 0 || n > 25)
            throw new IllegalArgumentException("Не надо так!");
        while (n > 1) {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }

    public static long fib(int i) {
        if (i < 0)
            throw new IllegalArgumentException("Не надо так!");
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}
