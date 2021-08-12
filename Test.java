import java.util.*;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Timestamp");
//        Timestamp now = new Timestamp(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis());
//        System.out.println(now);

        int[] array = new int[]{2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(array));


    }

//    public static int firstDuplicate(int[] a) {
//        Map<Integer, Integer> occurrence = new HashMap<>();
//        for(int i = 0; i < a.length; i++){
//            for(int j = i+1; j < a.length; j++){
//                if(a[i] == a[j]){
//                    occurrence.put(j, a[i]);
//                    break;
//                }
//            }
//        }
//        if(occurrence.isEmpty())return -1;
//        return occurrence.get(Collections.min(occurrence.keySet()));
//    }
//
//    public static int firstDuplicate(int[] a) {
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            if(integerList.contains(a[i])) return a[i];
//            integerList.add(a[i]);
//        }
//        return -1;
//    }

    // bl0t's solution
//    public static int firstDuplicate(int[] a) {
//
//        boolean arr[] = new boolean[a.length + 1];
//
//        for (int i = 0; i < a.length; i++) {
//            if (arr[a[i]]) {
//                return a[i];
//            } else {
//                arr[a[i]] = true;
//            }
//        }
//
//        return -1;
//    }

    // tix's solution
    public static int firstDuplicate(int[] a) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<a.length;i++){
            if (! hashSet.contains(a[i])) {
                hashSet.add(a[i]);
            } else {
                return a[i];
            }
        }
        return -1;
    }


}
