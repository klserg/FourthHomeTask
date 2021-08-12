import models.Contact;
import java.util.ArrayList;
import java.util.List;
import static utils.ListUtils.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Serhii", "093"));
        contacts.add(new Contact("Kate", "050"));
        contacts.add(new Contact("Stas", "050"));
        contacts.add(new Contact("Sasha", "093"));


        List<Contact> list = filter(contacts, contact -> contact.getPhone().contains("3"));
        for (Contact item : list) {
            System.out.printf("%s - %s\n", item.getName(), item.getPhone());
        }
        System.out.println();

        forEach(contacts, contact -> System.out.printf("%s - %s\n", contact.getName(), contact.getPhone()));
        System.out.println();

        boolean result = anyMatch(contacts, contact -> contact.getName().equals("Kate"));
        System.out.println(result);
        System.out.println();

        boolean result1 = allMatch(contacts, contact -> contact.getPhone().startsWith("0"));
        System.out.println(result1);
        System.out.println();

        List<Contact> list1 = map(contacts, contact -> contact.addCodeToPhone("+38"));
        for (Contact item : list1) {
            System.out.printf("%s - %s\n", item.getName(), item.getPhone());
        }
    }
}
