<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'une adresse</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/inc/style.css"/>" />
    </head>
    <body>
        <c:import url="/inc/menu.jsp" />
        <div id="corps">
            <p class="info">${ form.resultat }</p>
            <p>Numéro : <c:out value="${ adresse.numero }"/></p>
            <p>Rue : <c:out value="${ adresse.rue }"/></p>
            <p>Code Postal : <c:out value="${ adresse.codePostal }"/></p>
            <p>Ville : <c:out value="${ adresse.ville }"/></p>
        </div>
    </body>
</html>