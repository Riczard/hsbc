package kuklinski;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    Map<String, Integer> lettersValueMap;
    String word;

    public Scrabble(String word) {
        lettersValueMap = new HashMap<>();
        generateValueLetters();
        this.word = word.toUpperCase();
    }

    public int getScore() {
        int score = 0;
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);

            score += lettersValueMap.get(String.valueOf(letter));
        }
        return score;
    }


    private void generateValueLetters() {
        generateValue1Letters();
        generateValue2Letters();
        generateValue3Letters();
        generateValue4Letters();
        generateValue5Letters();
        generateValue8Letters();
        generateValue10Letters();
    }

    private void generateValue1Letters() {
        lettersValueMap.put("A", 1);
        lettersValueMap.put("E", 1);
        lettersValueMap.put("I", 1);
        lettersValueMap.put("O", 1);
        lettersValueMap.put("U", 1);
        lettersValueMap.put("L", 1);
        lettersValueMap.put("N", 1);
        lettersValueMap.put("R", 1);
        lettersValueMap.put("S", 1);
        lettersValueMap.put("T", 1);
    }

    private void generateValue2Letters() {
        lettersValueMap.put("D", 2);
        lettersValueMap.put("G", 2);
    }

    private void generateValue3Letters() {
        lettersValueMap.put("B", 3);
        lettersValueMap.put("C", 3);
        lettersValueMap.put("M", 3);
        lettersValueMap.put("P", 3);
    }

    private void generateValue4Letters() {
        lettersValueMap.put("F", 4);
        lettersValueMap.put("H", 4);
        lettersValueMap.put("V", 4);
        lettersValueMap.put("W", 4);
        lettersValueMap.put("Y", 4);
    }

    private void generateValue5Letters() {
        lettersValueMap.put("K", 5);
    }

    private void generateValue8Letters() {
        lettersValueMap.put("J", 8);
        lettersValueMap.put("X",8);
    }

    private void generateValue10Letters() {
        lettersValueMap.put("Q", 10);
        lettersValueMap.put("Z", 10);
    }
}
