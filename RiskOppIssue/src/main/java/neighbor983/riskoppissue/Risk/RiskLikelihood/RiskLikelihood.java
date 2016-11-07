package neighbor983.riskoppissue.Risk.RiskLikelihood;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "risklikelihood")
public class RiskLikelihood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(name="likelihood")
    private String likelihood;
    
    @Column(name="probabilityofoccurrence")
    private String probabilityOfOccurrence;
        
    @Column(name="level")
    private int level;

    public RiskLikelihood(String likelihood, String probabilityOfOccurrence, int level) {
        this.likelihood = likelihood;
        this.probabilityOfOccurrence = probabilityOfOccurrence;
        this.level = level;
    }
    
    public RiskLikelihood(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    public String getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    public void setProbabilityOfOccurrence(String probabilityOfOccurrence) {
        this.probabilityOfOccurrence = probabilityOfOccurrence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "RiskLikelihood{" + "id=" + id + ", likelihood=" + likelihood + ", probabilityOfOccurrence=" + probabilityOfOccurrence + ", level=" + level + '}';
    }
    
    



}
