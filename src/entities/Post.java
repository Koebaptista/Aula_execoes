package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comentario> lista_coment = new ArrayList<>();
	
	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss"); 
	
	public Post() {
		
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getLista_coment() {
		return lista_coment;
	}
	public void AddComent(Comentario comment) {
		lista_coment.add(comment);
	}
	public void removeComent(Comentario comment) {
		lista_coment.remove(comment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(moment.format(fmt1) +  "\n");
		sb.append(content + "\n");
		sb.append("comentarios: \n");
		
		for (Comentario x : lista_coment) {
			sb.append(x.getTexto() + "\n");
		}
		
		return sb.toString();
		
	}
}

