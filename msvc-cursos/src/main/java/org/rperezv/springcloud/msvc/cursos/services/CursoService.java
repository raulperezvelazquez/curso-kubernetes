package org.rperezv.springcloud.msvc.cursos.services;

import org.rperezv.springcloud.msvc.cursos.models.Usuario;
import org.rperezv.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConListaUsuarios(Long id);
    Curso guardar(Curso curso);
    void elminar(Long id);

    void eliminarCursoUsuarioPorId(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> desasignarUsuario(Usuario usuario, Long cursoId);
}
