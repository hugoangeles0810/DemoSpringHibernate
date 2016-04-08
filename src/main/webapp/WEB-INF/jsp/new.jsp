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
        <link rel="stylesheet" href="resources/css/materialize.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1>New Contact</h1>
            <div class="row">
                <form action="new" method="POST">
                    <div class="input-field col s12 m6">
                        <label for="firstname">Firstname</label>
                        <input id="firstname" type="text" name="firstname" />
                    </div>
                    <div class="input-field col s12 m6">
                        <label for="lastname">Lastname</label>
                        <input id="lastname" type="text" name="lastname" />
                    </div>
                    <div class="input-field col s12 m6">
                        <label for="email">Email</label>
                        <input id="email" type="text" name="email" />
                    </div>
                    <div class="input-field col s12 m6">
                        <label for="telephone">Telephone</label>
                        <input id="telephone" type="text" name="telephone" />
                    </div>
                    <div class="center-align">
                        <button type="reset" class="btn waves-effect waves-light">Limpiar</button>
                        <button type="submit" class="btn waves-effect waves-light">Guardar</button>
                    </div>
                </form>
            </div>
            <a href="javascript: window.history.back();">Regresar</a>
        </div>
        <script src="resources/js/jquery.min.js"></script>
        <script src="resources/js/materialize.min.js"></script>
    </body>
</html>
