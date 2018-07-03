package model;

import java.util.List;

public class Conseiller extends Personne {
	
	private String login ;
	private String password ;
	List <Client> clients ;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	} 
	
	
	
	

}
