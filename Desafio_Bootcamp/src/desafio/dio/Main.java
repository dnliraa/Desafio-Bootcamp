package desafio.dio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Cursojs");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
	    /*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		*/
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		
		Dev devDaniel = new Dev();
		devDaniel.setName("Daniel");
		devDaniel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: "+ devDaniel.getConteudosInscritos());
		devDaniel.progredir();
		System.out.println("----");
		System.out.println("Conteúdos Inscritos: "+ devDaniel.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+ devDaniel.getConteudosConcluidos());
		System.out.println("XP: "+ devDaniel.calcularTotalXp());
		System.out.println("----");
		devDaniel.progredir();
		System.out.println("Conteúdos Inscritos: "+ devDaniel.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+ devDaniel.getConteudosConcluidos());
		System.out.println("XP: "+ devDaniel.calcularTotalXp());
		System.out.println("#################");
		
		Dev devLucas = new Dev();
		devLucas.setName("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: "+ devLucas.getConteudosInscritos());
		devLucas.progredir();
		System.out.println("----");
		System.out.println("Conteúdos Inscritos: "+ devLucas.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+ devLucas.getConteudosConcluidos());
		System.out.println("XP: "+ devLucas.calcularTotalXp());
		
		
		
		
		
	}

}
