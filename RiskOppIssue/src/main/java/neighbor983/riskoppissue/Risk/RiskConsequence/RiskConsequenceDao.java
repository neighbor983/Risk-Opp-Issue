package neighbor983.riskoppissue.Risk.RiskConsequence;

import java.util.List;

public interface RiskConsequenceDao {
    
    public List<RiskConsequence> getAllRiskConsequence();
    
    public RiskConsequence getByLevel(int Level);
    
}
