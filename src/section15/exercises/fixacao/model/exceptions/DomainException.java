package section15.exercises.fixacao.model.exceptions;

import java.io.Serial;

public class DomainException extends Exception {
    @Serial
    public static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
