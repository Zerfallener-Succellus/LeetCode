import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Davi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite os numeros : ");
        String input = sc.nextLine();





        contar(input);
    }

    private static void contar(String input) {
        int tamanhoSequencia = 5;
        Map<String, Integer> countMap = new HashMap<>();


        for (int i = 0; i <= input.length() - tamanhoSequencia; i++) {
            String subSequencia = input.substring(i, i + tamanhoSequencia);


            if (ehConsecutiva(subSequencia)) {
                countMap.put(subSequencia, countMap.getOrDefault(subSequencia, 0) + 1);
            }
        }


        if (countMap.isEmpty()) {
            System.out.println("Nenhuma sequencia");
        } else {
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                System.out.println("Sequência encontrada: " + entry.getKey());
            }
        }
    }

    private static boolean ehConsecutiva(String sequencia) {
        for (int i = 0; i < sequencia.length() - 1; i++) {

            if (sequencia.charAt(i) + 1 != sequencia.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

