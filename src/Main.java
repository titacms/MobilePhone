import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your action: (6 to view menu)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    storeContact();
                    break;

                case 3:
                    modifyContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printInstructions();
                    break;

            }
        }
    }


    private static void printInstructions() {
        System.out.println("Press 1 to view all contacts");
        System.out.println("Press 2 to store contact");
        System.out.println("Press 3 to update existing contact");
        System.out.println("Press 4 to remove contact");
        System.out.println("Press 5 to query contact ");
        System.out.println("Press 6 to view menu");
        System.out.println("Press 0 to quit");
    }

    private static void storeContact(){
        System.out.println("Enter name for contact");
        String name = scanner.nextLine();
        System.out.println("Enter phone number for contact");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name,phoneNumber);
    }

    private static void modifyContact(){
        System.out.println("Enter name you want to change");
        String oldName = scanner.nextLine();
        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhoneNumber = scanner.nextLine();
        mobilePhone.modifyContact(oldName, newName, newPhoneNumber);
    }

    private static void removeContact(){
        System.out.println("Enter contact you want to remove");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    private static void queryContact(){
        System.out.println("Enter contact you want to query");
        String name = scanner.nextLine();
        mobilePhone.queryContact(name);
    }
}
