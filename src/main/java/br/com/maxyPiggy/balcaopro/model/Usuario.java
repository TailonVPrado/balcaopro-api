package br.com.maxyPiggy.balcaopro.model;


import br.com.maxyPiggy.balcaopro.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NM_CLIENTE")
    private String nome;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "NR_TELEFONE")
    private String telefone;

    @Column(name = "DS_SENHA")
    private String senha;

    @Column(name = "CD_CPF")
    private String cpf;

    @Column(name = "ST_ATIVO")
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_USUARIRO", length = 20)
    private TipoUsuario tipoUsuario;
}
