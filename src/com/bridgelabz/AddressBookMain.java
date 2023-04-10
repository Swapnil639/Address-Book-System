package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public void addPersonDetail() {
            Scanner scanner = new Scanner(System.in);
            Contact person1 = new Contact();

            System.out.println("First Name :");
            String firstName = scanner.nextLine();
            person1.setFirstName(firstName);

            System.out.println("Last Name :");
            String lastName = scanner.nextLine();
            person1.setLastName(lastName);

            System.out.println("Address :");
            String address = scanner.nextLine();
            person1.setAddress(address);

            System.out.println("City :");
            String city = scanner.nextLine();
            person1.setCity(city);

            System.out.println("State :");
            String state = scanner.nextLine();
            person1.setState(state);

            System.out.println("Email Id :");
            String email = scanner.nextLine();
            person1.setEmailId(email);

            System.out.println("Zip :");
            int zip = scanner.nextInt();
            person1.setZip(zip);

            System.out.println("Phone Number :");
            long phoneNumber = scanner.nextLong();
            person1.setPhoneNumber(phoneNumber);


            System.out.println(person1);
        }

    public static void main(String[] args) {
        AddressBookMain obj=new AddressBookMain();
        obj.addPersonDetail();
    }
}
