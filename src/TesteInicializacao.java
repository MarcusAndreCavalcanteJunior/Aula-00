public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;
        meuCarro.proprietario.nome = "Maria";
        meuCarro.proprietario = new Pessoa();

        Pessoa proprietarioAntigo = meuCarro.proprietario;

        meuCarro.proprietario = new Pessoa();
/*OBS.ProprietarioAntigo e meuCarro.proprietario apontavam para o mesmo objeto João.
Quando criamos um new Pessoa() para meuCarro.proprietario, ele passou a apontar para
um objeto novo. Mas proprietarioAntigo continuou apontando para o João antigo,
mantendo ele vivo na memória*/
        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.proprietario.nome);

    }
}
