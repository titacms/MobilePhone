import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts = new ArrayList<>();

    public void printContacts(){
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println(this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        if (findContact(contact)) {
            myContacts.add(contact);
            System.out.println("Contact added with name " + contact.getName() + " and phone number: " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact already in list");
        }
    }

    public void modifyContact(String oldContactName, String newName, String newPhoneNumber) {
        Contact contact = new Contact(oldContactName, null);
        if (findContact(contact)) {
            System.out.println("Could not find contact");
        } else {
            for (int i = 0; i < this.myContacts.size(); i++) {
                if (this.myContacts.get(i).getName().equals(oldContactName)) {
                    this.myContacts.get(i).setName(newName);
                    this.myContacts.get(i).setPhoneNumber(newPhoneNumber);
                }
            }
        }
    }

    public void removeContact(String contactName){
        Contact contact = new Contact(contactName,null);
        if(!findContact(contact)) {
            for (int i = 0; i < this.myContacts.size(); i++) {
                if (this.myContacts.get(i).getName().equals(contactName)) {
                        myContacts.remove(this.myContacts.get(i));
                        System.out.println("Contact removed");
                    }
                }
            } else {
            System.out.println("Could not find contact");
        }
    }

    public void queryContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(contactName)){
                System.out.println(this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
            }
        }
    }

    private boolean findContact(Contact contact){
        for(int i = 0; i < this.myContacts.size(); i++){
            if(this.myContacts.get(i).getName().equals(contact.getName())){
                return false;
            }
        } return true;
    }
}
