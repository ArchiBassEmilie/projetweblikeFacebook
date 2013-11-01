<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un contact</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
    </head>
    <body>
        <div>
            <form method="post" action="<c:url value="/creationContact"/>">
            <c:set var="adresse" value="${ contact.adresse }" scope="request" />        
                <fieldset>
                    <legend>Connexion</legend>
                     
                    <label for="nomContact">Login <span class="requis">*</span></label>
                    <input type="text" id="nomContact" name="nomContact" value="<c:out value="${contact.nom}"/>" size="30" maxlength="30" />
                    <span class="erreur">${form.erreurs['nomContact']}</span>
                    <br />
                     
                    <label for="prenomContact">Mot de passe : <span class="requis">*</span></label>
                    <input type="text" id="prenomContact" name="prenomContact" value="<c:out value="${contact.prenom}"/>" size="30" maxlength="30" />
                    <span class="erreur">${form.erreurs['prenomContact']}</span>
                    <br />
                  
                </fieldset>
                
                <p class="info">${ form.resultat }</p>
                <input type="submit" value="Connexion"  />
            </form>
            <p class="positionInscription">
            	 <form method="post" action="<c:url value="/creationAdresse"/>">
	                <input type="submit" value="Inscription" /> <br />
	            </form>
            </p>
           
            
        </div>
    </body>
</html>
