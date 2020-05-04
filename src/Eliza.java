import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Good day. What is your problem?");
        String response = "";

        do {
            System.out.println("Enter your response here or Q to quit: ");
            response = input.nextLine().toLowerCase();

            if (response.equals("q")) System.exit(1);

            System.out.printf("Why did you say %s?\n", response);
        } while (!response.equals("i am feeling great"));

        System.out.println("I am great you are feeling great.\n" +
                "Bye!");
    }
}
