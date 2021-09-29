/*
    Programa em Java que cria um array e inicializa o mesmo com
    a sequência Fibonacci até 21
*/

public class Main {

    public static void main(String[] args) {
        // n e k representam os primeiros números da sequência, respetivamente
        int n = 0, k = 1;
        int result = 0;
        for (int i = 0; i < 9; i++) {
            if (i > 1){
               result = n + k;
            }
            else {
                result = i;
            }
            if(i == 8){
                System.out.println(result);
                break;
            }
            System.out.print(result + ", ");
            n = k;
            k = result;
        }
    }
}
