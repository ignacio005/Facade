public class ComputadoraFacade {
    private CPU cpu;
    private DiscoDuro discoDuro;
    private Memoria memoria;
    // Se crean los objetos
    public ComputadoraFacade(){
        this.cpu = new CPU();
        this.discoDuro = new DiscoDuro();
        this.memoria= new Memoria();
    }
    // Se llaman a los metodos de cada clase por orden
    public void encender(){
        cpu.iniciar();
        discoDuro.arrncar();
        memoria.cargar();
    }
}
