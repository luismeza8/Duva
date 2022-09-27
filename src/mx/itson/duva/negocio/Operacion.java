package mx.itson.duva.negocio;

/**
 * Contiene metodos para realizar operaciones diversas.
 * @author Luis Mz
 */

public class Operacion {
    /**
     * Convierte un valor expresado en grados farenheit a grados centigrados
     * @param gradosFarenheit grados farenheit que serán convertidos
     * @return  Equivalencia en grados centigrados
     */
    
    public double convertirCentigrados(double gradosFarenheit) {
        double grados = (gradosFarenheit - 32) * 0.5556;
        
        return grados;
    }
}
