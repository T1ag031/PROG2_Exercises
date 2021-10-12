/*
    Programa em Java, números de 1 a 1000 múltiplos de 3, mas não divisíveis por 9
*/

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000 ; i++) {
            if((i % 3) == 0) {
                if((i % 9) != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}