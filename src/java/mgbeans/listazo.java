/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mgbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import pojos.Product;

/**
 *
 * @author DegeVado
 */
@ManagedBean
@SessionScoped
public class listazo {

    /**
     * Creates a new instance of listazo
     */
    private List <Product> product;
    
    public listazo() {
        product=new ArrayList<Product>();
        Session session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
        product=session.createQuery("From Product").list();
        session.close();
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
    
}
