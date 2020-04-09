package com.company.DAO;

import java.util.List;

import com.company.Model.*;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;


public class Controller   {

    public static ObjectSet result;
    public static ObjectSet result1;
    public static ObjectSet result2;
    public static ObjectSet result4;
    public static ObjectSet result5;
    public static ObjectSet result6;

    public static List<Produkt> result11;
    private ObjectContainer db;

    public Controller(  ObjectContainer db) {
          }

            public static void listResult(ObjectSet result)
            {
                while (result.hasNext()) {
                    System.out.println(result.next());
                }
                System.out.println("---------------");
            }


            public static void listResult(ObjectContainer db)
           {
               Query query4= db.query();
               query4.constrain(Produkt.class);
               result4=query4.execute();

               while (result4.hasNext()) {
                    System.out.println(result4.next());
                    }
               System.out.println("---------------");
           }

           public static List<Produkt> listProd(ObjectContainer db)
            {
                Query query4= db.query();
                query4.constrain(Produkt.class);
                result11=query4.execute();
                return result11;
            }

            public static void add(ObjectContainer db)
            {
                Konto konto1 = new Konto(1, "Haslo","Login1","Kowalski","Jan");
                Konto konto2 = new Konto(2,"Haslo","Login2","Nowak","Anna");
                Konto konto3 = new Konto(3,"Haslo","Login3","Pomidor","Weronika");

                Klient klient1 = new Klient(konto1,"Kowalski@wp.pl","Kraków ul.rowa 10",432467877);
                Klient klient2 = new Klient(konto2,"Nowak@wp.pl","Warszawa ul.armii 5", 453543454);
                Klient klient3 = new Klient(konto3,"Pomidor@wp.pl","Zakopane",          566745345);

                Produkt produkt1 = new Produkt(1,"Interdruk","Kalendarz niebieski","ksiazka");
                Produkt produkt2 = new Produkt(2,"Interdruk","Kalendarz zielony","ksiazka");
                Produkt produkt3 = new Produkt(3,"Interdruk","Kalendarz czerwony","ksiazka");
                Produkt produkt4 = new Produkt(4,"Helion","HTML i CSS","ksiazka");
                Produkt produkt5 = new Produkt(5,"Helion","Czysty Kod","ksiazka");
                Produkt produkt6 = new Produkt(6,"Helion","Symfonia","ksiazka");

                Konto konto4 = new Konto(4, "Haslo","Login4","Luwami","Robert");
                Konto konto5 = new Konto(5,"Haslo","Login5","Prorok","Patryk");

                Pracownik pracownik1 = new Pracownik(konto4, 1,"Sprzedawca",4360,"12-03-2019");
                Pracownik pracownik2 = new Pracownik(konto5, 1,"Pakujący",4354,"23-07-2019");

                db.store(konto1);
                db.store(konto2);
                db.store(konto3);
                db.store(klient1);
                db.store(klient2);
                db.store(klient3);
                db.store(produkt1);
                db.store(produkt2);
                db.store(produkt3);
                db.store(produkt4);
                db.store(produkt5);
                db.store(produkt6);
                db.store(konto4);
                db.store(konto5);
                db.store(pracownik1);
                db.store(pracownik2);
/*
                Query query=db.query();
                query.constrain(Klient.class);
                result=query.execute();
                listResult(result); // pobierz wszystko

                Query query5=db.query();
                query5.constrain(Pracownik.class);
                result5=query5.execute();
                listResult(result5); // pobierz wszystko

                Query query1=db.query();
                query1.constrain(Klient.class);
                query1.descend("nazwisko").constrain("Kowalski");
                result1=query1.execute();
                listResult(result1);
*/
                Query query2=db.query();
                query2.constrain(Klient.class);
                query2.descend("telefon").constrain(432467877);
                result2=query2.execute();
                listResult(result2);
/*
                Query query6=db.query();
                query6.constrain(Pracownik.class);
                result6=query6.execute();
                listResult(result6);
                */

            }

            public static void cl(ObjectContainer db){
                db.close();
            }

}
