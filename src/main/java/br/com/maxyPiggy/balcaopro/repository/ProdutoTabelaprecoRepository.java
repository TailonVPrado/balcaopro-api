package br.com.maxyPiggy.balcaopro.repository;

import br.com.maxyPiggy.balcaopro.model.ProdutoTabelapreco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoTabelaprecoRepository extends JpaRepository<ProdutoTabelapreco, Long> {
}