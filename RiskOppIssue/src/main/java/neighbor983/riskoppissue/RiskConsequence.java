package neighbor983.riskoppissue;

public class RiskConsequence {

    private RiskConsequenceType type;
    private String description;
    private int level; // 1-5

    public RiskConsequence(RiskConsequenceType type, String description, int level) {
        this.type = type;
        this.description = description;
        this.level = level;
    }
    
    

}
