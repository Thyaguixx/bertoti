public class Model{
    private static Model model;
    private Model() {};

    public static Model getInstance(){
        if (model == null){
            model = new Model();
            // return model;
        }
        return model;
    }

    public void log(String conteudo){
        System.out.println("Ação do usuário registrado: " + conteudo);
    }
}
