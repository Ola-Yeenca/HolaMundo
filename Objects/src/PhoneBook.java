import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private static class Contact {
        private final String name;
        private final String surname;
        private final long digits;

        public Contact(String name, String surname, long digits) {
            this.name = name;
            this.surname = surname;
            this.digits = digits;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        public long getDigits() {
            return digits;
        }
    }

    private final List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String surname, long digits) {
        Contact contact = new Contact(name, surname, digits);
        contacts.add(contact);
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void viewContact(String search) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(search) ||
                    contact.getSurname().equalsIgnoreCase(search) ||
                    String.valueOf(contact.getDigits()).equalsIgnoreCase(search)) {
                System.out.println(contact);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("PhoneBook { contacts=[");

        for (Contact contact : contacts) {
            result.append("Contact { name='").append(contact.name).append("', surname='").append(contact.surname)
                    .append("', digits=").append(contact.digits).append(" }, ");
        }

        if (!contacts.isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }

        result.append("] }");

        return result.toString();
    }
}
