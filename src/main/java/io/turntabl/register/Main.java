package io.turntabl.register;



public class Main {



    public static void main(String[] args){
        System.out.println("Client Data:"+ ClientRegisterData.getClientData());
        System.out.println("Gold Client Data:"+ ClientRegisterData.getGoldClientData());
        ClientRegisterData.getClientNameByID();
        ClientRegisterData.getServiceLevelCountData();

    }
}
