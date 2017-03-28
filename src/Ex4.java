
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double kwh, valormin, valortotal;
        System.out.print("KW Consumido: ");
        kwh = leitor.nextDouble();
        valormin = 11.90;
        
        if(kwh < 150){
        valortotal = valormin + (kwh * 0.20);
            System.out.printf("O valor total da conta é: %2.2f ", valortotal);
        }else if(kwh >= 150 && kwh < 500){
        valortotal = valormin + (kwh * 0.25);
            System.out.printf("O valor total da conta é: %2.2f ", valortotal);
        }else{
        valortotal = valormin + kwh * 0.30;
            System.out.printf("O valor total da conta é: %2.2f ", valortotal);
        }
        
        
        
        
    }
    
    
}
