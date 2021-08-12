package utils;

import models.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListUtils {
    public static List<Contact> forEach(List<Contact> contactList, Consumer<Contact> contactConsumer) {
        for (Contact contact : contactList) {
            contactConsumer.accept(contact);
        }
        return contactList;
    }

    public static List<Contact> filter(List<Contact> contactList, Predicate<Contact> predicate) {
        List<Contact> list = new ArrayList<Contact>();
        for (Contact contact : contactList) {
            if (predicate.test(contact))
                list.add(contact);
        }
        return list;
    }

    public static <Contact, R> R reduce(List<Contact> list, R initValue, BiFunction<R, Contact, R> biFunction) {
        for (Contact contact : list) {
            initValue = biFunction.apply(initValue, contact);
        }
        return initValue;
    }

    public static boolean anyMatch(List<Contact> contactList, Predicate<Contact> predicate) {
        boolean result = false;
        for (Contact contact : contactList) {
            if (predicate.test(contact))
                result = true;
        }
            return result;
    }

    public static boolean allMatch(List<Contact> contactList, Predicate<Contact> predicate) {
        boolean result = true;
        for (Contact contact : contactList) {
            if (predicate.test(contact) != result)
                result = false;
        }
        return result;
    }

    public static List<Contact> map(List<Contact> contactList, Function<Contact, Contact> function) {
        List<Contact> list = new ArrayList<>();
        for (Contact contact : contactList) {
            list.add(function.apply(contact));
        }
        return list;
    }
}
