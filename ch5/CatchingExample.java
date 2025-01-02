package ch5;

public class CatchingExample {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("Method1 is clean");
        }catch (Throwable e){
            System.out.println("Caught Throwable: " + e.getMessage());
        }
        System.out.println("After catch");
    }
    private static void method1() throws Throwable{
        method2();
    }
    private static void method2() throws Throwable{
        method3();
    }
    private static void method3() throws Throwable{
        double r = Math.random();
        if(r < 0.5){
            System.out.println("problem random: " + r);
            throw new Throwable("Just kidding!");
        }
        System.out.println("no problem");
    }
}
