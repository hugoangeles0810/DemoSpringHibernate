<%-- 
    Document   : new
    Created on : 08/04/2016, 02:05:33 PM
    Author     : Hugo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact - New</title>
    </head>
    <body>
        <div>
            <h1>New Contact</h1>
            <form action="new" method="POST">
                <div>
                    <label for="firstname">Firstname</label>
                    <input id="firstname" type="text" name="firstname" />
                </div>
                <div>
                    <label for="lastname">Lastname</label>
                    <input id="lastname" type="text" name="lastname" />
                </div>
                <div>
                    <label for="email">Email</label>
                    <input id="email" type="text" name="email" />
                </div>
                <div>
                    <label for="telephone">Telephone</label>
                    <input id="telephone" type="text" name="telephone" />
                </div>
                <div>
                    <input type="reset" value="Limpiar" />
                    <input type="submit" value="Guardar" />
                </div>
            </form>
            <a href="javascript: window.history.back();">Regresar</a>
        </div>
    </body>
</html>
