public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente novoCliente = new Cliente();
        livro novoLivro = new livro();

        novoCliente.setNome("welington");
        novoCliente.setCpf(100000000);
        novoCliente.setIdade(40);

        novoLivro.setTitulo("POO - Programação Orientada a Objetos");
        novoLivro.setResumo("Uma fabrica de logica para inciantes em programação e professores afim de de lecionar.");
        novoLivro.setPaginas(540);

    
        novoLivro.info();
        novoLivro.atualizarTitulo("Meu Romance com a Programação!");
        novoLivro.info();
       

       novoCliente.infoCliente();
       novoCliente.maiorIdade(novoCliente.getIdade());




    }
}
