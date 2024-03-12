package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoService;
import academy.wakanda.wakacop.sessaovotacao.domain.VotoRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@Log4j2
public class SesssaoVotacaoController implements SesssaoVotacaoAPI {

    private final SessaoVotacaoService sessaoVotacaoService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
       log.debug("[start] SesssaoVotacaoController - abreSessao");
       SessaoAberturaResponse sessaoAberturaResponse = sessaoVotacaoService.abreSessao(sessaoAberturaRequest);
       log.debug("[finish] SesssaoVotacaoController - abreSessao");
       return sessaoAberturaResponse;
    }

    @Override
    public VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto) {
        log.debug("[start] SesssaoVotacaoController - recebeVoto");
        log.debug("[idSessao] {} ",idSessao);
        VotoResponse votoResponse = sessaoVotacaoService.recebeVoto(idSessao,novoVoto);
        log.debug("[finish] SesssaoVotacaoController - recebeVoto");
        return votoResponse;
    }

    @Override
    public ResultadoSessaoResponse obtemResultado(UUID idSessao) {
        log.debug("[start] SesssaoVotacaoController - obtemResultado");
        ResultadoSessaoResponse resultado = sessaoVotacaoService.obtemResultado(idSessao);
        log.debug("[finish] SesssaoVotacaoController - obtemResultado");
        return resultado;
    }


}
