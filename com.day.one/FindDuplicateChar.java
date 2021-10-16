import java.util.HashMap;
import java.util.Set;

public class FindDuplicateChar {

    public static void main(String[] args) {
        String s =" Hei hello!! how you doing";
        duplicateChars(s);
        
    }

    public static void duplicateChars(String inputString){
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        char[] charArray = inputString.toCharArray();
            for(char ch : charArray){
                if(charCountMap.containsKey(ch)){
                    charCountMap.put(ch, charCountMap.get(ch)+1);
                }else{
                    charCountMap.put(ch, 1);
                }
            }
            Set<Character> set = charCountMap.keySet();
            System.out.println("Duplicate chars in "+inputString);
            for(Character c : set){
                if(charCountMap.get(c)>1){
                    System.out.println(c+" "+charCountMap.get(c));
                }
            }
    }
    
}
