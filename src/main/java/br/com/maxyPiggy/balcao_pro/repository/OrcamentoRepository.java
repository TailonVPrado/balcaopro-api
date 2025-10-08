package br.com.maxyPiggy.balcao_pro.repository;

import br.com.maxyPiggy.balcao_pro.model.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}