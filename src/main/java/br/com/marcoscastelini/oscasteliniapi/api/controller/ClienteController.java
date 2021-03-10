package br.com.marcoscastelini.oscasteliniapi.api.controller;

import br.com.marcoscastelini.oscasteliniapi.domain.model.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return List.of(Cliente.builder()
                        .id(1L)
                        .nome("Marcos")
                        .email("marcos@email.com")
                        .telefone("(17) 99999-9999")
                        .build(),
                Cliente.builder()
                        .id(2L)
                        .nome("Paulo")
                        .email("paulo@email.com")
                        .telefone("(17) 99999-9999")
                        .build()
        );
    }
}
