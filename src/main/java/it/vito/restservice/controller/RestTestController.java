package it.vito.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestTestController {

    private class Response {

        private String nome;
        private String cognome;

        public Response(String nome, String cognome) {
            this.nome = nome;
            this.cognome = cognome;
        }

        public String getNome() {
            return nome;
        }

        public Response setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public String getCognome() {
            return cognome;
        }

        public Response setCognome(String cognome) {
            this.cognome = cognome;
            return this;
        }
    }


    @GetMapping("/test")
    public Object testEndPoint() {
        return new Response("Vito", "Manuguerra");
    }
}
