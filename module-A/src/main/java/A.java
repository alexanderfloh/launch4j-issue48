
public class A {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Hello from A!");
        if(A.class.getClassLoader().getResource("someConfigFile.xml") == null) {
            System.out.println("file not found on classpath");
        }
        else {
            System.out.println("file found!");
        }
    }
}