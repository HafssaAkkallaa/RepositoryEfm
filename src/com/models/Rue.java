package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rue")
public class Rue {
	
	

	@Id
	@GeneratedValue
    @Column(name="code_rue")
    private int id;
	
	

    @Column(name="nom_rue")
    String NOM_ENTREPRISE;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "code_rue")
	Rue ruee;


}
