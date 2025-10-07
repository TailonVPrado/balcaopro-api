package br.com.maxyPiggy.balcaopro.model;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "TABELAPRECO")
public class Tabelapreco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TABELAPRECO")
    private Long id;

    @Column(name = "DT_INICIO")
    private Date dataInicio;

    @Column(name = "DT_FOM")
    private Date dataFim;

    @Column(name = "NM_TABELA")
    private String nome;

    @Column(name = "DS_TABELA")
    private String descricao;

    @Column(name = "ST_ATIVO")
    private boolean ativo;
}
