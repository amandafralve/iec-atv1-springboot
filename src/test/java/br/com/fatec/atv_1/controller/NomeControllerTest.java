package br.com.fatec.atv_1.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NomeControllerTest {

    private final NomeController controller = new NomeController();

    @Test
    void retornaMensagemNome(){
        String resultado = controller.retornaNome();
        assertEquals("Amanda Vithória", resultado);
    }

}


