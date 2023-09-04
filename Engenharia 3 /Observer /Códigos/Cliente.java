public class Cliente implements Observer {
    public void notify(String mensagem){
        System.out.println(mensagem);
    }
}