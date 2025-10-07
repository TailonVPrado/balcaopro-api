package br.com.maxyPiggy.balcaopro.repository;

import br.com.maxyPiggy.balcaopro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}