package entities;

import entities.RedeSocial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RedeSocialTest {

    private RedeSocial redeSocial;


    @BeforeEach
    void setUp() {
        redeSocial = new RedeSocial();

    }

    @Test
    void adicionarUsuario() {
        redeSocial.adicionarUsuario("Alice");
        assertTrue(redeSocial.lerMural("Alice").isEmpty()); // Assert that Alice's mural is initially empty
        assertThrows(IllegalArgumentException.class, () -> redeSocial.adicionarUsuario("Alice")); // Assert adding the same user throws an exception
    }

    @Test
    void postar() {
        redeSocial.adicionarUsuario("Bob");
        redeSocial.postar("Bob", "Hello World!");
        assertEquals("Hello World!", redeSocial.lerMural("Bob")); // Assert Bob's mural contains the posted message
    }

    @Test
    void seguir() {
        redeSocial.adicionarUsuario("Alice");
        redeSocial.adicionarUsuario("Bob");
        redeSocial.seguir("Alice", "Bob");
    }

    @Test
    void lerMural() {
        redeSocial.adicionarUsuario("Alice");
        redeSocial.adicionarUsuario("Bob");
        redeSocial.postar("Alice", "First post!");
        redeSocial.postar("Bob", "Hello Alice!");
        String aliceMural = redeSocial.lerMural("Alice");
        assertTrue(aliceMural.contains("First post!")); // Assert Alice's mural contains her own post
        assertTrue(aliceMural.contains("Hello Alice!")); // Assert Alice's mural contains Bob's post
    }
}
