package services;

import models.Contact;

import java.util.List;

public interface ContactsService {
    List<Contact> getAll();
    void addContact(Contact contact);
    void removeContact(Integer index);
    List<Contact> searchContactByName(String name);
}
