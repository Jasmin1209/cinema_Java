public class IngressoFamilia extends Ingressos{

    private final int qtd_pessoas;

    public IngressoFamilia (String nome_filme, String tipo_Audio, int qtd_pessoas){
        super(nome_filme, tipo_Audio);
        this.qtd_pessoas = qtd_pessoas;
    }

    @Override
    public double getValorReal(){
        double total = valor * qtd_pessoas;
        if(qtd_pessoas > 3){
            total *= 0.95;
        }
        return total;
    }
}
