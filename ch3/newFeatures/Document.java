package ch3.newFeatures;

public class Document implements Printable{
    @Override
    public void view(){
        System.out.println("Document is being viewed.");
    }

    @Override
    public void print() {
        System.out.println("Document is being printed.");
    }

}
