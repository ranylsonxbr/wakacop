package academy.wakanda.wakacop.pauta.sessaovotacao.domain;

import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SessaoVotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    private UUID idPauta;
    private Integer tempoDuracao;
    private LocalDateTime dataAbertura;

    public SessaoVotacao(SessaoAberturaRequest sessaoAberturaRequest) {
        this.idPauta = sessaoAberturaRequest.getIdPauta();
        this.tempoDuracao = sessaoAberturaRequest.getTempoDuracao().orElse(1);
        this.dataAbertura = LocalDateTime.now();
    }
}
