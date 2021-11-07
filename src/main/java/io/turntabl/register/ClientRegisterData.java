package io.turntabl.register;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClientRegisterData {

    public static List<String> getClientData() {

        List<String> names;
        {



            List<ClientRegister> creg = Arrays.asList(
                    new ClientRegister(1, "Godwin Hammer", "Corporate", 100,
                            Service_Level.Gold, "02984845959"),
                    new ClientRegister(2, "Sarah Koomson", "Corporate", 200,
                            Service_Level.Platinum, "03986004459"),
                    new ClientRegister(1000, "Kwame Asante", "Private",
                            Service_Level.Platinum, "0018549942399"),
                    new ClientRegister(2000, "Frank Zack", "Private",
                            Service_Level.Premium, "03305496599"),
                    new ClientRegister(3000, "Kofi Owusu-Tufuor", "Private",
                            Service_Level.Gold, "0555496599")

            );

            names = creg.stream()
                    .map(ClientRegister::getName)
                    .distinct()
                    .collect(Collectors.toList());


        }

        return names;
    }

    public static List<String> getGoldClientData() {

        List<String> names;
        {



            List<ClientRegister> creg = Arrays.asList(
                    new ClientRegister(1, "Godwin Hammer", "Corporate", 100,
                            Service_Level.Gold, "02984845959"),
                    new ClientRegister(2, "Sarah Koomson", "Corporate", 200,
                            Service_Level.Platinum, "03986004459"),
                    new ClientRegister(1000, "Kwame Asante", "Private",
                            Service_Level.Platinum, "0018549942399"),
                    new ClientRegister(2000, "Frank Zack", "Private",
                            Service_Level.Premium, "03305496599"),
            new ClientRegister(3000, "Kofi Owusu-Tufuor", "Private",
                    Service_Level.Gold, "0555496599")

            );

            names = creg.stream().filter(e -> e.getService_level()==Service_Level.Gold)
                    .map(ClientRegister::getName)
                    .distinct()
                    .collect(Collectors.toList());


        }

        return names;
    }


    public static void getClientNameByID() {

        int id = 1;
        {



            List<ClientRegister> creglist = Arrays.asList(
                    new ClientRegister(1, "Godwin Hammer", "Corporate", 100,
                            Service_Level.Gold, "02984845959"),
                    new ClientRegister(2, "Sarah Koomson", "Corporate", 200,
                            Service_Level.Platinum, "03986004459"),
                    new ClientRegister(1000, "Kwame Asante", "Private",
                            Service_Level.Platinum, "0018549942399"),
                    new ClientRegister(2000, "Frank Zack", "Private",
                            Service_Level.Premium, "03305496599"),
                    new ClientRegister(3000, "Kofi Owusu-Tufuor", "Private",
                            Service_Level.Gold, "0555496599")

            );

            //Fetching ClientRegister data as a Set
            Set<ClientRegister> crset = creglist.stream()
                    .filter(c-> c.getID()==3000)
                    .collect(Collectors.toSet());

            //Iterating Set
            for(ClientRegister cr : crset) {
                System.out.println("Name By ID: "+cr.getName()+"  ID: "+cr.getID());
            }

        }



    }

    public static void getServiceLevelCountData() {

        Long count;
        {



            List<ClientRegister> creg = Arrays.asList(
                    new ClientRegister(1, "Godwin Hammer", "Corporate", 100,
                            Service_Level.Gold, "02984845959"),
                    new ClientRegister(2, "Sarah Koomson", "Corporate", 200,
                            Service_Level.Platinum, "03986004459"),
                    new ClientRegister(1000, "Kwame Asante", "Private",
                            Service_Level.Platinum, "0018549942399"),
                    new ClientRegister(2000, "Frank Zack", "Private",
                            Service_Level.Premium, "03305496599"),
                    new ClientRegister(3000, "Kofi Owusu-Tufuor", "Private",
                            Service_Level.Gold, "0555496599")

            );

                    count = creg.stream().filter(c -> c.getService_level() == Service_Level.Gold)
                            .map(ClientRegister::getName)
                            .distinct().count();
                            //.collect(Collectors.counting());

                    System.out.println("Gold Count: " + count);

                    count = creg.stream().filter(c -> c.getService_level() == Service_Level.Platinum)
                    .map(ClientRegister::getName)
                    .distinct()
                    .collect(Collectors.counting());

                    System.out.println("Platinum Count: " + count);

                    count = creg.stream().filter(c -> c.getService_level() == Service_Level.Premium)
                    .map(ClientRegister::getName)
                    .distinct().count();


                     System.out.println("Premium Count: " + count);



        }


    }

}






