package org.stateless.ejb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m.dossa
 */
public class Main {

    public static void main(String[] args) {
        StatelessBean statelessBean = new StatelessBean();
        List productList = new ArrayList();
        statelessBean.addProduct("TUNG TUNG SAHOOR");
        productList = statelessBean.getProducts();
        System.out.println("Products on sale: " + productList);

    }

}
