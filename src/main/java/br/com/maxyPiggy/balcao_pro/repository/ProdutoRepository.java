package br.com.maxyPiggy.balcao_pro.repository;

import br.com.maxyPiggy.balcao_pro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}