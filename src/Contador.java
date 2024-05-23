import java.util.InputMismatchException;
import java.util.Scanner;


public class Contador {    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean validarNumero = false; 
        
        while (!validarNumero) {
            try {
                System.out.println("Informe um número entre 0 e 100:");
                numero1 = entrada.nextInt();
        
                System.out.println("Agora informe outro número, para iniciar a contagem:");
                numero2 = entrada.nextInt();

                if (numero1 >= numero2) {
                    throw new ParametrosInvalidosExeption();
                }

                validarNumero = true;
                contador(numero1, numero2);
            }
            catch (InputMismatchException e) {
                System.out.println("Valor inválido, por favor informe apenas números");
                entrada.next();
            }
            catch (ParametrosInvalidosExeption e) {
                System.out.println("O primeiro número deve ser menor que o segundo.");
            }    
        }
      entrada.close();
    }
    public static void contador(int numero1, int numero2) throws ParametrosInvalidosExeption {
        if(numero1 > numero2) {
            throw new ParametrosInvalidosExeption();
        }   
                for(int contar = numero1; contar <= numero2; contar++) {
                    System.out.print(contar + ", ");
                }
    }

}  
      
    

