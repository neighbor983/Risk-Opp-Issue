CREATE TABLE risk_likelihood
(
    id int(11) NOT NULL AUTO_INCREMENT,
    risk_likelihood varchar(100) NOT NULL,
    probability_of_occurrence varchar(100) NOT NULL,
    level int(11) DEFAULT NULL,
    PRIMARY KEY (id)
);
