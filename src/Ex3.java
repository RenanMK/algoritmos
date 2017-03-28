
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float peso, altura, massa;
        System.out.print("Peso: ");
        peso = leitor.nextFloat();
        System.out.print("Altura: ");
        altura = leitor.nextFloat();
        massa = peso / (altura*altura);
        if(massa < 26){
            System.out.printf("Valor da sua massa corpórea é %.2f, e seu grau de obesidade é normal \n",massa);
        }else if(massa >=26 && massa < 30){
            System.out.printf("Valor da sua massa corpórea é %.2f, e seu grau de obesidade é obeso \n",massa);
        }else{
            System.out.printf("Valor da sua massa corpórea é %.2f, e seu grau de obesidade obeso mórbido \n",massa);
        }
        
        
}
}
