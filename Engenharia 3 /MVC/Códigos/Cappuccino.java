public abstract class Cappuccino implements Bebida{
    private View view;
    private Padaria padaria;
    
    public void ganharBebida(){
      System.out.println("Você ganhou um cappuccino grátis ao comprar um bolo!");
    }
    
    public void setVisualizador(View view){
      this.view = view;
    }
}
