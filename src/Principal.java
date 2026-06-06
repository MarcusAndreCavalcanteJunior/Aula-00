public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "André";
        eu.cpf = "123.456.789-01";
        eu.anoNascimento = 1987;

        Pessoa voce = new Pessoa();
        voce.nome = "Rai";
        voce.cpf = "062.456.789-03";
        voce.anoNascimento = 1990;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();

        /* Esse treco do código pode ser resumido com 1 só linha como mostrado acima
        para minimizar as duplicações de linhas por isso da para ir quebrando o
        código em pequenos metódos que fazem coisas espeficicas deixando ele mais limpo
        e bem organizado.
        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();


        System.out.printf("Tempo de uso (Anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);*/


   //    seuCarro.calcularValorRevenda();

        /*System.out.println("Meu carro");
        System.out.println("-------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("-------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);*/
    }
}
