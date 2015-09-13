package br.com.compositeam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.compositeam.businessmodel.dao.DisciplineDAO;
import br.com.compositeam.businessmodel.dao.DisciplineDAOImpl;
import br.com.compositeam.businessmodel.model.Discipline; 
import br.com.compositeam.model.FacedeDiscipline;


@RestController
public class DisciplineController {

//	@RequestMapping("/discipline")
//    public Discipline greeting(@RequestParam(value="code", defaultValue="10") String code) {
//        return new Discipline(code,
//                            "Cu");
//    }
	
	@RequestMapping("/disciplines")
    public List<Discipline> disciplines(@RequestParam(value="size", defaultValue="10") int size) {
        FacedeDiscipline f = new FacedeDiscipline("", "");
        return f.getAll();
    }
	
}
