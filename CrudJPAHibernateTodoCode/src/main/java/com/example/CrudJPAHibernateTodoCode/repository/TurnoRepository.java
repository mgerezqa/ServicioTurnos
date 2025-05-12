package com.example.CrudJPAHibernateTodoCode.repository;

import com.example.CrudJPAHibernateTodoCode.domain.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

    @Override
    List<Turno> findAll();

    @Override
    <S extends Turno> S save(S entity);

    @Override
    Optional<Turno> findById(Long id);

    void deleteById(Long id);

}
