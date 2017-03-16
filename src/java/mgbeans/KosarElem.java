/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mgbeans;

import pojos.Product;

/**
 *
 * @author DegeVado
 */
public class KosarElem {
    private int mennyiseg;
    private Product product;

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public KosarElem(int mennyiseg, Product product) {
        this.mennyiseg = mennyiseg;
        this.product = product;
    }
}
