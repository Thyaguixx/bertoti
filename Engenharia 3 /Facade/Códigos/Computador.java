public class Computador {
    private CPU cpu;
    private RAM ram;
    private CD disco;

    public Computador() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.disco = new CD();
    }

    void ligarComputador() {
        System.out.println("Iniciando o computador...");

        cpu.start();
        ram.carregar();
        disco.lerDisco();

        System.out.println("Computador iniciado com sucesso!");
    }

    void desligarComputador() {
        System.out.println("Desligando o computador...");

        disco.escreverDisco();;
        ram.descarregar();
        cpu.powerOff();

        System.out.println("Computador desligado com segurança.");
    }
}
