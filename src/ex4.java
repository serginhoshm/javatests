import static java.lang.Integer.parseInt;

public class ex4 {
    public static void main(String[] args) {
        int a = 55555;
        int b = 1;
        int c = 36;

        System.out.println("a & b | c -> "  + (a & b | c));
        System.out.println("a & b -> " + (a & b));
        System.out.println("a & c -> " + (a & c));
        System.out.println("b & c -> " + (b & c));
        System.out.println("a + b + c -> " + (a + b + c));
        System.out.println("a + b -> " + (a + b));
        System.out.println("a + c -> " + (a + c));
        System.out.println("b + c -> " + (b + c));

    }
}

