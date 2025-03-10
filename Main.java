public class Main {
    public static void main(String[] args) {
    // Criando objetos de Carro e Moto
    Carro carro1 = new Carro("Toyota", "Corolla", 2022, 4);
    Carro carro2 = new Carro("Ford", "Mustang", 2021, 2);
    Moto moto1 = new Moto("Honda", "CBR 600", 2020, 600);
    Moto moto2 = new Moto("Yamaha", "MT-07", 2023, 700);
   
    // Exibindo detalhes dos veículos
    System.out.println("Detalhes do Carro 1:");
        carro1.exibirDetalhes();
        System.out.println();
   
    System.out.println("Detalhes do Carro 2:");
        carro2.exibirDetalhes();
        System.out.println();
   
    System.out.println("Detalhes da Moto 1:");
        moto1.exibirDetalhes();
        System.out.println();
   
    System.out.println("Detalhes da Moto 2:");
        moto2.exibirDetalhes();
        System.out.println();
    }
}
   