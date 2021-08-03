package ui;

import models.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private Scanner scanner;

    public ContactView(Scanner scanner) {
        this.scanner = scanner;
    }
    public Contact readContact() {
        System.out.print("Enter contact Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact Phone: ");
        String phone = scanner.nextLine();
        return new Contact(name, phone);
    }

    public Integer readContactIdForRemove() {
        System.out.print("Enter contact ID for deleting: ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String readContactNameForSearch() {
        System.out.println("Enter Name for search: ");
        String name = scanner.nextLine();
        return name;
    }

    public void writeContact(Contact contact) {
        System.out.printf("%d - %s: %s\n",
                contact.getId(),
                contact.getName(),
                contact.getPhone());
    }

    public void writeContacts(List<Contact> contacts) {
        System.out.println("-------Contacts-------");
        for (Contact contact : contacts) {
            writeContact(contact);
        }
        System.out.println("----------------------");
    }
}
