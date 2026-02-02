package org.stateless.ejb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m.dossa
 */
public class StatelessBean implements StatelessRemote {

    List<String> products;
    
    @Override
    public void addProduct(String productName) {
        products = new ArrayList<>();
        products.add(productName);
    }

    @Override
    public List<String> getProducts() {
        return products;
    }
    
}
