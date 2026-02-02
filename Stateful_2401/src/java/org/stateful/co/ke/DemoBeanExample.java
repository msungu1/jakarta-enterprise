package org.stateful.co.ke;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 *
 * @author m.dossa
 */
@Stateful
@LocalBean
public class DemoBeanExample implements DemoExampleBeanRemote {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
}
