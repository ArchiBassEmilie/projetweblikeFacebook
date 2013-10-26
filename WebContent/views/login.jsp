<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facebook</title>
<link rel="stylesheet" media="screen" type="text/css" href="resource/style/style.css" />
<%-- <link rel="stylesheet" media="screen" type="text/css" href="resource/style.css" />  --%>
</head>
<body>
	<div id="header2">
		<div id="header2-logo">
			<h1>Facebook</h1>
		</div>
	</div>
	
  
  	
  	<div class="positionMenuLogin">
  		 <form method="post" action="controllers/home.jsp">
		<p>
			<span class="information"><b>Connexion:</b></span> .
		</p>
		<hr />
	
		<table>
			<tr>
				<td><label for="username">Username:</label></td>
				<td><input type="text" name="username" id="username" class="usernameField" size="30" /></td>
			</tr>
			<tr>
				<td><label for="password">Password:</label></td>
				<td><input type="password" name="password" id="password" class="passwordField" size="30" /></td>
			</tr>
			<tr>
				<td colspan="2"> <span class="information"><i>Mot de passe oublié?.</i></span>.</td>
				
			</tr>
		</table>	
		<p>
			<input type="submit" id="submit" class="button" value="Connexion" /><br /><br />
		</p>
		
  	</form>
  	
  	
  	</div>
 

</body>
</html>