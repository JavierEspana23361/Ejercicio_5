/*
 * Universidad del Valle de Guatemala
 * POO - seccion 30
 * Roberto Barreda 23354 y Javier España 23361
 */

/**
 * Clase principal que contiene el método main para probar el sistema.
 */


public class Main {
    public static void main(String[] args) {
        // Crear un catálogo
        Catalogo catalogo = new Catalogo();

        // Agregar materiales al catálogo (puedes adaptar esto según tus necesidades)
        MaterialBibliografico material1 = new MaterialBibliografico("Libro1", "Editorial1", 2020, "Ficción", "Autor1", "Libro");
        MaterialBibliografico material2 = new MaterialBibliografico("Artículo1", "Editorial2", 2019, "Ciencia", "Autor2", "Artículo");

        catalogo.agregarMaterial(material1);
        catalogo.agregarMaterial(material2);

        // Mostrar el catálogo en formato APA
        String catalogoAPA = catalogo.mostrarCatalogoAPA();
        System.out.println("Catálogo en formato APA:\n" + catalogoAPA);
    }
}