public class Ingressos {
    protected double valor;
    protected String nome_filme;
    protected String tipo_Audio;

    public Ingressos (){
        this.valor = 20;
        this.nome_filme = "Matrix";
        this.tipo_Audio = "Dublado";
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
