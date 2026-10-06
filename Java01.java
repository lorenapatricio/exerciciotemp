import java.util.Scanner;
public class Exjava {
public static void main(String[] args) {

    int[] temperatura = new int[12];
    double soma = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < temperatura.length; i++) {

        System.out.println("Digite a temperatura do dia " + (i + 1));
        temperatura[i] = leia.nextInt();

        while (temperatura[i] < 4 || temperatura[i] > 10) {

            System.out.println("ALERTA! A TEMPERATURA DEVE ESTAR ENTRE 4 E 10!");
            temperatura[i] = scanner.nextInt();
        }

        soma = soma + temperatura[i];
    }
    
    double media = soma / 12;

    System.out.println("A média é: " + media);

    scanner.close();

}
}
