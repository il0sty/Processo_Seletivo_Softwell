package Controller;

import Model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<User> saveUsers = new ArrayList<User>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("insert_name");
		String birthday = request.getParameter("insert_bday");
		String rg = request.getParameter("insert_rg");
		String cpf = request.getParameter("insert_cpf");
		String phone = request.getParameter("insert_cell");
		String email  = request.getParameter("insert_email");
		String name_mother = request.getParameter("insert_name_mother");
		String name_father = request.getParameter("insert_name_father");
		
		if(verUser(rg,cpf,email,phone,saveUsers)) {
		User newUser = new User(name,birthday,rg,cpf,phone,email,name_mother,name_father);
		saveUsers.add(newUser);
		RequestDispatcher rd = request.getRequestDispatcher("Sucess.jsp");
		rd.forward(request, response);
		} else {
			System.out.println("Usuário já Cadastrado");
			RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
			rd.forward(request, response);
		}
	}
	
	protected boolean verUser(String rg, String cpf, String email, String phone, ArrayList<User> saveUsers) {
		boolean ver = true;
		if(saveUsers.size()>0) {
			for(User savedUser : saveUsers) {
				if(savedUser.getCpf().equals(cpf) || savedUser.getRg().equals(rg)
						|| savedUser.getEmail().equals(email) || savedUser.getPhone().equals(phone)) {
					ver = false;
					break;
				}
			}
		}
		return ver;
	}
}
