public class Cliente {
    String nome;
    int cpf;
    int idade;


    public Cliente() {
    }

    public Cliente(String nome, int cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Cliente cpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public Cliente idade(int idade) {
        this.idade = idade;
        return this;
    }
    

     void infoCliente(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade+"\nCPF: "+ this.cpf );
    }

    public void maiorIdade(int idade){
        if (idade >= 18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }        
    }


    
}
