package med.voll.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String autor, String mensaje, String curso, LocalDateTime fechaCreacion) {
}

