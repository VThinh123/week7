/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb6.Bai1;

import java.util.ArrayList;
import java.util.List;
import static week4.Utils.isValidPhoneNumber;

/**
 *
 * @author LENOVO LEGION
 */
public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private int currentID;
    public ContactManager() {
        this.currentID = 1;
    }


    public boolean addContact(String fullName, String group, String address, String phone){
        String[] namePart = fullName.split(" ", 2);
     //
     
     if(namePart.length < 2){
         System.out.println("invalid name. enter again");
         return false;
     }
        String name = fullName;
        String firstName = namePart[0];
        String lastName = namePart[1];
        
        if (!isValidPhoneNumber(phone)) {
            System.out.println("Invalid phone number format.");
            return false;
        }
        Contact contact = new Contact(currentID++, name, firstName, lastName, group, address, phone);
        contacts.add(contact);
        return true;
    }
    
    public void displayAll(){
        for(Contact c : contacts){
            System.out.println(c.toString());
        }
    }
    
    public boolean deleteContact(int id){
        for(Contact c : contacts){
            if(c.getId() == id){
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }
}
