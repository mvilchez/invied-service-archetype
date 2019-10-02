package ${package}.domain;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * Clase Response para errores FORBIDDEN
 * <p>
 * Tiene que ser serializable
 * <p>
 *
 * @author ${author}
 * @see domain.DefaultErrorResponse
 */
public class ForbiddenResponse extends DefaultErrorResponse implements Serializable {
    /**
     * Serial number. Es recomendable usar números aleatorios para que ambos lados del sistema (el que envía y el que
     * recibe la clase serializada) sean capaces de detectar que son dos objetos distintos de forma más rápida.
     */
    private static final long serialVersionUID = -7487650108762914331L;

    /**
     * Default constructor
     */
    public ForbiddenResponse() {
        this.setErrorMessage("Forbidden");
        this.setStatus(HttpStatus.FORBIDDEN.value());
    }
}
