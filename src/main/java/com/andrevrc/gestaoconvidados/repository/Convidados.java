package com.andrevrc.gestaoconvidados.repository;

import com.andrevrc.gestaoconvidados.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
