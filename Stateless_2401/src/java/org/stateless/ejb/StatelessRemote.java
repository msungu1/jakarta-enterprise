package org.stateless.ejb;

import java.util.List;

/**
 *
 * @author m.dossa
 */
public interface StatelessRemote {
    void addProduct(String productName);
    List getProducts();
}
