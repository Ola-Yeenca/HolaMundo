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
        boolean found = false;
        String searchLower = search.toLowerCase();

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().toLowerCase().contains(searchLower) ||
                    contact.getSurname().toLowerCase().contains(searchLower) ||
                    String.valueOf(contact.getDigits()).contains(searchLower)) {
                System.out.println("Contact " + (i + 1) + ": " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found for search term: " + search);
        }
    }



    public void deleteContact(String search) {
        try {
            int count = Integer.parseInt(search);
            for (int i = 0; i < count && !contacts.isEmpty(); i++) {
                contacts.remove(contacts.size() - 1);
            }
            System.out.println("Deleted " + search + " contacts successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number to delete contacts.");
        }
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("PhoneBook { contacts=[\n");

        for (Contact contact : contacts) {
            result.append(contact).append(",\n");
        }

        if (!contacts.isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }

        result.append("\n] }");

        return result.toString();
    }
}
