/**
* This program uses a TreeMap to model an alphabetized contact list that the user can interact with to add and delete contacts
*
* @author Krish Thawani
 */
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class Unit12Lab3 {
    public static void main(String[] args) {

        TreeMap<Integer, Contact> contactList = new TreeMap<Integer, Contact>();
        Scanner input = new Scanner(System.in);

        System.out.print("\n" + "Enter the file name: ");
        String fileName = input.nextLine();
        File filer = new File(fileName);

        int count = 1;

            try (Scanner file = new Scanner(Paths.get(fileName))) {
                while (file.hasNext()) {
                contactList.put(count, new Contact(file.nextLine()));
                count++;
                }
            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.println("\n" + "Current Contact List: " + "\n");
            for (Map.Entry<Integer, Contact> contact : contactList.entrySet())
                System.out.print(contact.getValue().getContact());

            System.out.println();

            char answer;
            int deleteNumber;
            String[] contactInfo = new String[4]; // will contain contact info and be passed into Contact constructor
            String[] contactDescription = {"First Name: ", "Last Name: ", "Phone Number: ", "Email Address: "};
            
            do {
                System.out.print("What operation would you like to do? ('a' to add contact ; 'd' to delete contact ; 's' to show contact list ---> ");
                answer = input.nextLine().toLowerCase().charAt(0); // get user input for what to do
                System.out.println();
                if (answer == 'a') { // if user wants to add contact

                    for (int i = 0; i < 4; i++) { // loop to ask user the 4 pieces contact info
                        System.out.print("Enter Contact Number " + count + "\'s " + contactDescription[i]);
                        contactInfo[i] = input.nextLine();
                    }

                    contactList.put(count, new Contact(contactInfo)); // add contact number and contact to map
                    count++;
                    System.out.println("Contact Added." + "\n");

                } else if (answer == 'd') {

                    System.out.print("Enter the number of the contact you want to delete --> ");
                    deleteNumber = input.nextInt();

                    // Shift all contact numbers down by one
                    for (int y = deleteNumber; y <= contactList.size(); y++)
                        contactList.put(y, contactList.get(y+1));
                    contactList.pollLastEntry();
                    input.nextLine();
                    System.out.println("Contact " + deleteNumber + " Deleted.");
                    count--;
                }
                
            } while (answer == 'a' || answer == 'd');

            String[] lastNames = new String[contactList.size()];
            int i = 0;

            for (Map.Entry<Integer, Contact> contact : contactList.entrySet()) {
                lastNames[i] = contact.getValue().getLastName();
                i++;
            }

            // Sort Array
            Arrays.sort(lastNames);
            
            // Sort into TreeMap
            TreeMap<Integer, Contact> sortedContacts = new TreeMap<Integer, Contact>();
            for (int n = 0; n < lastNames.length; n++) {
                for (int x = 1; x <= contactList.size(); x++) {
                    if ((contactList.get(x).getLastName()).equals(lastNames[n])) {
                        sortedContacts.put(n + 1, contactList.get(x));
                    }
                }
            }

        // Print to User
        System.out.println("Contact List: ");
        for (Map.Entry<Integer, Contact> contact : sortedContacts.entrySet())
                System.out.print(contact.getValue().getContact());
        System.out.println();
        // Save to File
        try (Formatter output = new Formatter(fileName)) {
            for (Map.Entry<Integer, Contact> contact : sortedContacts.entrySet())
                    output.format("%s", contact.getValue().getContact());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}