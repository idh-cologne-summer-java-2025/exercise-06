package idh.java;

public class FibonacciDemo {

    //methode zur berechnung des n-ten Fibonacci-Werts
	//die ersten zwei werte sind fest und der rest wird aus ihnen errechnet 
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        //F(n) = F(n-1) + F(n-2) -> 0+1=1, 1+1=2, 1+2=3, 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; //anzahl der Fibonacci-Zahlen

        System.out.println("Die ersten " + n + " Fibonacci-Zahlen:");
        //for schleife zur ausgabe der Fibonacci-Zahlen
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
