package neighbor983.riskoppissue;

import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihood;
import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihoodService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private Logger log = Logger.getLogger(DataLoader.class);

    private RiskLikelihoodService riskLikelihoodService;

    @Autowired
    public void setRisklikelihoodService(RiskLikelihoodService riskLikelihoodService) {
        this.riskLikelihoodService = riskLikelihoodService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        
//        RiskLikelihood riskLikelihood1 = new RiskLikelihood();
//        riskLikelihood1.setLevel(1);
//        riskLikelihood1.setProbabilityOfOccurrence("Not Likely");
//        riskLikelihood1.setLikelihood("> 1% to = 20%");
//
//        riskLikelihoodService.saveRiskLikelihood(riskLikelihood1);
//
//        RiskLikelihood riskLikelihood2 = new RiskLikelihood();
//        riskLikelihood2.setLevel(2);
//        riskLikelihood2.setProbabilityOfOccurrence("Low Likelihood");
//        riskLikelihood2.setLikelihood("> 20% to = 40%");
//
//        riskLikelihoodService.saveRiskLikelihood(riskLikelihood2);
//
//        RiskLikelihood riskLikelihood3 = new RiskLikelihood();
//        riskLikelihood3.setLevel(3);
//        riskLikelihood3.setProbabilityOfOccurrence("Likely");
//        riskLikelihood3.setLikelihood("> 40% to = 60%");
//
//        riskLikelihoodService.saveRiskLikelihood(riskLikelihood3);
//
//        RiskLikelihood riskLikelihood4 = new RiskLikelihood();
//        riskLikelihood4.setLevel(4);
//        riskLikelihood4.setProbabilityOfOccurrence("Highly Likely");
//        riskLikelihood4.setLikelihood("> 60% to = 80%");
//
//        riskLikelihoodService.saveRiskLikelihood(riskLikelihood4);
//
//        RiskLikelihood riskLikelihood5 = new RiskLikelihood();
//        riskLikelihood5.setLevel(5);
//        riskLikelihood5.setProbabilityOfOccurrence("Near Certainty");
//        riskLikelihood5.setLikelihood("> 80% to = 99%");
//
//        riskLikelihoodService.saveRiskLikelihood(riskLikelihood5);

        //log.info("riskLikelihood 1: " + riskLikelihoodService.findByLevel(1).get(0));
    }

}
