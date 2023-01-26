
import entidades.Libro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Variaciones en rojo","Rodolfo Walsh",144));
        listaLibros.add(new Libro("La historia de Lisey","Stephen King",200));
        listaLibros.add(new Libro("Harry Potter y la piedra filosofal","J.K. Rowling",452));

        System.out.println("Lista de libros");
        System.out.println("----------------");

        for (Libro libro : listaLibros) {
            System.out.println("");
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Cantidad de paginas: " + libro.getPaginas());
        }
    }
}