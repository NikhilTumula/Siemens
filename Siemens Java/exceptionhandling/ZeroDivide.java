package exceptionhandling;

import java.util.Scanner;

public class ZeroDivide{

    public void Division() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n1 = sc.nextInt();

            int n2 = sc.nextInt();

            try {
                System.out.println("N1 divided by N2 gives: "+n1/n2);
                break;
            } catch (ArithmeticException ex) {
                System.out.println("Try again! Invalid input");
                //TODO: handle exception
            }
            
        }
        sc.close();
    }

    public static void main(String[] args) {

        ZeroDivide obj = new ZeroDivide();

        obj.Division();

        System.out.println("program ends successfully!!!");
    }
    
}
 