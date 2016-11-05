
package neighbor983.riskoppissue.Risk.RiskLikelihood;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskLikelihoodRepository extends JpaRepository<RiskLikelihood, Long>{
	
	List<RiskLikelihood> findByLevel(int level);
	List<RiskLikelihood> findByLikelihood(String likelihood);
	List<RiskLikelihood> findByProbabilityOfOccurrence(String probabilityOfOccurrence);

}
