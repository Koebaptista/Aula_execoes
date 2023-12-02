package exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import entities.Comentario;
import entities.Post;

public class Exercicio_Post {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String title = "Traveling to New Zealand";
		int likes = 12;
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44",fmt1);
		String content = "I'm going to visit this wonderful country!";
		
		Comentario c1 = new Comentario("Have a nice trip");
		Comentario c2 = new Comentario("Wow that's awesome!");
		
		Post p1 = new Post(moment, title, content, likes);
		
		p1.AddComent(c1);
		p1.AddComent(c2);

		System.out.println(p1);
		
		System.out.println();
		
		Comentario c3 = new Comentario("Good night");
		Comentario c4 = new Comentario("May the Force be with you");
		
		Post p2 = new Post(moment.parse("28/07/2018 23:14:19", fmt1), "Good night guys", "See you tomorrow", 12);
		
		p2.AddComent(c3);
		p2.AddComent(c4);
		
		System.out.println(p2);
		
		
	}

}
