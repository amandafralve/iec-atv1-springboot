package br.com.fatec.atv_1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NomeController.class)
public class NomeControllerIT {

    @Autowired
    private MockMvc mockMvc; // Objeto para simular requisições HTTP

    @Test
    void deveRetornarMensagemNomeQuandoGetNomeEndpoint() throws Exception {

        mockMvc.perform(get("/nome"))
               // Verificamos se o status da resposta é 200 OK
               .andExpect(status().isOk())
               // Verificamos se o conteúdo da resposta é "Olá Fatec"
               .andExpect(content().string("Amanda Vithória"));
    }
}   
