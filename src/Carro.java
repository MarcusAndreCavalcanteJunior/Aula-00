// ATRIBUTOS E CARACTERISTICAS DO TIPO CARRO
public class Carro {
//NUNCA COLOQUE O NOME DO OBJETO NA IDENTIFICAÇÃO DO MESMO.
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
   /* Na instanciação fica como se estivese null
    Pessoa proprietario; está como se fosse null*/
//NOS MÉTODOS SEMPRE USE O VERBO NO INFINITIVO EX:calcula = calcular
    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda de: %s %d%n",
               modelo, anoFabricacao );
    }

}
