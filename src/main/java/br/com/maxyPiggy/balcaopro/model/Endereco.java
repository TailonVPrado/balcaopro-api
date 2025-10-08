package br.com.maxyPiggy.balcaopro.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "CD_CEP")
    private String cep;

    @Column(name = "NR_ENDERECO")
    private String numero;

    @Column(name = "NM_LOGRADOURO")
    private String logradouro;

    @Column(name = "NM_BAIRRO")
    private String bairro;

    @Column(name = "NM_CIDADE")
    private String cidade;

    @Column(name = "ST_ATIVO")
    private boolean ativo;

    @Column(name = "DS_COMPLEMENTO")
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
}
