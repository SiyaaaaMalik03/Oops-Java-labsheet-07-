import testpack.PublicClass;

public class AccessPackageMain {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.show();

        // DefaultClass cannot be accessed here
        // because it is not public.
    }
}