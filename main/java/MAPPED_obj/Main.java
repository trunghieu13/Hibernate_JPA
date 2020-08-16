package MAPPED_obj;
import DAO.*;

import java.util.List;

public class Main {
    public static void main(String args[])
    {
        //insert customer
        Dao DO = new Dao();
        DO.save(new Customer("Kai", "Viet Nam"));
        DO.save(new Customer("Hieu", "Viet Nam"));
        DO.save(new Customer("Lisa", "Korean"));
        DO.save(new Customer("TeaYang", "Korean"));
        DO.save(new Customer(1,"hieu","truongdinh",Possion.UltraVIP));

        System.out.println("all customer after insert:");
        List<Customer> listCustomer = DO.findAll();
        for(Customer i:listCustomer)
        {
            System.out.println(i);
        }
        DO.close();
        //insert bill
        DO.savebill(new Bill(1, "20", "SRM"));
        DO.savebill(new Bill(2, "20", "SRM"));
        DO.savebill(new Bill(3, "20", "SRM"));
        DO.savebill(new Bill(4, "20", "SRM"));

        List<Bill> listbill = DO.findAllbill();
        for(Bill i:listbill)
        {
            System.out.println(i);
        }



    }
}
