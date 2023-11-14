public abstract class CafeExpresso implements Bebida{
  private View view;
  private Padaria padaria;
  
  public void setVisualizador(View view){
    this.view = view;
  }

  public void ganharBebida(){
    System.out.println("Você ganhou um café expresso ao comprar um bolo!");
  }

}