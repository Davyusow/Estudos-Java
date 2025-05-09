package classesutilitarias.formatacao;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //retorna a formatação padrão do sistema operacional
        String[] locais = Locale.getISOCountries();
        String[] linguas = Locale.getISOLanguages();
        for (String lingua : linguas) {
            System.out.println(lingua);
        }
        for (String locai : locais) {
            System.out.println(locai);
        }


    }
}
