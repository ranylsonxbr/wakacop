package academy.wakanda.wakacop.pauta.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
