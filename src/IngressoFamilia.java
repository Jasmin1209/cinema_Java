public class IngressoFamilia extends Ingressos{

    private final int qtd_pessoas;

    public IngressoFamilia (int qtd_pessoas){
        super();
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
