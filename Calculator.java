public class Calculator {
    public static void main(String[] args) {
        double n1 = 20;
        double n2 = 5;
        double n3 = 27;

        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = (n1 / n2);

        System.out.println("addition: " + add);
        System.out.println("substraction: " + sub);
        System.out.println("mult: " + mul);
        
        if (n2 != 0) {
            System.out.println("division: " + div);
        } else {
            System.out.println("division: Cannot divide by zero.");
        }
        System.out.println("Power: " + Math.pow(n1, n2));
        System.out.println("Cube Root: " + Math.cbrt(n3));
        System.out.println("Square Root: " + Math.sqrt(n1));
    }
}