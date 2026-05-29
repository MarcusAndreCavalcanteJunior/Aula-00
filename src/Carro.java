// ATRIBUTOS E CARACTERISTICAS DO TIPO CARRO
public class Carro {
//NUNCA COLOQUE O NOME DO OBJETO NA IDENTIFICAÇÃO DO MESMO.
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;
   /* Na instanciação fica como se estivese null
    Pessoa proprietario; está como se fosse null*/
//NOS MÉTODOS SEMPRE USE O VERBO NO INFINITIVO EX:calcula = calcular
    void calcularValorRevenda() {/* esse int é uma variavel local ela só existe
dentro do bloco tem acesso a ela acabou a execução desse metódo ela some da memória,
diferente das outras variavéis de instância que podem ser chamadas em outros lugares.*/
        int tempoDeUsuEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;
/*Esse 20  da variavel acimafoi para não deixar números soltos facilitando a
leitura futura do código antes estava assim abaixo.
double valorRevenda = (precoCompra / 20) * (20 - tempoDeUsuEmAnos);*/

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsuEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        System.out.printf("Tempo de uso (Anos): %d%n", tempoDeUsuEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
    }

}
