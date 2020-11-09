package servletsExerc;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
private String nome;
private List<Msg> listMsg;

public Usuario(String nome) {
	this.nome = nome;
}

public Usuario(String nome, ArrayList listMsg) {
	this.nome = nome;
	this.listMsg = listMsg;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

}
