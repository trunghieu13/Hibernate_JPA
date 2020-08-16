package MAPPED_obj;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @Column(name = "IdBill")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdBill;

    @Column(name = "Date")
    private String Date;

    @Column(name = "SanPham")
    private String SP;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bill")
    private Set<Customer> listCustomer;

    public Bill() {
    }

    public Bill(int idBill, String date, String sp) {
        IdBill = idBill;
        Date = date;
        SP = sp;
    }

    public Set<Customer> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(Set<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public int getIdBill() {
        return IdBill;
    }

    public void setIdBill(int idBill) {
        IdBill = idBill;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSP() {
        return SP;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "IdBill=" + IdBill +
                ", Date='" + Date + '\'' +
                ", SP='" + SP + '\'' +
                '}';
    }
}
