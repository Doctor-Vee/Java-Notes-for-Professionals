package code_signal_algorithms;

import java.util.HashSet;

/**
 * I didn't note down the question ... I had solved this algorithm before I came up with the idea of recording my answers here
 * But basically, the task expects you to be able to find the first duplicate in a given arrary
 * Example:
 * Given an array [2, 1, 3, 5, 3, 2], your function should return 3.
 * 3 and 2 are duplicates in this case but the duplicate that comes up first is 3.
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(array));
    }

    // My Solution ...
    // Got the idea about the HashSet from tix's solution. Was using List before and it was failing time test on codesignal
        public static int firstDuplicate(int[] a) {
        HashSet<Integer> integerList = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(integerList.contains(a[i])) return a[i];
            integerList.add(a[i]);
        }
        return -1;
    }

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

//    // tix's solution
//    public static int firstDuplicate(int[] a) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i=0; i<a.length;i++){
//            if (! hashSet.contains(a[i])) {
//                hashSet.add(a[i]);
//            } else {
//                return a[i];
//            }
//        }
//        return -1;
//    }
}
