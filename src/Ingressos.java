public class Ingressos {
    protected double valor;
    protected String nome_filme;
    protected String tipo_Audio;

    public Ingressos ( String nome_filme, String tipo_Audio) {
        this.valor = 30;
        this.nome_filme = nome_filme;
        this.tipo_Audio = tipo_Audio;
    }

    public double getValorReal(){
        return valor;
    }

    public void exibir_Detalhes(){
        System.out.printf("Valor: R$ %.2f\n", getValorReal());
        System.out.println("Filme: " + nome_filme);
        System.out.println("Tipo de Audio: " + tipo_Audio);
    }
}
