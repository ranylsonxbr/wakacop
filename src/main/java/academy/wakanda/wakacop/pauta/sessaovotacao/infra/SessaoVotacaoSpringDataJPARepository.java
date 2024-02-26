package academy.wakanda.wakacop.pauta.sessaovotacao.infra;

import academy.wakanda.wakacop.pauta.sessaovotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepository extends JpaRepository<SessaoVotacao, UUID> {
}
