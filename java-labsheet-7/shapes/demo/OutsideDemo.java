import demo.AccessDemo;

public class OutsideDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println(obj.publicValue);

        // The following members are not accessible
        // from this unrelated class outside package demo:
        // obj.protectedValue;
        // obj.defaultValue;
        // obj.privateValue;
    }
}