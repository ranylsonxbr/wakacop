package academy.wakanda.wakacop.pauta.sessaovotacao.application.service;

import academy.wakanda.wakacop.pauta.application.infra.PautaInfraRepository;
import academy.wakanda.wakacop.pauta.application.service.PautaService;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.pauta.sessaovotacao.application.api.VotoResponse;
import academy.wakanda.wakacop.pauta.sessaovotacao.domain.SessaoVotacao;
import academy.wakanda.wakacop.pauta.sessaovotacao.domain.VotoPauta;
import academy.wakanda.wakacop.pauta.sessaovotacao.domain.VotoRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {

    private final SessaoVotacaoRepository sessaoVotacaoRepository;
    private final PautaService pautaService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoApplicationService - abreSessao");
        Pauta pauta = pautaService.getPautaPorId(sessaoAberturaRequest.getIdPauta());
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest, pauta));
        log.info("[finish] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.info("[start] SessaoVotacaoApplicationService - recebeVoto");
        SessaoVotacao sessao = sessaoVotacaoRepository.buscaPorId(idSessao);
        VotoPauta voto = sessao.recebeVoto(novoVoto);
        sessaoVotacaoRepository.salva(sessao);
        log.info("[finish] SessaoVotacaoApplicationService - recebeVoto");
        return new VotoResponse(voto);
    }
}
