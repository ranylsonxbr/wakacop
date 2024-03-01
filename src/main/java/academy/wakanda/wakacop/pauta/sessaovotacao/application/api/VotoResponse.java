package academy.wakanda.wakacop.pauta.sessaovotacao.application.api;

import academy.wakanda.wakacop.pauta.sessaovotacao.domain.VotoPauta;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@ToString
public class VotoResponse {

    private UUID id;
    private UUID idSessao;
    private String cpfAssociado;
    private LocalDateTime momentoDoVoto;

    public VotoResponse(VotoPauta voto) {
        this.id = voto.getId();
        this.idSessao = voto.getIdSessao();
        this.cpfAssociado = voto.getCpfAssociado();
        this.momentoDoVoto = voto.getMomentoVoto();
    }


}