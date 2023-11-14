import java.util.List;

public abstract class View implements Observer{
  private Bebida bebidaGratis;
  private List<Donut> donuts;
  
  public void setBebidaGratis(Bebida bebida){
    this.bebidaGratis = bebida;
  }
  
  public void atualizar(List<Donut> donut){
    this.donuts = donut;
  }
  
}