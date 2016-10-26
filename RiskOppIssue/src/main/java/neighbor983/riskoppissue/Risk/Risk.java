package neighbor983.riskoppissue.Risk;


import java.util.List;
import neighbor983.riskoppissue.Risk.RiskConsequence.RiskConsequence;
import neighbor983.riskoppissue.Risk.RiskLikelihood.RiskLikelihood;
import neighbor983.riskoppissue.RiskType;

public class Risk {
    
    	private int id;
	private RiskLikelihood likelihood;
	private RiskConsequence consequence;
	private String riskLevel;
	private String riskStatement;
	private String pointOfContact;
	private String Status;
	//private Date identificationDate;
	//private Date approvalDate;
	//private Date plannedClosureDate;
	private List<String> mitigationList;
	private RiskType riskType;
	private String title;
	private String program;
	private String wbsNumber;
    
}
