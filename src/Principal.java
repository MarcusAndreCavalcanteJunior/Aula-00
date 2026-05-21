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
        meuCarro.proprietario = eu;

        /*TAMBEM PODE SER FEITO DA FORMA FEITA ABAIXO. MAS PODE FICAR ILEGIVEL
        POR ISSO SEPARO E INSTACIO a variavel E DEPOIS SÓ ATRIBUIR aO OBJETO PESSOA.
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "André";
        meuCarro.proprietario.cpf = "123.456.789-01";
        meuCarro.proprietario.anoNascimento = 1987;
        Instaciando uma nova pessoa
        para a variavel proprietario que está no objeto carro. Vai criar um novo
        objeto do tipo pessoa na memória do java, vinculamos esse objeto a variavel
        de instancia proprietario que está dentro do meu carro.*/


        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;

        System.out.println("Meu carro");
        System.out.println("-------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
        /*CUIDADO NA LINHA ACIMA POIS SE DEIXAR meuCarro.proprietario precisa
        espeficicar o atributo que vc quer imprimir se deixar assim ele vai i
        mprimir  o to string*/

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("-------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
