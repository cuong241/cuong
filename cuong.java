
package Nhapmon;
import java.util.Scanner;

 class Tong {
    public static int So(int x)
    {
        int Q = 0;
        for (int i = 1 ; i <= x ; i++)
        {
            String NN = String.valueOf(i);
            NN = NN + NN;
            int T = Integer.parseInt(NN);
            Q += T;
        }
        return Q;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Nhap N: ");
        int x = scanner.nextInt();                
        System.out.println("Tong S = "+ So(x));       
        scanner.close();
    }
}
