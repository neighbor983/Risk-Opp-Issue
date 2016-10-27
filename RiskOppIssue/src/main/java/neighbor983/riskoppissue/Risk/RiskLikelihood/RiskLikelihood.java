package neighbor983.riskoppissue.Risk.RiskLikelihood;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "risk_likelihood")
public class RiskLikelihood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "risk_likelihood_id")
    private int id;
    
    @Column(name="risk_likelihood")
    private String likelihood;
    
    @Column(name="probability_of_occurrence")
    private String probabilityOfOccurrence;
    
    
    @Column(name="level")
    private int level;

    public RiskLikelihood(String Likelihood, String ProbabilityOfOccurrence){//, int Level) {
        this.likelihood = Likelihood;
        this.probabilityOfOccurrence = ProbabilityOfOccurrence;
        //this.level = Level;
    }

}
