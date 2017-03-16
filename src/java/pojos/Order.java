package pojos;
// Generated 2017.03.16. 10:42:16 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order generated by hbm2java
 */
public class Order  implements java.io.Serializable {


     private Integer id;
     private Client client;
     private boolean teljesitve;
     private Date datum;
     private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);

    public Order() {
    }

	
    public Order(Client client, boolean teljesitve) {
        this.client = client;
        this.teljesitve = teljesitve;
    }
    public Order(Client client, boolean teljesitve, Date datum, Set<Orderitem> orderitems) {
       this.client = client;
       this.teljesitve = teljesitve;
       this.datum = datum;
       this.orderitems = orderitems;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public boolean isTeljesitve() {
        return this.teljesitve;
    }
    
    public void setTeljesitve(boolean teljesitve) {
        this.teljesitve = teljesitve;
    }
    public Date getDatum() {
        return this.datum;
    }
    
    public void setDatum(Date datum) {
        this.datum = datum;
    }
    public Set<Orderitem> getOrderitems() {
        return this.orderitems;
    }
    
    public void setOrderitems(Set<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }




}


