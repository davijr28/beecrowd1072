
import java.util.Scanner;

public class Beecrowd1072 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variáveis para o número de repetições e os contadores
        int N;
        int in = 0, out = 0;
        
        //ler número de repetições
        N = scanner.nextInt();
        
        //declarar array com o valor lido
        int X[] = new int[N];
        
        //lê o restante dos valores
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
            //determina a qual intervalo o valor inserido pertence
            if (X[i] >= 10 && X[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }
        //mostrar resultado no console
        System.out.printf("%d in%n%d out%n", in, out);
    }
}
