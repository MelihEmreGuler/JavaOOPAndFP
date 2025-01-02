package ch5;

public class RaisingExample {
    public static void main(String[] args) throws Throwable {
        method1();
        // it cant be printed
        System.out.println("After throw");
    }
    private static void method1() throws Throwable {
        method2();
    }
    private static void method2() throws Throwable {
        method3();
    }
    private static void method3() throws Throwable {
        throw new Throwable("Just kidding!");
    }

}
