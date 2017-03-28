
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1, x2;
        System.out.print("X1: ");
        x1 = leitor.nextDouble();
        if(x1 > 100){
            x2 = x1 + 150;
            System.out.println(x2);
        }else{
            System.out.println(x1);
        }
        
        
        
    }
}
