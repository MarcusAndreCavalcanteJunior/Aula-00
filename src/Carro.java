/* ATRIBUTOS E CARACTERISTICAS DO TIPO CARRO
 Aula de debug ATENÇÃO: ao usar Step Into no debug  tomar cuidado com o step into
caso algo tenha algo efeito colateral no sistema isso não vai ser desfeito*/
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
    double calcularValorRevenda() {//
        int tempoDeUsuEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;


        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsuEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }


/*É bom saber que o return no final das instruções do código ou ele vai dar erro de
compilação pois não há possibilidade do código abaixo ser executado porque o return
é para sair de um metódo e retornar um valor, porém nem sempre o return tem de ser a
última instrução por exemplo tbm poderiamos querer fazer um return 0; dentro do if
mesmo não tendo nada a ver a lógica só pra saber mesmo, caso contrário usa se o
return no final do bloco.*/
        return valorRevenda;
    }

}

