package menu.actions;

import menu.MenuAction;
import models.Contact;
import services.ContactsService;
import ui.ContactView;

public class AddContactMenuAction implements MenuAction {

    private final ContactsService contactsService;
    private final ContactView contactView;

    public AddContactMenuAction(ContactsService contactsService, ContactView contactView) {
        this.contactsService = contactsService;
        this.contactView = contactView;
    }

    @Override
    public void doAction() {
        Contact contact = contactView.readContact();
        contactsService.addContact(contact);
    }

    @Override
    public String getName() {
        return "Add contact";
    }
}
