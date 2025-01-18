package com.alura.literalura.controller;

import com.alura.literalura.model.Libro;
import com.alura.literalura.repository.LibroRepository;
import com.alura.literalura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class LiteraluraController {

    @Autowired
    private GutendexService gutendexService;

    @Autowired
    private LibroRepository libroRepository;

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    buscarYRegistrarLibro(scanner);
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarLibrosPorIdioma(scanner);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Buscar libro por título");
        System.out.println("2. Listar libros registrados");
        System.out.println("3. Listar autores registrados");
        System.out.println("4. Listar libros por idioma");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void buscarYRegistrarLibro(Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        Libro libro = gutendexService.buscarLibroPorTitulo(titulo);
        if (libro != null) {
            libroRepository.save(libro);
            System.out.println("Libro registrado exitosamente: " + libro.getTitulo());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private void listarLibrosRegistrados() {
        List<Libro> libros = libroRepository.findAll();
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("\n=== LIBROS REGISTRADOS ===");
            libros.forEach(libro -> {
                System.out.println("\nTítulo: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Idioma: " + libro.getIdioma());
                System.out.println("Descargas: " + libro.getDescargas());
                System.out.println("------------------------");
            });
        }
    }

    private void listarAutoresRegistrados() {
        List<Libro> libros = libroRepository.findAll();
        if (libros.isEmpty()) {
            System.out.println("No hay autores registrados.");
        } else {
            System.out.println("\n=== AUTORES REGISTRADOS ===");
            libros.stream()
                    .map(Libro::getAutor)
                    .distinct()
                    .forEach(System.out::println);
        }
    }

    private void listarLibrosPorIdioma(Scanner scanner) {
        System.out.print("Ingrese el idioma: ");
        String idioma = scanner.nextLine();
        List<Libro> libros = libroRepository.findByIdioma(idioma);
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en " + idioma);
        } else {
            System.out.println("\n=== LIBROS EN " + idioma.toUpperCase() + " ===");
            libros.forEach(libro -> {
                System.out.println("\nTítulo: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("------------------------");
            });
        }
    }
}