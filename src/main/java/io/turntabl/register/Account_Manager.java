package io.turntabl.register;

public class Account_Manager {
    private int Account_Manager_ID;
    private String Name;

    public Account_Manager(int account_Manager_ID, String name) {
        this.Account_Manager_ID = account_Manager_ID;
        this.Name = name;
    }

    public int getAccount_Manager_ID() {
        return Account_Manager_ID;
    }

    public void setAccount_Manager_ID(int account_Manager_ID) {
        Account_Manager_ID = account_Manager_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }




}
