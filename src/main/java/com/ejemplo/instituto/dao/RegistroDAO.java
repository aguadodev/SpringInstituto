package com.ejemplo.instituto.dao;

import java.util.List;

import com.ejemplo.instituto.dto.RegistroConAlumnoDTO;
import com.ejemplo.instituto.dto.RegistroDTO;



public interface RegistroDAO {
    public List<RegistroConAlumnoDTO> listarConAlumno();
    public boolean insertar(RegistroDTO registro);
    public List<RegistroDTO> listarRegistros();
}
