package pojos;
// Generated 2017.03.16. 10:42:16 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String artist;
     private Integer year;
     private String country;
     private String company;
     private Double price;
     private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);

    public Product() {
    }

    public Product(String title, String artist, Integer year, String country, String company, Double price, Set<Orderitem> orderitems) {
       this.title = title;
       this.artist = artist;
       this.year = year;
       this.country = country;
       this.company = company;
       this.price = price;
       this.orderitems = orderitems;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Integer getYear() {
        return this.year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public Set<Orderitem> getOrderitems() {
        return this.orderitems;
    }
    
    public void setOrderitems(Set<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }




}

