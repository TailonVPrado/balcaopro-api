package br.com.maxyPiggy.balcao_pro.repository;

import br.com.maxyPiggy.balcao_pro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}