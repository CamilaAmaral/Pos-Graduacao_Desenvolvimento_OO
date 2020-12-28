package br.com.estacio.aplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.estacio.listaAlunos.Aluno;

public class Main {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(120,  "Bento", "Administração"));
		alunos.add(new Aluno(351,  "Josias", "Direito"));
		alunos.add(new Aluno(119,  "Manoel", "Psicologia"));
		alunos.add(new Aluno(268,  "Eduarda", "Economia"));
		alunos.add(new Aluno(295,  "Camila", "TI"));
		
		Collections.sort(alunos);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
