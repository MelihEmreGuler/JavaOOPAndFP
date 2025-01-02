package ch5;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample ste = new StackTraceExample();
        ste.method1();
    }

    public void method1() {
        method2();
    }

    private void method2()  {
        Throwable throwable = new Throwable("Just kidding :)");
        //throw throwable;
        //throwable.printStackTrace();
        //printStackTraceForThrowable(throwable);

    }

    public void printStackTraceForThrowable(Throwable throwable) {
        System.out.println("*** Stack Trace ***");
        StackTraceElement[] traces = throwable.getStackTrace();
        for (StackTraceElement trace : traces) {
            System.out.println("New stack info:");
            System.out.println("File name:" + trace.getFileName());
            System.out.println("Class name:" + trace.getClassName());
            System.out.println("Method name:" + trace.getMethodName());
            System.out.println("Line number: " + trace.getLineNumber());
            System.out.println();
        }
    }
}
