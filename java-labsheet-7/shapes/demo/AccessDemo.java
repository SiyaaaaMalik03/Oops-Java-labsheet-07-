package demo;

public class AccessDemo {
    public int publicValue = 1;
    protected int protectedValue = 2;
    int defaultValue = 3;
    private int privateValue = 4;

    public void showInsideClass() {
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}