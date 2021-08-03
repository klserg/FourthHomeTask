package menu.actions;

import menu.MenuAction;
import services.ContactsService;
import ui.ContactView;

public class RemoveContactMenuAction implements MenuAction {

    private final ContactsService contactsService;
    private final ContactView contactView;

    public RemoveContactMenuAction(ContactsService contactsService, ContactView contactView) {
        this.contactsService = contactsService;
        this.contactView = contactView;
    }
    @Override
    public void doAction() {
        contactsService.removeContact(contactView.readContactIdForRemove());
    }

    @Override
    public String getName() {
        return "Remove contact";
    }
}
