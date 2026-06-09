
public class Carro {
//NUNCA COLOQUE O NOME DO OBJETO NA IDENTIFICAÇÃO DO MESMO.
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {

        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação.");
            return;// para sair do metodo void(vazio) não precisa por valor nem nada
        }
// Assim não executando esse trecho do código e deixando mais limpo
        System.out.printf("Tempo de uso (Anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
//Enxugar o codigo e deixar ele mais limpo criando a variavel
        if (tempoDeUsoEmAnos >= 10)
            return 0;
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda() {//
        int tempoDeUsuEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;


        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsuEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }


        return valorRevenda;
    }

}

