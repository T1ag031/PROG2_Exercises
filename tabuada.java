// Programa em Java que imprime para o ecrã as tabuadas do 1 ao 10

public class Main {

    public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("\nTabuada do "+ i +":\n");
            for (int j = 0; j <= 10 ; j++) {
                result = i * j;
                System.out.println(i + "*" + j + "=" + result);
            }

        }
    }
}

