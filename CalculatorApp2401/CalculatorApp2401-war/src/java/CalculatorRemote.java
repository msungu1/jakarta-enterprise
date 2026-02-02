import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */
@Remote
public interface CalculatorRemote {
    int addNumbers(int a, int b);
}
