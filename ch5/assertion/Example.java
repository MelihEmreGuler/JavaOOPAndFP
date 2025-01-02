package ch5.assertion;

public class Example {
    public static void main(String[] args) {
        int i = 10;

        assert i < 15; // Here, i must be greater than 15

        assert i < 5 : "Must be more than 5";
    }
}
