public class EqualityOfTwoArray {

    public static void main(String[] args) {

        int[] one = {1,2,3,4};
        int[] two = {2,3,4,5};
        boolean equalOrNot = false;

        if(one.length == two.length){
            for(int i=0;i<one.length;i++){
                if(one[i]!=two[i]){
                    equalOrNot = false;
                }
            }
        }else{
            equalOrNot = false;
        }
        if(equalOrNot){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
