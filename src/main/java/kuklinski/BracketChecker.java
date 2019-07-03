package kuklinski;

import java.util.LinkedList;
import java.util.Queue;

public class BracketChecker {

    String bracket;

    public BracketChecker(String bracket) {
        this.bracket = bracket;
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        Queue<String> bracketQueue = new LinkedList<>();
        for(int i = 0; i < bracket.length(); i++) {
            Character bracketChar = bracket.charAt(i);
            String bracketString = String.valueOf(bracketChar);
            if(isOpenBracket(bracketChar)) {
                bracketQueue.add(String.valueOf(bracketChar));
            }else {
                String openBracket = bracketQueue.poll();

                if(openBracket == null) {
                    return false;
                }
                else if(openBracket.equals("[") && !bracketString.equals("]")){
                    return false;
                }
                else if(openBracket.equals("(") && !bracketString.equals(")")){
                    return false;
                }
                else if(openBracket.equals("{") && !bracketString.equals("}")){
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
