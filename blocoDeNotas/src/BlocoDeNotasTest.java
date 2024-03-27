import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlocoDeNotasTest {

    private BlocoDeNotas blocoDeNotas;

    @Before
    public void setUp() {
        blocoDeNotas = new BlocoDeNotas();
    }

    @org.junit.jupiter.api.Test
    public void adicionarAnotacao_ValidText_AddsAnotacao() {
        blocoDeNotas.adicionarAnotacao("Teste de anotação");
        assertEquals(1, blocoDeNotas.listaAnotacaoBlocoDeNotas().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void adicionarAnotacao_NullText_ThrowsIllegalArgumentException() {
        blocoDeNotas.adicionarAnotacao(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void adicionarAnotacao_EmptyText_ThrowsIllegalArgumentException() {
        blocoDeNotas.adicionarAnotacao("");
    }

    @Test
    public void editarAnotacao_ExistingAnotacao_EditsAnotacao() {
        blocoDeNotas.adicionarAnotacao("Teste de edição");
        blocoDeNotas.editarAnotacao(1, "Edição concluída");
        assertEquals("Edição concluída", blocoDeNotas.listaAnotacaoBlocoDeNotas().get(0).getTexto());
    }

    @Test
    public void editarAnotacao_NonExistingAnotacao_DoesNotEditAnotacao() {
        blocoDeNotas.adicionarAnotacao("Teste de edição");
        blocoDeNotas.editarAnotacao(2, "Edição concluída");
        assertEquals("Teste de edição", blocoDeNotas.listaAnotacaoBlocoDeNotas().get(0).getTexto());
    }

    @Test
    public void deletarAnotacao_ExistingAnotacao_DeletesAnotacao() {
        blocoDeNotas.adicionarAnotacao("Teste de exclusão");
        blocoDeNotas.deletarAnotacao(1);
        assertTrue(blocoDeNotas.listaAnotacaoBlocoDeNotas().isEmpty());
    }

    @Test
    public void deletarAnotacao_NonExistingAnotacao_DoesNotDeleteAnotacao() {
        blocoDeNotas.adicionarAnotacao("Teste de exclusão");
        blocoDeNotas.deletarAnotacao(2);
        assertEquals(1, blocoDeNotas.listaAnotacaoBlocoDeNotas().size());
    }

    @Test
    public void buscarAnotacao_MatchingText_ReturnsMatchingAnotacoes() {
        blocoDeNotas.adicionarAnotacao("Anotacao 1");
        blocoDeNotas.adicionarAnotacao("Anotacao 2");
        blocoDeNotas.adicionarAnotacao("Outra anotacao");

        assertEquals(2, blocoDeNotas.buscarAnotacao("Anotacao").size());
    }

    @Test
    public void buscarAnotacao_NoMatchingText_ReturnsEmptyList() {
        blocoDeNotas.adicionarAnotacao("Anotacao 1");
        blocoDeNotas.adicionarAnotacao("Anotacao 2");
        blocoDeNotas.adicionarAnotacao("Outra anotacao");

        assertTrue(blocoDeNotas.buscarAnotacao("Inexistente").isEmpty());
    }
}