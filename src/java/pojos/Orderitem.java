package pojos;
// Generated 2017.03.16. 10:42:16 by Hibernate Tools 3.6.0



/**
 * Orderitem generated by hbm2java
 */
public class Orderitem  implements java.io.Serializable {


     private Integer id;
     private Order order;
     private Product product;
     private Integer qty;
     private Double price;

    public Orderitem() {
    }

	
    public Orderitem(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
    public Orderitem(Order order, Product product, Integer qty, Double price) {
       this.order = order;
       this.product = product;
       this.qty = qty;
       this.price = price;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }




}


