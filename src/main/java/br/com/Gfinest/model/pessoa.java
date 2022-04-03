package br.com.Gfinest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pessoa implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String nome;
private String Sobrenome;
private int idade;
private String Cidade;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return Sobrenome;
}
public void setSobrenome(String sobrenome) {
	Sobrenome = sobrenome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getCidade() {
	return Cidade;
}
public void setCidade(String cidade) {
	Cidade = cidade;
}

}




