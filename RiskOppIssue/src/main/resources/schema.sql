CREATE TABLE risklikelihood
(
    id int(11) NOT NULL AUTO_INCREMENT,
    risklikelihood varchar(100) NOT NULL,
    probabilityofoccurrence varchar(100) NOT NULL,
    level int(11) DEFAULT NULL,
    PRIMARY KEY (id)
);
