package javacore.optional.repositorio;

import javacore.optional.dominio.Manga;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RepositorioManga {
    private static List<Manga> mangas = List.of(new Manga(1,"Boruto",200), new Manga(2,"One Piece",1500));

//    private static Optional<Manga> encontrarPorTitulo(String titulo){
//        Manga resultado = null;
//        for (Manga manga : mangas) {
//            if(manga.getTitulo().equals(titulo)){
//                resultado = manga;
//            }
//        }
//        return Optional.ofNullable(resultado);
//    }
//
//    private static Optional<Manga> encontrarPorId(Integer id){
//        Manga resultado = null;
//        for (Manga manga : mangas) {
//            if(manga.getId().equals(id)){
//                resultado = manga;
//            }
//        }
//        return Optional.ofNullable(resultado);
//    }
    private static Optional<Manga> encontrarPor(Predicate<Manga> predicate){
        Manga resultado = null;
        for (Manga manga : mangas) {
            if(predicate.test(manga)){
                resultado = manga;
            }
        }
        return Optional.ofNullable(resultado);
    }

    private static Optional<Manga> encontrarPorTitulo(String titulo){
        return encontrarPor(m -> m.getTitulo().equals(titulo));
    }

    private static Optional<Manga> encontrarPorId(Integer id){
        return encontrarPor(m -> m.getId().equals(id));
    }

}
