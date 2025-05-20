package javacore.resourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle recursos = ResourceBundle.getBundle("mensagem",new Locale("pt","BR"));
        boolean existe =  recursos.containsKey("fulano");
        System.out.println(existe);
        existe =  recursos.containsKey("hello");
        System.out.println(existe);
        System.out.println(recursos.getString("hi"));
        System.out.println(recursos.getString("hello"));
        System.out.println(recursos.getString("good.morning"));
    }
}
