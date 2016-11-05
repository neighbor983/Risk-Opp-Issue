
package neighbor983.riskoppissue.Risk.RiskLikelihood;

import java.util.List;

public interface RiskLikelihoodService {

	public List<RiskLikelihood> findAll();
	public void saveRiskLikelihood(RiskLikelihood riskLikelihood);
	public RiskLikelihood findOne(long id);
	public void delete(long id);
	public List<RiskLikelihood> findByLikelihood(String likelihood);
	public List<RiskLikelihood> findByProbabilityOfOccurrence(String probabilityOfOccurrence);
	public List<RiskLikelihood> findByLevel(int level);

}
