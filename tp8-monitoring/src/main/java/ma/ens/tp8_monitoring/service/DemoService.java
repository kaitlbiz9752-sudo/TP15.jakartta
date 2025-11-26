package ma.ens.tp8_monitoring.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    private final Counter customRequestsCounter;

    public DemoService(MeterRegistry meterRegistry) {
        // Déclaration d'un compteur personnalisé
        this.customRequestsCounter = Counter.builder("custom.requests.count")
                .description("Nombre de traitements effectués par le service DemoService")
                .register(meterRegistry);
    }

    public String processData() {
        // Incrémenter la métrique personnalisée
        customRequestsCounter.increment();
        logger.info("Requête enregistrée dans Prometheus via la métrique custom.requests.count");

        logger.info("Démarrage du traitement des données");

        try {
            // Simulation d’un traitement
            Thread.sleep(500);
        } catch (InterruptedException e) {
            logger.error("Erreur dans le traitement", e);
            Thread.currentThread().interrupt();
            return "Erreur lors du traitement";
        }

        logger.info("Traitement terminé avec succès");
        return "Traitement effectué";
    }
}
