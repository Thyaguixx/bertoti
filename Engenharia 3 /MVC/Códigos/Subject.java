import java.util.List;

public interface Subject{
  public void registrarObserver(Observer o);
  public void notificarObservers(List<Donut> donut);
  
}