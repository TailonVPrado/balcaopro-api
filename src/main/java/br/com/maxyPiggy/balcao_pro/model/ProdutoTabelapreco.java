package br.com.maxyPiggy.balcao_pro.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PRODUTO_TABELAPRECO")
public class ProdutoTabelapreco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO_TABELAPRECO")
    private Long id;


    @Column(name = "VL_CUSTO")
    private BigDecimal  valorCusto;


    @Column(name = "VL_MINIMO")
    private BigDecimal valorMinimo;


    @Column(name = "VL_MAXIMO")
    private BigDecimal valorMaximo;


    @Column(name = "ST_ATIVO")
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "ID_TABELAPRECO")
    private Tabelapreco tabelaPreco;
}
