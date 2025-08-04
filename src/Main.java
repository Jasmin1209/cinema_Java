import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        var nome_filme = scanner.nextLine();

        System.out.println("Digite o tipo de Audio: ");
        var tipo_Audio = scanner.nextLine();


        System.out.println("---TIPOS DE INGRESSOS ---");
        System.out.println("1 - Ingresso Padrão");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Ingresso Familia");
        System.out.print("Escolha: ");
        var option = scanner.nextInt();

        Ingressos ingresso;
        MeiaEntrada meia;
        IngressoFamilia ingressoFamilia;

        switch (option){
            case 1 -> {
                ingresso = new Ingressos(nome_filme, tipo_Audio);
                ingresso.exibir_Detalhes();
            }
            case 2 -> {
                meia = new MeiaEntrada(nome_filme, tipo_Audio);
                meia.exibir_Detalhes();
            }

            case 3 -> {
                System.out.println("Informe o numero de pessoas: ");
                var numero_pessoas = scanner.nextInt();
                ingressoFamilia = new IngressoFamilia(nome_filme, tipo_Audio, numero_pessoas);
                ingressoFamilia.exibir_Detalhes();
            }

        }

    }
}
