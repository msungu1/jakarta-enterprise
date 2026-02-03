package ejb;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

/**
 *
 * @author m.dossa
 */
@Singleton
@Startup // Ensure that it starts with the application
public class TimerBean {

    @Schedule(second = "*", minute = "*", hour = "*/20", persistent = false)
    public void doWorkEvery10Secodns() {
        System.out.println(">> Timer triggered at " + java.time.LocalDateTime.now());
    }

}
