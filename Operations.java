public class Operations {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
        } else {
            System.out.println("Division not possible (divide by zero)");
        }
    }
}
