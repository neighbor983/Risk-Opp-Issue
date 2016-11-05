package neighbor983.riskoppissue.Risk.RiskLikelihood;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/risklikelihood")
public class RiskLikelihoodController {

    @Autowired
    private RiskLikelihoodService RiskLikelihoodService;

    @RequestMapping(value = "/add/{id}/{likelihood}/{probabilityofconsequence}/{level}")
    public RiskLikelihood addRiskLikelihood(@PathVariable Long id,
            @PathVariable String likelikelihood,
            @PathVariable String probabilityOfOccurrence,
            @PathVariable int level) {

        RiskLikelihood riskLikelihood = new RiskLikelihood();

        riskLikelihood.setId(id);
        riskLikelihood.setLikelihood(likelikelihood);
        riskLikelihood.setProbabilityOfOccurrence(probabilityOfOccurrence);
        riskLikelihood.setLevel(level);

        RiskLikelihoodService.saveRiskLikelihood(riskLikelihood);

        return riskLikelihood;
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteRiskLikelihood(@PathVariable Long id) {

        RiskLikelihood riskLikelihood = new RiskLikelihood();
        riskLikelihood.setId(id);

        RiskLikelihoodService.delete(id);
    }

    @RequestMapping(value = "/")
    public List<RiskLikelihood> getRiskLikelihood() {
        return RiskLikelihoodService.findAll();
    }

    @RequestMapping(value = "/{id}")
    public RiskLikelihood getRiskLikelihood(@PathVariable Long id) {

        RiskLikelihood riskLikelihood = RiskLikelihoodService.findOne(id);
        return riskLikelihood;

    }

    @RequestMapping(value = "/search/level/{level}")
    public List<RiskLikelihood> getRiskLikelihoodByLevel(@PathVariable int level) {

        List<RiskLikelihood> riskLikelihoods = RiskLikelihoodService.findByLevel(level);
        return riskLikelihoods;

    }

    @RequestMapping(value = "/search/likelihood/{likelihood}")
    public List<RiskLikelihood> getRiskLikelihoodByLikelihood(@PathVariable String likelihood) {

        List<RiskLikelihood> riskLikelihoods = RiskLikelihoodService.findByLikelihood(likelihood);
        return riskLikelihoods;

    }

}
