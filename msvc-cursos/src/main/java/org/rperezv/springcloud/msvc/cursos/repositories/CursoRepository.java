package org.rperezv.springcloud.msvc.cursos.repositories;

import org.rperezv.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
