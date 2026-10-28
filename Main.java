import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("I like pizza");
        System.out.println("Buy me this");

        int age = 34;
        boolean gender = true;


        System.out.println("There age is " + age);
        if(gender){System.out.println("This user is a male.");}
        else{System.out.println("This user is a female.");}
    


        System.out.println("What is your name?");S
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();

        
    }

    
}




