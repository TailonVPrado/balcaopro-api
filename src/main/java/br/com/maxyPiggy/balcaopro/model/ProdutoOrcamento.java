package br.com.maxyPiggy.balcaopro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PRODUTO_TABELAPRECO")
public class ProdutoOrcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO_TABELAPRECO")
    private Long id;

    @Column(name = "QT_PRODUTO")
    private BigDecimal quantidade;

    @Column(name = "VL_DESCONTO")
    private BigDecimal desconto;

    @ManyToOne
    @JoinColumn(name = "ID_ORCAMENTO")
    private Orcamento orcamento;
}
