
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1,x2,x3;
        System.out.print("X1: ");
        x1 = leitor.nextDouble();
        System.out.print("X2: ");
        x2 = leitor.nextDouble();
        x3 = x1%x2;
        
        if(x3 == 0){
            System.out.printf("A divisão de %.2f por %.2f é exata " ,x1 , x2);
            
        }else{
            System.out.printf("A divisão de %.2f por %.2f não é exata " , x1, x2);
        }
    }
    
}
