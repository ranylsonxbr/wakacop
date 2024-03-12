package academy.wakanda.wakacop.pauta.infra;

import academy.wakanda.wakacop.pauta.application.repository.PautaRepository;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {

    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.debug("[start] PautaInfraRepository - salva");
        pautaSpringDataJPARepository.save(pauta);
        log.debug("[finish] PautaInfraRepository - salva");
        return pauta;
    }

    @Override
    public Pauta buscaPautaPorID(UUID idPauta) {
        log.debug("[start] PautaInfraRepository - buscaPautaPorID");
        Pauta pautaPorId = pautaSpringDataJPARepository.findById(idPauta)
                        .orElseThrow(()-> new RuntimeException("Pauta não encontrada"));
        log.debug("[finish] PautaInfraRepository - buscaPautaPorID");
        return pautaPorId;
    }
}
