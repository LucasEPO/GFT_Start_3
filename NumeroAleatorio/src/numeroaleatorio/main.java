package numeroaleatorio;

import java.util.Scanner;

/**
 *
 * @author LucasEPO
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //intervalo dos valores
        final int MAX = 10;
        final int MIN = 0;
        
        while(true){
            //sorteio entre numeros do intervalo
            int answer = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN );
            
            //palpite do usuario
            System.out.println("--------------");
            System.out.println("Insira um número de 0 a 10");
            int guess = scan.nextInt();
            
            if(guess == answer) {
                System.out.println("Acertou!");
                return;
            } else {
                System.out.println("Errou o número sorteado foi: " + answer);
                System.out.println("Tente Novamente!");
            }
        }
    }

}
