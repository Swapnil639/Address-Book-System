package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
        Scanner scanner = new Scanner(System.in);
        Contact person1 = new Contact();
    public void addPersonDetail() {
            System.out.println("Enter your first name :");
            String firstName = scanner.nextLine();
            person1.setFirstName(firstName);

            System.out.println("Enter your last name :");
            String lastName = scanner.nextLine();
            person1.setLastName(lastName);

            System.out.println("Enter your address :");
            String address = scanner.nextLine();
            person1.setAddress(address);

            System.out.println("Enter your city :");
            String city = scanner.nextLine();
            person1.setCity(city);

            System.out.println("Enter your state :");
            String state = scanner.nextLine();
            person1.setState(state);

            System.out.println("Enter your email Id :");
            String email = scanner.nextLine();
            person1.setEmailId(email);

            System.out.println("Enter your zip :");
            int zip = scanner.nextInt();
            person1.setZip(zip);

            System.out.println("Enter your phone number :");
            long phoneNumber = scanner.nextLong();
            person1.setPhoneNumber(phoneNumber);

            System.out.println(person1);
            System.out.println();
        }
        public void editPersonDetail() {
                System.out.println("Edit the Contact");
                String s;
                do {
                        System.out.println("Choose an option \n1.First name \n2.Last name \n3.Address \n4.City \n5.state \n6.Email Id \n7.Zip \n8.Phone Number");
                        int option = scanner.nextInt();
                        switch (option) {
                                case 1:
                                        System.out.println("First name :");
                                        person1.setFirstName(scanner.next());
                                        break;
                                case 2:
                                        System.out.println("Last name :");
                                        person1.setLastName(scanner.next());
                                        break;
                                case 3:
                                        System.out.println("Address :");
                                        person1.setAddress(scanner.next());
                                        break;
                                case 4:
                                        System.out.println("City :");
                                        person1.setCity(scanner.next());
                                        break;

                                case 5:
                                        System.out.println("State :");
                                        person1.setState(scanner.next());
                                        break;
                                case 6:
                                        System.out.println("Email ID :");
                                        person1.setEmailId(scanner.next());
                                        break;
                                case 7:
                                        System.out.println("Zip :");
                                        person1.setZip(scanner.nextInt());
                                        break;
                                case 8:
                                        System.out.println("Phone Number :");
                                        person1.setPhoneNumber(scanner.nextLong());
                                        break;
                                default:
                                        System.out.println("Invalid option");

                        }
                        System.out.println("Successful edit the contact and Save it");
                        System.out.println(person1);
                        System.out.println();
                        System.out.println("If you want to continue press y or Y");
                        s=scanner.next();
                        System.out.println();
                }while (s.equals("y") || s.equals("Y"));
        }
        public void deletePersonDetail() {
                System.out.println("delete the Contact");
                String s;
                do {
                        System.out.println("Choose an option \n1.First name \n2.Last name \n3.Address \n4.City \n5.state \n6.Email Id \n7.Zip \n8.Phone Number");
                        int option = scanner.nextInt();
                        switch (option) {
                                case 1:
                                        System.out.println("First name :");
                                        person1.setFirstName(null);
                                        break;
                                case 2:
                                        System.out.println("Last name :");
                                        person1.setLastName(null);
                                        break;
                                case 3:
                                        System.out.println("Address :");
                                        person1.setAddress(null);
                                        break;
                                case 4:
                                        System.out.println("City :");
                                        person1.setCity(null);
                                        break;

                                case 5:
                                        System.out.println("State :");
                                        person1.setState(null);
                                        break;
                                case 6:
                                        System.out.println("Email ID :");
                                        person1.setEmailId(null);
                                        break;
                                case 7:
                                        System.out.println("Zip :");
                                        person1.setZip(0);
                                        break;
                                case 8:
                                        System.out.println("Phone Number :");
                                        person1.setPhoneNumber(0);
                                        break;
                                default:
                                        System.out.println("Invalid option");
                        }
                        System.out.println("Successful delete the contact and Save it");
                        System.out.println(person1);
                        System.out.println();
                        System.out.println("If you want to continue press y or Y");
                        s=scanner.next();
                        System.out.println();
                }while (s.equals("y") || s.equals("Y"));
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain obj = new AddressBookMain();
        obj.addPersonDetail();
        obj.editPersonDetail();
        obj.deletePersonDetail();
    }
}
