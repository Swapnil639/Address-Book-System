package com.bridgelabz;

import java.util.*;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        multiplyAddressBook();
        searchPersonInMultiplyAddressBook();
        System.out.println(addressBookMap);
        countCityOfPerson();
    }

    private static void multiplyAddressBook() {
        System.out.println("how many Address Book are creating");
        int numberOfAddressBook = scanner.nextInt();
        for (int i = 1; i <= numberOfAddressBook; i++) {
            System.out.println("Enter " + i + " the Address Book Name");
            String addressBookName = scanner.next();
            AddressBook addressBook = new AddressBook();
            addressBook.setAddressBookName(addressBookName);
            addressBook.multiplyContact();
            addressBook.editDeleteContact();
            addressBookMap.put(addressBookName, addressBook);
        }
    }

    private static void searchPersonInMultiplyAddressBook() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = addressBookMap.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            addressBook.searchContact();
        }
    }
    private static void countCityOfPerson() {
        System.out.println("Enter the name of Addresses book");
        String input = scanner.next();
        AddressBook addressBook = new AddressBook();
        AddressBook address = addressBookMap.get(input);
        if (address == null){
            System.out.println("No book is found in address book");
        }else {
            addressBook.countCityOrPerson();
        }
    }
}