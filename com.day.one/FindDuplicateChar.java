import java.util.HashMap;
import java.util.Set;

public class FindDuplicateChar {

    public static void main(String[] args) {
        String s =" Hei hello!! how you doing";
        duplicateChars(s);
        
    }

    public static void duplicateChars(String inputString){
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for(char c: strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Chars in InputString "+charsInString);

        for(char ch : charsInString){
            if(charCountMap.get(ch)>1){
                System.out.println(ch+" : "+charCountMap.get(ch));
            }
        }
    }
    
}
