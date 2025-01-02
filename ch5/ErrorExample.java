package ch5;

public class ErrorExample {
    public static void main(String[] args) {
        throwError();
    }
    public static void throwError(){
        throw new OutOfMemoryError("Just kidding!");
    }
}
