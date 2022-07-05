package code_signal_algorithms;

import java.util.HashSet;

/**
 * Codewriting
 *
 * 1000
 *
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
 */
public class FirstDuplicate {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 3, 5, 3, 2};
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
