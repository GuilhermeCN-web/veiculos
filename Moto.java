public class Moto extends Veiculo {
    // Atributo adicional
    private int cilindradas;
   
    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindradas) {
    super(marca, modelo, ano); // Chama o construtor da superclasse
    this.cilindradas = cilindradas;
    }
   
    // Getter para cilindradas
    public int getCilindradas() {
    return cilindradas;
    }
   
    // Sobrescreve o método exibirDetalhes para incluir cilindradas
    @Override
    public void exibirDetalhes() {
    super.exibirDetalhes(); // Chama o método da superclasse
    System.out.println("Cilindradas: " + cilindradas);
    }
    }