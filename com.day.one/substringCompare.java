public class substringCompare {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        smallestAndLargest(s,k);
    }

    public static String smallestAndLargest(String s, int k){
        String smallest = "", largest = "";

        smallest = s.substring(0,k);
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(i,i+k).compareTo(smallest)<0)
            smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest)>0)
            largest = s.substring(i, i+k);
        }
        System.out.println(" "+smallest+" "+largest);
        return smallest+" "+largest;

    }
    
}
