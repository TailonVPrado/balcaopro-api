package br.com.maxyPiggy.balcaopro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "ORCAMENTO")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORCAMENTO")
    private Long id;

    @Column(name = "ST_ATIVO")
    private boolean ativo;

    @Column(name = "CD_FORMAPAGAMENTO")
    private String formaPagamento;


    @Column(name = "DT_ORCAMENTO")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "ID_VENDEDOR")
    private Usuario vendedor;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Usuario cliente;
}
