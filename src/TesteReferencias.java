public class TesteReferencias {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X-6";

        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Sebastião";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);
/*Variaveis refenciam objetos a variavel não é o bjeto em si a variavel é apenas um
pra um objeto que está alocado na memória da JVM. Como ilustra abaixo o
objeto é o mesmo e varias variaveis estão apontando para o mesmo objeto a mesma coisa
está sendo alterado vai ser refletida nas 2 variaveis no caso
        meuCarro.proprietario.nome = "Maria";
        System.out.println(pessoa1.nome);*/

        /*pessoa1.nome = "Maria";
        System.out.println(meuCarro.proprietario.nome);*/
    }
}
