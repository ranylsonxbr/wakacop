package academy.wakanda.wakacop.sessaovotacao.application.api;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;
import java.util.UUID;


@ToString
public class SessaoAberturaRequest {
    @Getter
    @NotNull
    private UUID idPauta;
    private Integer tempoDuracao;

    public Optional<Integer> getTempoDuracao() {
        return Optional.ofNullable(this.tempoDuracao);
    }
}
