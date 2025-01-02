package ch3.newFeatures;

public interface Printable {
    void view();
    void print();
    default void format(){
        printHelper("Printable is being formatted.");
    }

    static void startPrinting(){
        System.out.println("Printing has been started.");
    }

    private void printHelper(String message){
        System.out.println("Message: "+ message);
    }

}
