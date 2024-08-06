import java.util.*;

class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> countMap = new LinkedHashMap<>();


        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }


        int distinctCount = 0;


        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return entry.getKey();
                }
            }
        }


        return "";
    }

    public static void main(String[] args) {
        KthDistinctStringInAnArray solution = new KthDistinctStringInAnArray();
        String [] arr = {"a", "aa", "aaa"};
        int k = 1;
        System.out.println(solution.kthDistinct(arr, k));
    }
}
