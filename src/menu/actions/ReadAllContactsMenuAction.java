package menu.actions;

import menu.MenuAction;
import models.Contact;
import services.ContactsService;
import ui.ContactView;

import java.util.List;

public class ReadAllContactsMenuAction implements MenuAction {

    private final ContactsService contactsService;
    private final ContactView contactView;

    public ReadAllContactsMenuAction(ContactsService contactsService, ContactView contactView) {
        this.contactsService = contactsService;
        this.contactView = contactView;
    }

    @Override
    public void doAction() {
        List<Contact> contacts = contactsService.getAll();
        contactView.writeContacts(contacts);
    }

    @Override
    public String getName() {
        return "Show all contacts";
    }
}
