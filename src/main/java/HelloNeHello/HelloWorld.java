package HelloNeHello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello_World!");

        long fact = Matematica.fact(10);
        System.out.println("Факториал = " + String.valueOf(fact));

        int k = 11;
        for (int j = 1; j <= k; j++) {
            System.out.print(Matematica.fib (j) + " ");
        }
    }
}
