import java.util.List;

public class Atendimento {
    private List<Observer> observers;

    public void adicionarObserver(Observer observador){
       observers.add(observador); 
    }
    
    public void removerObserver(Observer observador){
        observers.remove(observador);
    }

    public void notifyObserver(String mensagem){
        observers.stream().forEach((i) -> {
            i.notify(mensagem);
        });
    }

    public void avaliarAtendimento(String mensagem){
        notifyObserver(mensagem);
    }
}
