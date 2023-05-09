package com.bridgelabz;

import org.junit.Test;

import java.util.Arrays;

import static com.bridgelabz.AddressBook.IOService.FILE_IO;

public class AddressBookTest {
    @Test
    public void givenContactDetails() {
        Contact[] array = {
                new Contact("Swapnil", "Patil", "abc", "atm", "Mh", 152649, 996789167, "swapnil@gmail.com"),
                new Contact("Shubham", "ghule", "M", "M", "M", 526341, 962574165, "shubham@gmail.com"),
        };
        AddressBook addressBook;
        addressBook = new AddressBook(Arrays.asList(array));
        addressBook.writeTheData(FILE_IO);
    }

    @Test
    public void readTheContactDetails() {
        AddressBook addressBook = new AddressBook();
        addressBook.readContactDetails(FILE_IO);
    }
}