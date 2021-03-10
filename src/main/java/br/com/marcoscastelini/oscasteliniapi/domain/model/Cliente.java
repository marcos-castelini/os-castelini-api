package br.com.marcoscastelini.oscasteliniapi.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
