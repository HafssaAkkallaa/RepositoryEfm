package com.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Immeuble")
public class Immeuble {
	
	

	@Id
	@GeneratedValue
    @Column(name="num_immeuble")
    private int id;
	
	

    @Column(name="nom_rue")
    String nb_etages_total;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "num_immeuble")
	Immeuble immeublee;
    
	
	@OneToMany(mappedBy = "Immeuble", fetch = FetchType.LAZY)
	List<Rue> Rues;

}