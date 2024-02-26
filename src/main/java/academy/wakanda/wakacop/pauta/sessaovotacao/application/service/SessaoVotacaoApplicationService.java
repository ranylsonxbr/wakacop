package academy.wakanda.wakacop.pauta.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.application.infra.PautaInfraRepository;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.pauta.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {

    private final SessaoVotacaoRepository sessaoVotacaoRepository;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoApplicationService - abreSessao");
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest));
        log.info("[finish] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }
}
