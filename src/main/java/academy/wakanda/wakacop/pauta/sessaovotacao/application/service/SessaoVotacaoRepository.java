package academy.wakanda.wakacop.pauta.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.sessaovotacao.domain.SessaoVotacao;

import java.util.UUID;

public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);

    SessaoVotacao buscaPorId(UUID idSessao);
}
