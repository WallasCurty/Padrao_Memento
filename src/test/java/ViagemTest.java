import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ViagemTest {
    @Test
    void deveArmazenarEstados() {
        Viagem viagem = new Viagem();
        viagem.setEstado(ViagemProgramacao.getInstance());
        viagem.setEstado(ViagemInicio.getInstance());
        assertEquals(2, viagem.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Viagem viagem = new Viagem();
        viagem.setEstado(ViagemProgramacao.getInstance());
        viagem.setEstado(ViagemInicio.getInstance());
        viagem.restauraEstado(0);
        assertEquals(ViagemProgramacao.getInstance(), viagem.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Viagem viagem = new Viagem();
        viagem.setEstado(ViagemProgramacao.getInstance());
        viagem.setEstado(ViagemInicio.getInstance());
        viagem.setEstado(ViagemEmRota.getInstance());
        viagem.setEstado(ViagemChegadaDEstino.getInstance());
        viagem.restauraEstado(2);
        assertEquals(ViagemEmRota.getInstance(), viagem.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Viagem viagem = new Viagem();
            viagem.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
