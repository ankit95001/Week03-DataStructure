package day02stackqueuehashmapandhashingfunction.sphashmapsandfunctions.findallsubarrayswithzerosum;

import java.util.*;

class ZeroSumSubarrays {
    public static List<int[]> findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // Handle case when subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6, -3, -2, 3};
        List<int[]> subarrays = findSubarrays(arr);

        for (int[] subarray : subarrays) {
            System.out.println("Subarray: " + subarray[0] + " to " + subarray[1]);
        }
    }
}

