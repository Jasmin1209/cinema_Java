public class Main {
    public static void main (String [] args){
        Ingressos ingressoPadrao = new Ingressos();
        MeiaEntrada meia = new MeiaEntrada();
        IngressoFamilia familia3 = new IngressoFamilia(3);
        IngressoFamilia familia5 = new IngressoFamilia(5);


        System.out.println("--- Ingresso Padrão ---");
        ingressoPadrao.exibir_Detalhes();

        System.out.println("--- Meia Entrada ---");
        meia.exibir_Detalhes();

        System.out.println("--- Ingresso Família (03 pessoas) ---");
        familia3.exibir_Detalhes();

        System.out.println("--- Ingresso Família (05 pessoas) ---");
        familia5.exibir_Detalhes();
    }
}
