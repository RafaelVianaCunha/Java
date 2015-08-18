<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
	<fmt:message key="mensagem.novoProduto"/>
	Bem vindo ao nosso gerenciador de empresas!
	<br />
	
	<c:if test="${not empty usuarioLogado}">
		Logado como ${usuarioLogado.email}</br>
	</c:if>
	<form action="executa" method="post">
	<input type="hidden" name="tarefa" value="NovaEmpresa"/>
		Cadastrar</br>
		Nome: <input type="text" name="nome"> <input type="submit"
			name="Enviar" value="Cadastrar">
	</form>
	
	<form action="executa" method="post">
	<input type="hidden" name="tarefa" value="BuscaEmpresa"/>
		Buscar</br>
		Nome: <input type="text" name="filtro"> <input type="submit"
			name="Enviar" value="Buscar">
	</form>

	<form action="login" method="post">
		Email: <input type="text" name="email"> Senha: <input
			type="password" name="senha"> <input type="submit"
			name="Enviar" value="Entrar">
	</form>

	<form action="executa" method="post">
	<input type="hidden" name="tarefa" value="Logout"/>
		<input type="submit" name="Deslogar" value="Deslogar">
	</form>
</body>
</html>