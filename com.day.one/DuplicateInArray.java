import java.util.HashSet;

public class DuplicateInArray {
    
    public static void main(String[] args) {
        
        int[] num ={1,1,2,3,5,4,3,7};
        findDuplicateInArray(num);
    }

    public static void findDuplicateInArray(int[] inputArray){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : inputArray){
            if(! hashSet.add(num)){
                System.out.println("Duplicate numer is "+num);
            }
        }
    }
}
