package qualified_io_algorithms;

import java.util.*;
import java.util.stream.Collectors;

/**
 * SushiNori: Shift Scheduling
 * Background
 * SushiNori has a team of chefs to work its two chef stations. The chefs make requests to management for days they prefer to have off each week. You've been asked to determine whether it's possible to arrange the weekly schedule in such a way that all chefs will get to take their preferred days off while keeping the restaurant staffed.
 *
 * SushiNori is open seven days a week. Each workday consists of two shifts of 8 hours each. There are restrictions on how many hours employees may work:
 *
 * No employee may log more than 40 hours in a week.
 * No employee may exceed 5 days of work in a week.
 * No employee may work more than 8 hours in a day.
 * Your task
 * Complete the function
 *
 * boolean schedulable(HashMap<String, ArrayList<String>> requests);
 * where requests is a HashMap mapping each chef name to a list of days that chef has requested off for this week:
 *
 * The string days of the week are guaranteed to be chronologically sorted.
 *
 * Return true if it's possible to schedule all chefs such that all shifts are covered and all chefs' requests for days off are satisfied and false otherwise.
 *
 * Examples
 * Example 1
 * HashMap<String, ArrayList<String>> requests = new HashMap<>();
 * requests.put(
 *     "ada", new ArrayList<>(Arrays.asList(
 *         new String[] {"mon", "tue", "wed", "fri", "sat", "sun"}
 *     ))
 * );
 * requests.put(
 *     "emma", new ArrayList<>(Arrays.asList(
 *         new String[] {"tue", "wed", "thu", "sun"}
 *     ))
 * );
 * requests.put(
 *     "remy", new ArrayList<>(Arrays.asList(
 *         new String[] {"mon", "sat"}
 *     ))
 * );
 * requests.put(
 *     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
 * );
 * ChefScheduler.schedulable(requests);
 * This call to schedulable should return true. Monday has been requested off by two chefs, for example, but Emma and Zach can cover. No chef will be overworked. Here is a possible schedule (all shifts are 8 hours):
 *
 * Monday    : Emma, Zach
 * Tuesday   : Zach, Remy
 * Wednesday : Zach, Remy
 * Thursday  : Remy, Ada
 * Friday    : Remy, Emma
 * Saturday  : Emma, Zach
 * Sunday    : Zach, Remy
 * Example 2
 * HashMap<String, ArrayList<String>> requests = new HashMap<>();
 * requests.put(
 *     "emma", new ArrayList<>(Arrays.asList(
 *         new String[] {"sun"}
 *     ))
 * );
 * requests.put(
 *     "remy", new ArrayList<>(Arrays.asList(
 *         new String[] {"sun"}
 *     ))
 * );
 * requests.put(
 *     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
 * );
 * ChefScheduler.schedulable(requests);
 * This call to schedulable should return false because Zach will be unable to cover Sunday alone.
 *
 * Example 3
 * HashMap<String, ArrayList<String>> requests = new HashMap<>();
 * requests.put(
 *     "ada", new ArrayList<>(Arrays.asList(
 *         new String[] {"mon", "tue", "wed", "thu", "fri", "sat"}
 *     ))
 * );
 * requests.put(
 *     "emma", new ArrayList<>(Arrays.asList(
 *         new String[] {"tue", "wed", "thu", "sun"}
 *     ))
 * );
 * requests.put(
 *     "remy", new ArrayList<>(Arrays.asList(
 *         new String[] {"mon", "fri", "sun"}
 *     ))
 * );
 * requests.put(
 *     "zach", new ArrayList<>(Arrays.asList(new String[] {}))
 * );
 * ChefScheduler.schedulable(requests);
 * This call to schedulable should return false because Zach would have to work in excess of 5 days in order to cover all needed shifts.
 */

public class SushiNoriChefScheduler {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> requests = new HashMap<>();
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

        System.out.println(schedulable(requests));
    }

    public static boolean schedulable(
            HashMap<String, ArrayList<String>> requests
    ) {
        HashMap<String, Integer> noOfDaysAssigned = new HashMap<>();
        requests.keySet().forEach(person -> {
            noOfDaysAssigned.put(person, 0);
        });

        Map<String, List<String>> sortedRequests = requests.entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(e -> e.getValue().size())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (a,b) -> {throw new AssertionError();}, LinkedHashMap::new));

        TreeMap<String, ArrayList<String>> daysAssigned = new TreeMap<>();
        daysAssigned.put("mon", new ArrayList<>());
        daysAssigned.put("tue", new ArrayList<>());
        daysAssigned.put("wed", new ArrayList<>());
        daysAssigned.put("thu", new ArrayList<>());
        daysAssigned.put("fri", new ArrayList<>());
        daysAssigned.put("sat", new ArrayList<>());
        daysAssigned.put("sun", new ArrayList<>());

        daysAssigned.keySet().forEach(day -> {
            sortedRequests.keySet().forEach(person -> {
                if(daysAssigned.get(day).size() < 2 && !sortedRequests.get(person).contains(day) && noOfDaysAssigned.get(person) < 5){
                    daysAssigned.get(day).add(person);
                    noOfDaysAssigned.replace(person, noOfDaysAssigned.get(person) +1);
                }
            });
        });

        for (ArrayList<String> value : daysAssigned.values()) {
            if(value.size() < 2) return false;
        }

        return true;
    }
}
