package Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable{
	private String name;
	private String birthday;
	private String rg;
	private String cpf;
	private String phone;
	private String email;
	private String name_mother;
	private String name_father;
	private LocalDateTime data_cadastro;	
	
	public User(String name, String birthday, String rg, String cpf, String phone, String email, String name_mother,
			String name_father) {
		this.name = name;
		this.birthday = birthday;
		this.rg = rg;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
		this.name_mother = name_mother;
		this.name_father = name_father;
		this.data_cadastro = LocalDateTime.now();
		System.out.println("Usuário Criado!");
		System.out.println("Nome: " + name);
		System.out.println("Data de Nascimento: " + birthday);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("Celular: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Nome da mãe: " + name_mother);
		System.out.println("Nome do pai: " + name_father);
		System.out.println("Data de Cadastro: " + data_cadastro);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName_mother() {
		return name_mother;
	}
	public void setName_mother(String name_mother) {
		this.name_mother = name_mother;
	}
	public String getName_father() {
		return name_father;
	}
	public void setName_father(String name_father) {
		this.name_father = name_father;
	}
	public LocalDateTime getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(LocalDateTime data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	
	

}
