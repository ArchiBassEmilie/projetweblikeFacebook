<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<label for="numero">Nom <span class="requis">*</span></label>
<input type="text" id="numero" name="numero" value="<c:out value="${adresse.numero}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['numero']}</span>
<br />


<label for="numero">Prénom <span class="requis">*</span></label>
<input type="text" id="numero" name="numero" value="<c:out value="${adresse.numero}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['numero']}</span>
<br />
 
<label for="rue">Login  <span class="requis">*</span></label>
<input type="text" id="rue" name="rue" value="<c:out value="${adresse.rue}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['rue']}</span>
<br />
 
<label for="codePostal">Mot de passe <span class="requis">*</span></label>
<input type="text" id="codePostal" name="codePostal" value="<c:out value="${contact.codePostal}"/>" size="30" maxlength="60" />
<span class="erreur">${form.erreurs['codePostal']}</span>
<br />
 
<label for="ville">Confirmer mot de passe <span class="requis">*</span></label>
<input type="text" id="ville" name="ville" value="<c:out value="${contact.ville}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['ville']}</span>
<br />