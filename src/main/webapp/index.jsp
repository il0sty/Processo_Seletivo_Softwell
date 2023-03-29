<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	    <meta charset="UTF-8">
	    <title>Registro</title>
	</head>
	<body>
		<form id="register_form" action = "Controller" method="post">
		  <label for="insert_name">Nome*: </label>
		  <input type="text" id="insert_name" name="insert_name" onkeyup="this.value = this.value.toUpperCase();" required>
		  <br> <br>
		
		  <label for="insert_bday">Data de nascimento*: </label>
		  <input type="date" id="insert_bday" name="insert_bday" required>
		  <br> <br>
		
		  <label for="insert_rg">RG*: </label>
		  <input type="text" id="insert_rg" name="insert_rg" required>
		  <br> <br>
		
		  <label for="insert_cpf">CPF*: </label>
		  <input type="text" id="insert_cpf" name="insert_cpf" required>
		  <br> <br>
		
		  <label for="insert_cell">Celular*: </label>
		  <input type="text" id="insert_cell" name="insert_cell"  required>
		  <br> <br>
		
		  <label for="insert_email">E-mail:</label>
		  <input type="email" id="insert_email" name="insert_email">
		  <br> <br>
		
		  <label for="insert_name_mother">Nome da mãe*:</label>
		  <input type="text" id="insert_name_mother" name="insert_name_mother"  onkeyup="this.value = this.value.toUpperCase();" required>
		  <br> <br>
		
		  <label for="insert_name_father">Nome do pai*:</label>
		  <input type="text" id="insert_name_father" name="insert_name_father"  onkeyup="this.value = this.value.toUpperCase();" required>
		  <br> <br>
		
		  <button type="submit" id = "send_data">Enviar Dados</button>
		</form>
		
		<script>
		  const form = document.querySelector('#register_form');
		  const birthdayInput = document.querySelector('#insert_bday');
		
		  function isOldEnought() {
		    const birthday = new Date(birthdayInput.value);
		    const today = new Date();
		    const age = today.getFullYear() - birthday.getFullYear();
		
		    if (age < 18) {
		      alert('Idade Inválida!');
		      birthdayInput.focus();
		      return false;
		    }
		
		    return true;
		  }
		
		  birthdayInput.addEventListener('blur', isOldEnought);
		  
		  function changePage(){
			  window.location.href = 'Sucess.jsp';
		  }
		  
		</script>
		
		
	</body>
</html>