package ch3.newFeatures;

public class TestStaticMethod {
    public static void main(String[] args) {
        Printable printable = new Document();

        printable.print();
        // Call default method.
        printable.format();

        //The static startPrinting method can be called from a Document object with an interface reference.
        Printable.startPrinting();

        // static call via interface reference
        Printable.startPrinting();

        //Compiler error.
        //Static method may only be called on its containing interface
        //Document.startPrinting();

    }
}
