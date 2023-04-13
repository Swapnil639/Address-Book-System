package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
     Map<String, AddressBookSystem> addressBookSystemMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");
        AddressBook addressBook=new AddressBook();
        boolean condition = true;
        while (condition) {
            System.out.println("\n" + "1.AddNewAddressBook" + "\n" + "2.AddContact" + "\n" + "3.EditContact" + "\n" + "4.DeleteContact" + "\n" + "5.AddMultipleContact");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.addNewAddressBook();
                    break;
                case 2:
                    addressBook.addContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    addressBook.addMultipleContact();
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }


    public void addNewAddressBook() {
        System.out.println("Enter the name of new address book");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            addressBookSystemMap.put(bookName, addressBook);
            System.out.println(addressBookSystemMap.entrySet());
            System.out.println("Successfully added new address book");
        } else {
            System.out.println("Address book with this name already exist");
        }
    }


    public void addContact() {
        System.out.println("Enter the name of address book to add contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("No book found with this name ");
        } else {
            addressBook.addContactDetails();
        }
    }


    public void editContact() {
        System.out.println("Enter the name of address book edit ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.editContactDetails();
        }
    }


    public void deleteContact() {
        System.out.println("Enter the name of address book to delete contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.deleteContact();
        }
    }


    public void addMultipleContact() {
        System.out.println("Enter the address book name to add multiple contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.addMultipleContact();
        }
    }
}
