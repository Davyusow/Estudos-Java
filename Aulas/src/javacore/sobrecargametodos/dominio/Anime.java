package javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(){
        this.nome = "<desconhecido>";
        this.tipo = "<desconhecido>";
        this.episodios = 0;
        this.genero = "<desconhecido>";
    }
    public Anime(String nome,String tipo,int episodios,String genero){  //construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    /* public Anime(String nome,String tipo,int episodios,String genero,String estudio){  //opção de sobrecarga
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.estudio = estudio;
    }*/
    public Anime(String nome,String tipo,int episodios,String genero,String estudio){   //opçao otimizada de sobrecarga
        this(nome,tipo,episodios,genero);   //chama o construtor da classe, nesse caso o contrutor que tinha 4 argumentos
        //só funciona dentro de construtores e precisa estar na primeira linha do código
        this.estudio = estudio;
    }

    public void init(String nome,String tipo,int episodios){    //método
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }//O que diferencia os métodos, é a quantidade de parâmetros inseridos, tornando não obrigatório a inserção do gênero
    public void init(String nome,String tipo,int episodios,String genero){
       this.nome = nome;
       this.tipo = tipo;
       this.episodios = episodios;
       //poderia chamar o "init(nome,tipo,episodios);" aqui para diminuir as linhas
       this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setEstudio(String estudio){
        this.estudio = estudio;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getEstudio(){
        return this.estudio;
    }

}
