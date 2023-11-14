import java.util.List;

public abstract class Padaria implements Subject{
  private List<Donut> donuts;
  private List<Observer> observers;
  
  public void registrarObserver(Observer observador){
    this.observers.add(observador);
  }
  
  public void notifyObservers(List<Donut> l){
    this.observers.stream().forEach(ob -> {
      System.out.println("Novos donuts adicionados:");
      l.stream().forEach(p -> {
        System.out.println(". " + p.getSabor());
      });
    });
  }
  
  public void adicionarDonut(Donut donut){
    this.donuts.add(donut);
  }
 
  public Donut retirarDonut(String saborDonut){
    return this.donuts.stream().filter(r -> r.getSabor().equalsIgnoreCase(saborDonut)).findFirst().get();
  }
}
  