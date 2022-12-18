import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter range");
        System.out.print("start");
        int start = s.nextInt();
        System.out.print("end");
        int end = s.nextInt();
        Find f = new Find();
        f.logic(start,end);
    }
}