// Gracie Hackworth, ALC, February 27th, 2024
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //contact, no business
        Contact person1 = new Contact("Akira", "AkiraAkira@gmail.com");
        Contact person2 = new Contact("Ren","Ren@Persona5.com");

        //business
        Business person3 = new Business("Marayuki", "TheCounselor@Persona5.com","55502224444");


        //user input
        Scanner input = new Scanner(System.in);

        //retrieves user name
        System.out.println("What's your name?");
        String userName = input.nextLine();

        //retrieves user email
        System.out.println("What's your email?");
        String email = input.nextLine();

        //retrieves user phone number
        System.out.println("What's your phone number?");
        String phoneNum = input.nextLine();

        //creates an object using user's input
        Business user = new Business(userName,email,phoneNum);

        //display
        person1.display();
        person2.display();
        person3.display();
        user.display();
    }
}