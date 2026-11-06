package com.ejemplo.instituto.dao;

import java.util.List;

import com.ejemplo.instituto.dto.AlumnoDTO;


/**
 * @author Ignacio MR
 * AlumnoDAO
 */
public interface AlumnoDAO {
    public List<AlumnoDTO> listarTodos();
    public int insertar(AlumnoDTO alumno);
    public boolean eliminar(int id);
    public AlumnoDTO buscarPorId(int id);
    public boolean actualizar(AlumnoDTO alumno);

    // Otros métodos
    public AlumnoDTO sortearAlumno();
    public AlumnoDTO sortearSinRegistros();
    public void listarAlumnoConRegistrosYMedia();

}
