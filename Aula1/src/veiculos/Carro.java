package veiculos;

public class carros {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public String potencia;
    public Float valor;
    public int velocidade;

    void acelerar(){
        System.out.println("O Carro está acelerando");
    }

    void frear(){
        System.out.println("O carro está freando");    }


    @Override
    public String toString() {
        return "carros{}";
    }
}

