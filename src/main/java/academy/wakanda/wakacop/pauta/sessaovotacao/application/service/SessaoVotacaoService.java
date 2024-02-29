package academy.wakanda.wakacop.pauta.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.VotoResponse;
import academy.wakanda.wakacop.pauta.sessaovotacao.domain.VotoRequest;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);
}
