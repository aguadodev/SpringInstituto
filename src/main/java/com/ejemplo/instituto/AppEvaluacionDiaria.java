package com.ejemplo.instituto;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.ejemplo.instituto.dao.AlumnoDAO;
import com.ejemplo.instituto.dao.AlumnoDAOImpl;
import com.ejemplo.instituto.dao.RegistroDAO;
import com.ejemplo.instituto.dao.RegistroDAOImpl;
import com.ejemplo.instituto.dto.AlumnoDTO;
import com.ejemplo.instituto.dto.RegistroDTO;
import com.ejemplo.instituto.util.JbdcUtil;

public class AppEvaluacionDiaria {

    public static void main(String[] args) {
        Connection con = JbdcUtil.getConnection();
        JbdcUtil.executeUpdate("BD/datosPruebas.sql", con);
        AlumnoDAO alumnoDAO = new AlumnoDAOImpl(con);
        RegistroDAO registroDAO = new RegistroDAOImpl(con);

        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("\n----------MENÚ----------");
            System.out.println("1. Listar Alumnado");
            System.out.println("2. Sortear entre todo el alumnado");
            System.out.println("3. Sortear entre alumnado sin registros");
            System.out.println("4. Listar registros");
            System.out.println("5. Insertar registro ejercicio");
            System.out.println("6. Listar alumno/a con sus registros y calificacion media");
            System.out.println("7. Listar alumnado y calificacion media de cada un@");
            System.out.println("0.Salir");
            menu = sc.nextInt();

            switch (menu) {
                case 1 -> {
                    List<AlumnoDTO> alumnos = alumnoDAO.listarTodos();
                    alumnos.forEach(System.out::println);
                }
                case 2 -> {
                    AlumnoDTO alumnoElegido = alumnoDAO.sortearAlumno();
                    System.out.println(alumnoElegido);
                }
                case 3 -> {
                    AlumnoDTO alumnoSinRegistro = alumnoDAO.sortearSinRegistros();
                    System.out.println(alumnoSinRegistro);
                }
                case 4 -> {
                    System.out.println("\n--Listado de Registros--");
                    List<RegistroDTO> registros = registroDAO.listarRegistros();
                    for (RegistroDTO registroDTO : registros) {
                        System.out.println(registroDTO.toString());
                    }

                    // List<RegistroConAlumnoDTO> registroConAlumno = listarConAlumno();
                    // System.out.println(registroConAlumno);
                }
                case 5 -> {
                    // if (insertar(RegistroDTO registro)) {
                    // System.out.println("Registro insertado Correctamente");
                    // } else {
                    // System.out.println("Error al insertar el registro");
                    // }

                }
                case 6 -> {
                    // listarAlumnoConRegistrosYMedia();
                }
                case 7 -> {
                    // listarAlumnadoYCalificacionDeCadaUno();
                }
                case 0 -> {
                    System.out.println("Saliendo del programa");
                }

                default -> System.out.println("Opcion no valida");
            }
        } while (menu != 0);

        sc.close();
    }
}
