public class Operations {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
        } else {
            System.out.println("Division not possible");
        }
    }
}
