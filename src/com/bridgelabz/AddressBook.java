package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBook addressBook = new AddressBook();
        boolean condition = true;
        while (condition) {
            System.out.println("Choose the options \n1.AddContact\n2.EditContact\n3.DeleteContact\n4.AddMultipleContacts\n5.Exit");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContacts();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.addMultipleContacts();
                    break;
                case 5:
                    condition = false;
                    System.out.println("Exiting the loop....");
                    break;
                default:
                    System.out.println("Enter the correct number");
            }
        }
    }

    public void addContact() {
        Contact addressBook = new Contact();
        System.out.println("Enter a first name:");
        addressBook.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        addressBook.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        addressBook.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        addressBook.setCity(scanner.next());
        System.out.println("Enter a state:");
        addressBook.setState(scanner.next());
        System.out.println("Enter a email:");
        addressBook.setEmailId(scanner.next());
        System.out.println("Enter a zip code:");
        addressBook.setZip((scanner.nextInt()));
        System.out.println("Enter a phone number:");
        addressBook.setPhoneNumber((scanner.nextLong()));
        contactList.add(addressBook);
        System.out.println(contactList);
        System.out.println("Contact added success fully");
    }

    public void editContacts() {
        System.out.println("Enter first or last name  to edit ");
        String editName = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(editName) || contactList.get(i).getLastName().equals(editName)) {
                System.out.println("Select options \n1.first name \n2.last name\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.phoneNum\n9.Exit ");
                int edit = scanner.nextInt();
                switch (edit) {
                    case 1 -> {
                        System.out.println("Enter first name ");
                        String editFirstName = scanner.next();
                        contactList.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                    }
                    case 2 -> {
                        System.out.println("Enter last name ");
                        String editLastName = scanner.next();
                        contactList.get(i).setLastName(editLastName);
                        System.out.println(editLastName);
                    }
                    case 3 -> {
                        System.out.println("Enter Address ");
                        String editAddress = scanner.next();
                        contactList.get(i).setAddress(editAddress);
                        System.out.println(editAddress);
                    }
                    case 4 -> {
                        System.out.println("Enter city ");
                        String editCity = scanner.next();
                        contactList.get(i).setCity(editCity);
                        System.out.println(editCity);
                    }
                    case 5 -> {
                        System.out.println("Enter state ");
                        String editState = scanner.next();
                        contactList.get(i).setState(editState);
                        System.out.println(editState);
                    }
                    case 6 -> {
                        System.out.println("Enter email ");
                        String editEmail = scanner.next();
                        contactList.get(i).setEmailId(editEmail);
                        System.out.println(editEmail);
                    }
                    case 7 -> {
                        System.out.println("Enter zipcode");
                        int editZip = scanner.nextInt();
                        contactList.get(i).setZip((editZip));
                        System.out.println(editZip);
                    }
                    case 8 -> {
                        System.out.println("Enter phone number ");
                        long editPhoneNumber = scanner.nextLong();
                        contactList.get(i).setPhoneNumber((editPhoneNumber));
                        System.out.println(editPhoneNumber);
                    }
                    default -> System.out.println("Exit the loop");
                }
                System.out.println("Contact edited successfully");
                System.out.println(contactList);
            } else {
                System.out.println("Contact not found ");
            }
        }
    }


    public void deleteContact() {
        System.out.println("Enter first or last name to Delete contact");
        String confirmName = scanner.next();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(confirmName) || contactList.get(i).getLastName().equals(confirmName)) {
                Contact person = contactList.get(i);
                contactList.remove(person);
                System.out.println("Contact delete successfully");
            } else {
                System.out.println("Contact not found in AddressBook");
            }

            System.out.println(contactList);
        }
    }

    public void addMultipleContacts() {
        System.out.println("Enter number of contacts added to the AddressBook");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            addContact();
            System.out.println(i + 1 + "-->Contact added successfully");
        }
    }

    public void showContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            Set<Contact> productSet = contactList.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Contact::toString))));
            productSet.forEach(System.out::println);
        }
    }

    public void searchCityOrState() {
        System.out.println("Enter the city or state to search Contact ");
        String input = scanner.next();
        for (Contact book : contactList) {
            if (book.getCity().equals(input) || book.getState().equals(input)) {
                System.out.println("Matches with city name contact is :" + book);
            }
        }
    }

    public void sortingByPersonName() {
        if (contactList.isEmpty()) {
            System.out.println("Contacts book is empty");
        } else {
            contactList.stream().sorted(Comparator.comparing(Contact::getFirstName)).forEach(System.out::println);
        }
    }
}