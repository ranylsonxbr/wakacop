package academy.wakanda.wakacop.pauta.sessaovotacao.application.api;

import academy.wakanda.wakacop.pauta.sessaovotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Log4j2
public class SesssaoVotacaoController implements SesssaoVotacaoAPI {

    private final SessaoVotacaoService sessaoVotacaoService;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
       log.info("[start] SesssaoVotacaoController - abreSessao");
       SessaoAberturaResponse sessaoAberturaResponse = sessaoVotacaoService.abreSessao(sessaoAberturaRequest);
       log.info("[finish] SesssaoVotacaoController - abreSessao");
       return sessaoAberturaResponse;
    }
}
