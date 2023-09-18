public class Main {
    public static void main(String[] args) {
        // Obter a instância única do EventLogger
       Model model = Model.getInstance();

        // Registrar as ações
        model.log("Ação 1");
        model.log("Ação 2");
        model.log("Ação 3");
    }
}