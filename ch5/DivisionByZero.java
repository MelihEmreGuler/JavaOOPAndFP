package ch5;

public class DivisionByZero {
    public static void main(String[] args) {
        try {
            divide(20, 0);
            System.out.println("After division.");
        }catch (ArithmeticException e){
            System.out.println("Problem occurred in division.");
            System.out.println("Message: " + e.getMessage());
        }finally {
            System.out.println("in finally");
        }
        System.out.println("After try-catch");
    }

    public static void divide(int num1, int num2) {
        System.out.println("dividing "+ num1 + " and " + num2);
        if (num2 == 0){
            throw new ArithmeticException("You can't divide by zero");
        }
        System.out.println(num1 + "/" + num2 + " = " + num1/num2);
    }
}
