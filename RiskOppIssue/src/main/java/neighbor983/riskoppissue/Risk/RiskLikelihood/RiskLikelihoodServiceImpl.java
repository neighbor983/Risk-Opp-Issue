package neighbor983.riskoppissue.Risk.RiskLikelihood;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RiskLikelihoodServiceImpl implements RiskLikelihoodService {

    @Autowired
    private RiskLikelihoodRepository riskLikelihoodRepository;

    public List<RiskLikelihood> findAll() {
        return riskLikelihoodRepository.findAll();
    }

    public List<RiskLikelihood> findByLikelihood(String likelihood) {
        return riskLikelihoodRepository.findByLikelihood(likelihood);
    }

    public List<RiskLikelihood> findByLevel(int level) {
        return riskLikelihoodRepository.findByLevel(level);
    }

    public List<RiskLikelihood> findByProbabilityOfOccurrence(String probabilityOfOccurrence) {
        return riskLikelihoodRepository.findByProbabilityOfOccurrence(probabilityOfOccurrence);
    }

    public void saveRiskLikelihood(RiskLikelihood riskLikelihood) {
        riskLikelihoodRepository.save(riskLikelihood);
    }

    public RiskLikelihood findOne(long id) {
        return riskLikelihoodRepository.findOne(id);
    }

    public void delete(long id) {
        riskLikelihoodRepository.delete(id);
    }

}
