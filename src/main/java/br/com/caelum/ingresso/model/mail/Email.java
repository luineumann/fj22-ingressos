package br.com.caelum.ingresso.model.mail;

public interface Email {
	String getTo();

	String getBody();

	String getSubject();
}