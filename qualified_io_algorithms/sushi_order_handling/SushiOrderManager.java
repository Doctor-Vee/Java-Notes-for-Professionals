package qualified_io_algorithms.sushi_order_handling;


import java.util.ArrayList;
import java.util.HashMap;

class SushiOrderManager {

    private final HashMap<Integer, ArrayList<String>> orders;
    int currentSeatId;

    public SushiOrderManager() {
        /* initialize class state  */
        orders = new HashMap<>();
        currentSeatId = 1;
    }

    public void addOrder(ArrayList<SushiOrder> request) {
        /* add request to current batch of orders */
        for (SushiOrder sushiOrder : request) {
            if (orders.containsKey(sushiOrder.getSeatId())) {
                orders.get(sushiOrder.getSeatId()).addAll(sushiOrder.getMenuItemIds());
            } else {
                orders.put(sushiOrder.getSeatId(), sushiOrder.getMenuItemIds());
            }
        }
    }

    public SushiItem nextItem() {
        // return next roll object in the format
        // new SushiItem(/*seatId*/ 1, /*menuItemId*/ "tuna");
        // or null if no order is pending
        while (!orders.isEmpty()) {
            if(orders.containsKey(currentSeatId)){
                int seatId = currentSeatId;
                String menuItemId = orders.get(seatId).get(0);
                orders.get(seatId).remove(0);
                if(orders.get(seatId).size() == 0) orders.remove(seatId);
                currentSeatId++;
                if (currentSeatId > 16) currentSeatId = 1;
                return new SushiItem(seatId, menuItemId);
            } else {
                currentSeatId++;
                if (currentSeatId > 16) currentSeatId = 1;
            }
        }
            return null;
    }
}
