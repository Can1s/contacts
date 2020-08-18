package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook contacts = new PhoneBook();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Enter action (add, remove, edit, count, list, exit): ");
            String action = scanner.nextLine();
            switch (action) {
                case "add":
                    Human human = new Human();
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    human.setName(name);
                    System.out.print("Enter the surname: ");
                    String surname = scanner.nextLine();
                    human.setSurname(surname);
                    System.out.print("Enter the number: ");
                    String number = scanner.nextLine();
                    human.setNumber(number);
                    contacts.addHuman(human);
                    System.out.println("The record added.");
                    break;
                case "remove":
                    if (contacts.getListSize() == 0) {
                        System.out.println("No records to remove!");
                    } else {
                        contacts.getList();
                        System.out.print("Select a record: ");
                        int record = scanner.nextInt();
                        contacts.removeHuman(record);
                        System.out.println("The record removed!");
                    }
                    break;
                case "edit":
                    if (contacts.getListSize() == 0) {
                        System.out.println("No records to edit!");
                    } else {
                        contacts.getList();
                        System.out.print("Select a record: ");
                        int record = Integer.parseInt(scanner.nextLine());
                        Human human1 = contacts.getHuman(record);
                        System.out.print("Select a field (name, surname, number): ");
                        switch (scanner.nextLine()) {
                            case "name":
                                System.out.print("Enter name: ");
                                human1.setName(scanner.nextLine());
                                break;
                            case "surname":
                                System.out.print("Enter surname: ");
                                human1.setSurname(scanner.nextLine());
                                break;
                            case "number":
                                System.out.print("Enter number: ");
                                human1.setNumber(scanner.nextLine());
                                break;
                        }
                        contacts.editHuman(record, human1);
                        System.out.println("The record updated!");
                    }
                    break;
                case "count":
                    System.out.println("The Phone Book has " + contacts.getListSize() + " records.");
                    break;
                case "list":
                    contacts.getList();
                    break;
                case "exit":
                    return;
            }

        }

    }

}

