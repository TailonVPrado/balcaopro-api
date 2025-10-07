package br.com.maxyPiggy.balcaopro.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Long id;

    @Column(name = "NM_CATEGORIA")
    private String nome;

    @Column(name = "DS_CATEGORIA")
    private String descridcao;

    @Column(name = "DS_COR")
    private String cor;

    @Column(name = "ST_ATIVO")
    private boolean ativo;
}
