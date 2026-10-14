package com.unadm.dpo3.alcaldias.model;

import java.io.IOException;
import java.util.List;

/**
 * Contrato del patrón DAO (Data Access Object) para guardar y leer alcaldías.
 *
 * @author Alejandro Jassan Rea Rivera
 */
// Patron DAO: contrato que cumple AlcaldiaDAOArchivo mediante "implements".
public interface AlcaldiaDAO {

    /**
     * Guarda una alcaldía.
     *
     * @param alcaldia alcaldía a registrar.
     * @throws IOException si ocurre un error de entrada/salida.
     */
    void guardar(Alcaldia alcaldia) throws IOException;

    /**
     * Lee todas las alcaldías guardadas.
     *
     * @return lista de alcaldías (vacía si todavía no hay registros).
     * @throws IOException si ocurre un error de lectura.
     */
    List<Alcaldia> listar() throws IOException;

    /**
     * Ruta del archivo donde se guardan los datos.
     *
     * @return ruta del archivo de texto.
     */
    String rutaArchivo();
}
