package com.alura.literalura.service;

import com.alura.literalura.model.Libro;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {

    private static final String BASE_URL = "https://gutendex.com/books/";

    public Libro buscarLibroPorTitulo(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + "?search=" + titulo;
        // Realizar la llamada a la API
        // Aquí vamos a procesar la respuesta y convertirla en un objeto Libro
        // Para simplificar, asumimos que la API devuelve un libro con formato correcto
        return restTemplate.getForObject(url, Libro.class);
    }
}
