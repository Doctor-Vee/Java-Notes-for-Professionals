package assistance_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyUnmodifiableListClass {
    private List<Integer> intList = new ArrayList<>();

    public void addValueToIntList(Integer value){
        intList.add(value);
    }

    public List<Integer> getIntList(){
        return Collections.unmodifiableList(intList);
    }
}
