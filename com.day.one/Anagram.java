import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        checkAnagram("Mother In Law", "Hitler Woman");
        checkAnagram("keEp", "peeK");
        
    }

    public static void checkAnagram(String s1, String s2){
        String copyOfS1 = s1.replaceAll("\\s", " ");
        String copyOfS2 = s2.replaceAll("\\s", " ");

        boolean status = false;

        if(copyOfS1.length() != copyOfS2.length()){
            status = false;
        }else{
            char[] strChar1 = copyOfS1.toLowerCase().toCharArray();
            char[] strChar2 = copyOfS2.toLowerCase().toCharArray();

            Arrays.sort(strChar1);
            Arrays.sort(strChar2);

            status = Arrays.equals(strChar1, strChar2);
            if(status){
                System.out.println(s1+" and "+s2+" are anagrams");
            }else{
                System.out.println(s1+" and "+s2+" are not anagrams");

            }
        }
    }
    
}
