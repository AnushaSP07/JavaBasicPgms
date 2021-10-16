import java.util.Scanner;

public class RemoveSpace {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        String noSpace = input.replaceAll("\\s+", "");
        System.out.println(noSpace);
        sc.close();

    }
}
