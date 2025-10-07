package br.com.maxyPiggy.balcaopro.repository;

import br.com.maxyPiggy.balcaopro.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}