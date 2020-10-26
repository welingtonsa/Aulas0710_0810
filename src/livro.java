public class livro {
    int paginas;
    String titulo;
    String resumo;


    

    public livro() {
    }

    public livro(int paginas, String titulo, String resumo) {
        this.paginas = paginas;
        this.titulo = titulo;
        this.resumo = resumo;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public livro paginas(int paginas) {
        this.paginas = paginas;
        return this;
    }

    public livro titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public livro resumo(String resumo) {
        this.resumo = resumo;
        return this;
    }

     void info(){
        System.out.println(getTitulo());
        System.out.println(getResumo());
        System.out.println(getPaginas());
    }

    public String atualizarTitulo(String a) {
        titulo = a;
        return titulo;
    }





    
}
