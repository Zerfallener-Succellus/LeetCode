import java.util.*;

public class MinButPress {


        public int minimumPushes(String word) {

            Map<Character, Integer> map = new LinkedHashMap<>();

            for(char c : word.toCharArray()) {
                if (Character.isLetter(c)){
                    if (map.containsKey(c)){
                        map.put(c, map.get(c)+1);
                    }else {
                        map.put(c, 1);
                    }
                }
            }

            List<Map.Entry<Character, Integer>> freqlist = new ArrayList<>(map.entrySet());
            freqlist.sort((a,b)->b.getValue().compareTo(a.getValue()));

            int minPushes = 0;
            int buttonCount = 0;
            int pressCount = 1;

            for(Map.Entry<Character, Integer> entry : freqlist) {
                minPushes += entry.getValue() * pressCount;
                buttonCount++;

                if (buttonCount % 8 == 0){
                    pressCount++;
                }
            }



            return minPushes;

    }

    public static void main(String[] args) {
        new MinButPress().minimumPushes("aabbccddeeffgghhiiiiii");
    }
}
