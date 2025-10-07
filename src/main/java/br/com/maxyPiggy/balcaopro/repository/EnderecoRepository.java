package br.com.maxyPiggy.balcaopro.repository;


import br.com.maxyPiggy.balcaopro.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Long> {
}
