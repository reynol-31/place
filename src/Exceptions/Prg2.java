package Exceptions;
public class Prg2 {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Divde by zero");
        }
    }
}
