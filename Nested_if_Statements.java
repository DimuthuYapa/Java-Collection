public class Nested_if_Statements {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                System.out.printf("Final price: $%.2f%n", price * 0.7);
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                System.out.printf("Final price: $%.2f%n", price * 0.9);
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.printf("Final price: $%.2f%n", price * 0.8);
                price *= 0.8;
            } else {
                System.out.printf("Final price: $%.2f%n", price);
                price *= 1;
            }
        }
    }
}



