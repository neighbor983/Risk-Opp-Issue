package neighbor983.riskoppissue.Risk;

import java.util.List;
import neighbor983.riskoppissue.Risk.RiskConsequence.RiskConsequence;
import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihood;

public interface RiskDao {
    
    public Risk getRiskById(int Id);
    
    public List<Risk> getRiskByRiskLevel(RiskLevel riskLevel);
    
    public List<Risk> getRiskByLikelihood(RiskLikelihood likelihood);
    
    public List<Risk> getRiskByConsequence(RiskConsequence consequence);
    
    public void createRisk(Risk risk);
    
    public void deleteRiskById(int Id);
    
    public void updateRiskById(int Id, Risk updatedRisk);
    
}
