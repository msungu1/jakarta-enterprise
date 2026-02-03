package demo.jndi;

import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */
@Remote
public interface UppercaseRemote {
    StringBuffer sayHello();
}
