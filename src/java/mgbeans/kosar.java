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
import pojos.Product;

/**
 *
 * @author DegeVado
 */
@ManagedBean
@SessionScoped
public class kosar {

   
    private List<KosarElem>elemek;

    public List<KosarElem> getElemek() {
        return elemek;
    }

    public void setElemek(List<KosarElem> elemek) {
        this.elemek = elemek;
    }
    
    public kosar() {
        elemek=new ArrayList<KosarElem>();
    }
    
    public void beletesz(Product product){
        KosarElem ke=new KosarElem(1, product);
        elemek.add(ke);
        
    }
    public void kivesz(KosarElem ke){
        elemek.remove(ke);
    }
}
