package jsf.hello.co;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author m.dossa
 */
@Named
@SessionScoped
public class HelloWorld implements Serializable {

    private static final long serialVersionUID = 1L;
    private String str = "Hello from JSF, We've Created out first JSF code!";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    
    
    
}
