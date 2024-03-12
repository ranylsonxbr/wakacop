package academy.wakanda.wakacop.sessaovotacao.infra;

import academy.wakanda.wakacop.sessaovotacao.application.service.SessaoVotacaoRepository;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {


    private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao) {
        log.debug("[start] SessaoVotacaoInfraRepository - salva");
        sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.debug("[finish] SessaoVotacaoInfraRepository - salva");
        return sessaoVotacao;
    }

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.debug("[start] SessaoVotacaoInfraRepository - buscaPorId");
        SessaoVotacao sessao = sessaoVotacaoSpringDataJPARepository.findById(idSessao)
                .orElseThrow(() -> new RuntimeException("Sessão não encontrada"));
        log.debug("[finish] SessaoVotacaoInfraRepository - buscaPorId");
        return sessao;
    }
}
