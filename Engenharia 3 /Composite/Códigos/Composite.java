import java.util.ArrayList;
import java.util.List;

public class Composite implements Grafica {

    private List<Grafica> graphics = new ArrayList<>();

    public void addGraphic(Grafica g) {
        graphics.add(g);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhar um grupo de elementos:");
        
        for (Grafica graphic : graphics) {
            graphic.desenhar();
        }
    }
}