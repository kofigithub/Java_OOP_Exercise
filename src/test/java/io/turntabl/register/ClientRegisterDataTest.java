package io.turntabl.register;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static io.turntabl.register.ClientRegisterData.getClientData;
import static io.turntabl.register.ClientRegisterData.getGoldClientData;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ClientRegisterDataTest {

    @Test
    public void testClientData() {
        List<String> names =  Arrays.asList(new String[]{"Godwin Hammer", "Sarah Koomson", "Kwame Asante", "Frank Zack", "Kofi Owusu-Tufuor"});
        assertArrayEquals(names.toArray(), getClientData().toArray());

    }



    @Test
    public void testGoldClientData() {
        List<String> names =  Arrays.asList(new String[]{"Godwin Hammer", "Kofi Owusu-Tufuor"});
        assertArrayEquals(names.toArray(), getGoldClientData().toArray());

    }

    @Test
    public void testClientNameByID() {
        List<ClientRegister> creglist = Arrays.asList(
                new ClientRegister(1, "Godwin Hammer", "Corporate", 100,
                        Service_Level.Gold, "02984845959"),
                new ClientRegister(3000, "Kofi Owusu-Tufuor", "Private",
                        Service_Level.Gold, "0555496599")

        );
        //Fetching ClientRegister data as a Set
        Set<ClientRegister> crset = creglist.stream()
                .filter(c -> c.getID() == 3000)
                .collect(Collectors.toSet());

        //Iterating Set
        for (ClientRegister cr : crset) {

            assertEquals(cr.getID(), 3000);
            assertEquals(cr.getName(), "Kofi Owusu-Tufuor");

        }
    }


    @Test
    public void testServiceLevelCount() {

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

            assertEquals(count.longValue(),2);

            count = creg.stream().filter(c -> c.getService_level() == Service_Level.Platinum)
                    .map(ClientRegister::getName)
                    .distinct()
                    .collect(Collectors.counting());

            assertEquals(count.longValue(),2);

            count = creg.stream().filter(c -> c.getService_level() == Service_Level.Premium)
                    .map(ClientRegister::getName)
                    .distinct()
                    .collect(Collectors.counting());

            assertEquals(count.longValue(),1);



        }

        //return ;
    }
}
