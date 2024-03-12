package academy.wakanda.wakacop.sessaovotacao.domain;

import javax.persistence.*;
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
public class VotoPauta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sessao_votaca_id")
    private SessaoVotacao sessaoVotacao;
    private String cpfAssociado;
    private OpcaoVoto opcaoVoto;
    private LocalDateTime momentoVoto;

    public VotoPauta(SessaoVotacao sessaoVotacao,VotoRequest votoRequest) {
        this.sessaoVotacao = sessaoVotacao;
        this.cpfAssociado = votoRequest.getCpfAssociado();
        this.opcaoVoto = votoRequest.getOpcao();
        this.momentoVoto = LocalDateTime.now();
    }

    public UUID getIdSessao() {
        return sessaoVotacao.getId();
    }

    public Boolean opcaoIgual(OpcaoVoto opcao){
        return this.opcaoVoto.equals(opcao);
    }
}
