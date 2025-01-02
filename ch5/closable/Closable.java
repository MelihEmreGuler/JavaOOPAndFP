package ch5.closable;

public class Closable implements AutoCloseable {
    private final String name;
    private boolean open;

    public Closable(String name, boolean open) {
        System.out.println("Closable object constructing with name: " + name);
        this.name = name;
        this.open = open;
    }

    public void close() {
        System.out.println("Closing Closable object: " + name);
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
