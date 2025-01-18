package com.alura.literalura;

import com.alura.literalura.controller.LiteraluraController;
import com.alura.literalura.model.Libro;
import com.alura.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LiteraluraController literaluraController;

	@Autowired
	private LibroRepository libroRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Agregar libros de prueba
		agregarLibrosDePrueba();

		// Iniciar la aplicación
		literaluraController.iniciar();
	}

	private void agregarLibrosDePrueba() {
		// Solo agregar si no hay libros en la base de datos
		if (libroRepository.count() == 0) {
			Libro libro1 = new Libro();
			libro1.setTitulo("Don Quijote de la Mancha");
			libro1.setAutor("Miguel de Cervantes");
			libro1.setIdioma("Español");
			libro1.setDescargas(1000);
			libroRepository.save(libro1);

			Libro libro2 = new Libro();
			libro2.setTitulo("Cien años de soledad");
			libro2.setAutor("Gabriel García Márquez");
			libro2.setIdioma("Español");
			libro2.setDescargas(800);
			libroRepository.save(libro2);

			System.out.println("Libros de prueba agregados exitosamente.");
		}
	}
}