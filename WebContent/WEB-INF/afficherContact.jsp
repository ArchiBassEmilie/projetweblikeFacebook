<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'un contact</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
    </head>
    <body>
        <c:import url="/inc/menu.jsp" />
        <div id="corps">
            <p class="info">${ form.resultat }</p>
            
            <p>Commande</p>
            <p>Nom  : <c:out value="${ commande.date }"/></p> 
            <p>Prénom  : <c:out value="${ commande.montant }"/></p> 
            <p>Email  : <c:out value="${ commande.modePaiement }"/></p> 
            <p>Date de naissance  : <c:out value="${ commande.statutPaiement }"/></p> 
            <p>Mode  : <c:out value="${ commande.modeLivraison }"/></p> 
            
            <p>Adresse</p>
            <p>numéro : <c:out value="${ contact.adresse.numero }"/></p>
            <p>Rue : <c:out value="${ contact.adresse.rue }"/></p>
            <p>Code Postal : <c:out value="${ contact.adresse.codePostal }"/></p>
            <p>Ville : <c:out value="${ contact.adresse.ville }"/></p>
        </div>
    </body>
</html>