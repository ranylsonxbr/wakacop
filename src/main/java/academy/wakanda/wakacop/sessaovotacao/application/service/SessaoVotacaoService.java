package academy.wakanda.wakacop.sessaovotacao.application.service;

import academy.wakanda.wakacop.sessaovotacao.application.api.ResultadoSessaoResponse;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.sessaovotacao.application.api.VotoResponse;
import academy.wakanda.wakacop.sessaovotacao.domain.VotoRequest;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);

    ResultadoSessaoResponse obtemResultado(UUID idSessao);
}
