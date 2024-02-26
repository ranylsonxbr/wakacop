package academy.wakanda.wakacop.pauta.sessaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessao/abertura")
public interface SesssaoVotacaoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    SessaoAberturaResponse abreSessao(@RequestBody SessaoAberturaRequest sessaoAberturaRequest);

}
