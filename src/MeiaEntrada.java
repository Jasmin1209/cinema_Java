public class MeiaEntrada extends Ingressos{

    public MeiaEntrada (String nome_filme, String tipo_Audio){
        super(nome_filme, tipo_Audio);
    }

    @Override
    public double getValorReal(){
        return valor / 2;
    }
}
