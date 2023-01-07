
	
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
	@Table(name="Rue")
	public class Etage {
		
		

		@Id
		@GeneratedValue
	    @Column(name="num_etage")
	    private int id;
		
		

	    @Column(name="nb_appartements_tot")
	    String NOM_ENTREPRISE;

		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "lettre_appartement")
		Appartement Appartementt;
	    
		
		@OneToMany(mappedBy = "Etage", fetch = FetchType.LAZY)
		List<Immeuble> Immeubles;
		
		
		
		


}
