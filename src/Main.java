import menu.Menu;
import menu.MenuAction;
import menu.actions.AddContactMenuAction;
import menu.actions.ReadAllContactsMenuAction;
import menu.actions.RemoveContactMenuAction;
import menu.actions.SearchContactByNameMenuAction;
import services.ContactsService;
import services.InMemoryContactsService;
import ui.ContactView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactView contactView = new ContactView(scanner);
        ContactsService contactsService = new InMemoryContactsService();

        List<MenuAction> menuActionList = Arrays.asList(
                new AddContactMenuAction(contactsService, contactView),
                new ReadAllContactsMenuAction(contactsService, contactView),
                new RemoveContactMenuAction(contactsService, contactView),
                new SearchContactByNameMenuAction(contactsService, contactView)
        );
        Menu menu = new Menu(scanner, menuActionList);
        menu.run();
    }
}
