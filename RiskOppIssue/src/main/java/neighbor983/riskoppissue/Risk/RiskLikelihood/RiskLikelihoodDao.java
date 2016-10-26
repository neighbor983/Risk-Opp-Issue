package neighbor983.riskoppissue.Risk.RiskLikelihood;

import java.util.List;

public interface RiskLikelihoodDao {
    
    public List<RiskLikelihood> getAllRiskLikelihood();
    
    public RiskLikelihood getRiskLikelihoodByLevel(int Level);
    
}
