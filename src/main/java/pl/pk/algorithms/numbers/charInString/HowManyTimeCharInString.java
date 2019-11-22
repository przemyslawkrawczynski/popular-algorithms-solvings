package pl.pk.algorithms.numbers.charInString;

import java.util.HashMap;
import java.util.Map;

public class HowManyTimeCharInString {

    public static void main(String[] args) {

        String text = "abcdaabcd";
        HashMap<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char l = text.charAt(i);
            String l2 = Character.toString(l);

            if (resultMap.containsKey(l2)) {
                int x = resultMap.get(l2);
                x = x + 1;
                resultMap.put(l2, x);
            } else {
                resultMap.put(l2, 1);
            }
        }

        for (Map.Entry<String, Integer> entry: resultMap.entrySet()) {
            System.out.println("Znak [" + entry.getKey() + "] is [" + entry.getValue() + "] times." );
        }
    }
}
