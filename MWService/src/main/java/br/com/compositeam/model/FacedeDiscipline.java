package br.com.compositeam.model;

import java.util.List;

import br.com.compositeam.businessmodel.dao.DisciplineDAO;
import br.com.compositeam.businessmodel.dao.DisciplineDAOImpl;
import br.com.compositeam.businessmodel.model.Discipline;


public class FacedeDiscipline {

	private Discipline discipline;
	
	public FacedeDiscipline(String code, String name){
		this.discipline = new Discipline(code, name);
	}
	
	public String getCode(){
		return discipline.getCod();
	}
	
	public String getName(){
		return discipline.getName();
	}
	
	public List<Discipline> getAll(){
		DisciplineDAOImpl dao = new DisciplineDAOImpl();
        DisciplineDAO d = dao.get();
        return d.list();
	}
	
}
