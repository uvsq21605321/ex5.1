package uvsq.m1.gl;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Team{

	
	private final String nom;
	private List<Team> list;
	
	
	public Groupe(String nom) {
		list = new ArrayList<Team>(); 
		this.nom = nom;	
	}
	
	

	
	public String getNom() {
		return this.nom;
	}


	public void ajoutMembre(Personnel p) {

		list.add(p);

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	


}
