package services;

import models.Contact;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactsService implements ContactsService {
    List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> getAll() {
        return contacts;
    }

    @Override
    public void addContact(Contact contact) {
        int id = 0;
        if (contacts.size() > 0) {
            int max = contacts.get(0).getId();
            for (Contact c : contacts) {
                if (c.getId() > max)
                    max = c.getId();
            }
            id = max + 1;
        }
        contact.setId(id);
        contacts.add(contact);
    }

    @Override
    public void removeContact(Integer index) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId().equals(index))
                contacts.remove(contacts.get(i));
        }
    }

    @Override
    public List<Contact> searchContactByName(String name) {
        List<Contact> list = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().startsWith(name))
                list.add(contact);
        }
        return list;
    }
}
