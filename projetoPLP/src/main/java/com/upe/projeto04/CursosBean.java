package com.upe.projeto04;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class CursosBean {

	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso; 
	}

	public String carregarCurso() {
		if (curso.equalsIgnoreCase("computação upe") 
				|| curso.equalsIgnoreCase("computaçao upe")
				|| curso.equalsIgnoreCase("computacao upe")) {
			return "ComputacaoUPE";
		} else if (curso.equalsIgnoreCase("engenharia de software upe")
				|| curso.equalsIgnoreCase("engenharia software upe")) {
			return "EngenhariaSoftwareUPE";
		} else if (curso.equalsIgnoreCase("matemática upe") 
				|| curso.equalsIgnoreCase("matematica upe")) {
			return "MatematicaUPE";
		} else {
			return "CursoInexistente";
		}
	}

}
