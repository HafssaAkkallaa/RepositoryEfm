
	
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
	@Table(name="Appartement")
	public class Appartement {
		
		

		@Id
		@GeneratedValue
	    @Column(name="lettre_appartement")
	    private int id;
		
		

	    @Column(name="lettre_appartement")
	    String nb_;


		@OneToMany(mappedBy = "Etage", fetch = FetchType.LAZY)
		List<Appartement> Appartements;
		
		

}
