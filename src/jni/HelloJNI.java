package jni;

public class HelloJNI {
    
    static {
        System.load("hello");
    }
    
    public static void main (String[] args) {
        sayHello();
    }
    
    private static native void sayHello();
    
    
    

}
