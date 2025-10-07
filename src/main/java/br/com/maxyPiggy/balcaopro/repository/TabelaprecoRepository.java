package br.com.maxyPiggy.balcaopro.repository;

import br.com.maxyPiggy.balcaopro.model.Tabelapreco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabelaprecoRepository extends JpaRepository<Tabelapreco, Long> {
}