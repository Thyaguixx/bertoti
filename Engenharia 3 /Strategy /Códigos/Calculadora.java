public class Calculadora {
    private Operacao operacao;
   
    public void setTipoOperacao(Operacao operacao){
        this.operacao = operacao;
    }

    public void realizarCalculo(float numeroA, float numeroB) {
        this.operacao.calcular(numeroA, numeroB);
    }

}