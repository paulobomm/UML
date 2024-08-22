package veiculos;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public String potencia;
    public Float valor;
    public int velocidade;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    @Override
    public String toString() {
        if(marca != null && modelo != null && ano > 0 && cor != null){
            return marca + " " + modelo + " " + ano + " " + cor.toUpperCase();
        }
        return marca + " " + cor;
    }

    public void acelerar(){
        System.out.println("O Carro está acelerando".toUpperCase());
    }

    public void frear(){
        System.out.println("O carro está freando".toUpperCase());
    }



}

