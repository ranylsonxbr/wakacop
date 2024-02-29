package academy.wakanda.wakacop.pauta.sessaovotacao.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VotoRequest {
    private String cpfAssociado;
    private OpcaoVoto opcao;
}
