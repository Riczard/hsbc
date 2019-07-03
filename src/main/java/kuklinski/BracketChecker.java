package kuklinski;

import java.util.LinkedList;
import java.util.Queue;

public class BracketChecker {

    String bracket;

    public BracketChecker(String bracket) {
        this.bracket = bracket;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        Queue<Character> bracketQueue = new LinkedList<>();
        for(int i = 0; i < bracket.length(); i++) {
            Character bracketChar = bracket.charAt(i);
            String bracketString = String.valueOf(bracketChar);
            if(isOpenBracket(bracketChar)) {
                bracketQueue.add(bracketChar);
            }else {
                String closeBracket = String.valueOf(bracketQueue.poll());
                if(closeBracket.equals("]") && !bracketString.equals("[")){
                    return false;
                }
                else if(closeBracket.equals(")") && !bracketString.equals("(")){
                    return false;
                }
                else if(closeBracket.equals("{") && !bracketString.equals("{")){
                    return false;
                }
            }

        }
        return true;
    }

    private boolean isOpenBracket(Character bracketChar) {
        return bracketChar.equals('[') || bracketChar.equals('{') || bracketChar.equals('(');
    }
}
