package org.stateful.co.ke;

import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */
@Remote
public interface DemoExampleBeanRemote {
    int add(int a, int b);
}
