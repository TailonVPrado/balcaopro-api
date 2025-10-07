package br.com.maxyPiggy.balcaopro.repository;

import br.com.maxyPiggy.balcaopro.model.ProdutoOrcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoOrcamentoRepository extends JpaRepository<ProdutoOrcamento, Long> {
}