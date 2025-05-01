package javacore.sobrescrita.dominio;

public class Anime {
    private String nomme;

    public Anime(String nomme) {
        this.nomme = nomme;
    }

    public String getNomme() {
        return nomme;
    }

    public void setNomme(String nomme) {
        this.nomme = nomme;
    }

    @Override
    public String toString(){
        return "Anime: "+this.getNomme();
    }

}
