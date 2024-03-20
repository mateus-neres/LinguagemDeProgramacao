package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario usuario;
    private List<Usuario> usuarios;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Alice");
        usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(new Usuario("Bob"));
        usuarios.add(new Usuario("Charlie"));
    }

    @Test
    void postar() {
        usuario.postar("Hello, world!");

    }

    @Test
    void seguir() {
        usuario.seguir("Bob");
        usuario.seguir("Charlie");

    }

    @Test
    void lerMuralCompleto() {
        usuario.postar("Post 1");
        Usuario bob = usuarios.get(1);
        bob.postar("Post 2 by Bob");
        Usuario charlie = usuarios.get(2);
        charlie.postar("Post 3 by Charlie");

        usuario.seguir("Bob");
        usuario.seguir("Charlie");

        String muralCompleto = usuario.lerMuralCompleto(usuarios);

        assertTrue(muralCompleto.contains("Post 2 by Bob"));
        assertTrue(muralCompleto.contains("Post 3 by Charlie"));
    }
}