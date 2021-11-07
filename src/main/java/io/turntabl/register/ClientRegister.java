package io.turntabl.register;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ClientRegister {
    private int ID;




    private String Name;
    private String Client_Type;
    private int Account_Manager_ID;
    private Service_Level service_level;
    private String Contact;

    public ClientRegister(int ID, String name, String client_Type, int account_Manager_ID,
                          Service_Level service_level, String contact) {
        this.ID = ID;
        this.Name = name;
        this.Client_Type = client_Type;
        this.Account_Manager_ID = account_Manager_ID;
        this.service_level = service_level;
        this.Contact = contact;
    }

    public ClientRegister(int ID, String name, String client_Type,
                          Service_Level service_level, String contact) {
        this.ID = ID;
        this.Name = name;
        this.Client_Type = client_Type;
        this.service_level = service_level;
        this.Contact = contact;
    }

    public ClientRegister() {

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClient_Type() {
        return Client_Type;
    }

    public void setClient_Type(String client_Type) {
        Client_Type = client_Type;
    }

    public int getAccount_Manager_ID() {
        return Account_Manager_ID;
    }

    public void setAccount_Manager_ID(int account_Manager_ID) {
        Account_Manager_ID = account_Manager_ID;
    }

    public Service_Level getService_level() {
        return service_level;
    }

    public void setService_level(Service_Level service_level) {
        this.service_level = service_level;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }


}
