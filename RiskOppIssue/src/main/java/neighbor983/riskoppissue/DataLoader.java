
package neighbor983.riskoppissue;

import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihood;
import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihoodService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

    private Logger log = Logger.getLogger(DataLoader.class);
    
    private RiskLikelihoodService riskLikelihoodService;
    
    @Autowired
    public void setRisklikelihoodService(RiskLikelihoodService riskLikelihoodService){
        this.riskLikelihoodService = riskLikelihoodService;
    }
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        RiskLikelihood riskLikelihood1 = new RiskLikelihood();
        
        riskLikelihood1.setLevel(1);
        riskLikelihood1.setLikelihood("Blah");
        riskLikelihood1.setProbabilityOfOccurrence("Blah Blah");
        
        riskLikelihoodService.saveRiskLikelihood(riskLikelihood1);
        
        //log.info("riskLikelihood 1: " + riskLikelihoodService.findByLevel(1).get(0));
        
    }
    
    
    
    
}
