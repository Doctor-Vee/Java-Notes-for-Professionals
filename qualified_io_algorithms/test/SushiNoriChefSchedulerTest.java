package qualified_io_algorithms.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;
import qualified_io_algorithms.SushiNoriChefScheduler;

import static org.junit.Assert.assertEquals;


public class SushiNoriChefSchedulerTest {

    SushiNoriChefScheduler scheduler = new SushiNoriChefScheduler();

    @Test
    public void itShouldWorkOnBasicExamples() {
        HashMap<String, ArrayList<String>> requests = new HashMap<>();
        requests.put(
                "ada", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "tue", "wed", "fri", "sat", "sun"}
                ))
        );
        requests.put(
                "emma", new ArrayList<>(Arrays.asList(
                        new String[] {"tue", "wed", "thu", "sun"}
                ))
        );
        requests.put(
                "remy", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "sat"}
                ))
        );
        requests.put(
                "zach", new ArrayList<>(Arrays.asList(new String[] {}))
        );
        assertEquals(
                "it should work on a basic example.",
                true, scheduler.schedulable(requests)
        );

        requests.clear();
        requests.put(
                "emma", new ArrayList<>(Arrays.asList(
                        new String[] {"sun"}
                ))
        );
        requests.put(
                "remy", new ArrayList<>(Arrays.asList(
                        new String[] {"sun"}
                ))
        );
        requests.put(
                "zach", new ArrayList<>(Arrays.asList(new String[] {}))
        );
        assertEquals(
                "it should handle an example where there isn't enough coverage on a day.",
                false, scheduler.schedulable(requests)
        );

        requests.clear();
        requests.put(
                "ada", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "tue", "wed", "thu", "fri", "sat"}
                ))
        );
        requests.put(
                "emma", new ArrayList<>(Arrays.asList(
                        new String[] {"tue", "wed", "thu", "sun"}
                ))
        );
        requests.put(
                "remy", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "fri", "sun"}
                ))
        );
        requests.put(
                "zach", new ArrayList<>(Arrays.asList(new String[] {}))
        );
        assertEquals(
                "it should handle an example where an employee would need to work in excess of 5 days.",
                false, scheduler.schedulable(requests)
        );
    }
}
