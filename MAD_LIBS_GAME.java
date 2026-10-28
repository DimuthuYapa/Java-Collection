import java.util.Scanner;


public class MAD_LIBS_GAME{
    public static void main(String[] args) {
       // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("The " + adjective + " " + noun + " " + verb + " "+ adverb + ".");
        
        scanner.close();







}
}