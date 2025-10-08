package br.com.maxyPiggy.balcao_pro.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NM_PRODUTO")
    private String nome;

    @Column(name = "DS_PRODUTO")
    private String descricao;

    @Column(name = "ST_ATIVO")
    private boolean ativo;


}
