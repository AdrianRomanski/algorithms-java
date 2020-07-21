package static_initializers;

import java.util.Scanner;

public class StaticInitializers {

    private static final Scanner input = new Scanner(System.in);
    private static boolean flag = true;
    private static final int B = input.nextInt();
    private static final int H = input.nextInt();

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception ignored) {
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}

