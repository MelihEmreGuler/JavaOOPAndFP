package ch5.closable;

import java.util.Random;

public class ClosableExample {
    public static void main(String[] args) {
        try (Closable c1 = new Closable("first", true);
             Closable c2 = new Closable("second", true)) {
            System.out.println("int try block.");
            throwException();
        }catch (Exception e){
            System.out.println("in catch block.");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("in finally block.");
        }
        System.out.println("after try block.");
    }

    public static void throwException() throws Exception {
        if (Math.random() < 0.5) {
            System.out.println("Throwing an exception!");
            throw new Exception("Random number is smaller than 0.5");
        }
    }

}
