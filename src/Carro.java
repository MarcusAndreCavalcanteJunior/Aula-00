public class Carro {
/*Aula de debug ATENÇÃO: ao usar Step Into no debug  tomar cuidado com o step into
caso algo tenha algo efeito colateral no sistema isso não vai ser desfeito*/
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;
   /* Na instanciação fica como se estivese null
    Pessoa proprietario; está como se fosse null*/
//NOS MÉTODOS SEMPRE USE O VERBO NO INFINITIVO EX:calcula = calcular
    void calcularValorRevenda() {
        int tempoDeUsuEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;


        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsuEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        System.out.printf("Tempo de uso (Anos): %d%n", tempoDeUsuEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
    }

}
