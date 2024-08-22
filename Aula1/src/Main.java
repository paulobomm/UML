import veiculos.Carro;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro( "BMW",  "320I","Azul", 2020);
        Carro carro2 = new Carro( "BMW",  "140","Laranja", 2023);
        Carro carro3 = new Carro( "BMW",  "520I","Preta", 2021);
        Carro carro4 = new Carro( "BMW",  "120I","Branca", 2019);

        System.out.println(carro1);
        carro1.acelerar();
        System.out.println(carro2);
        carro2.frear();
        System.out.println(carro3);
        System.out.println(carro4);

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: "+ carro1.modelo);



    }
}