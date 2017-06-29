<%-- 
    Document   : BuscarDireccion
    Created on : Jun 28, 2017, 7:07:44 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="page-header">
            <h1> Administrador web<small> Busqueda por dirección</small></h1>
        </div>
        <div class="container">
            <div class="row">

                <div class="col-md-3"> </div>

                <div class="col-md-6">

                    <form:form method="post" commandName="hotel">
                        <h2></h2>
                        <form:errors path="*" element="div" cssClass="alert alert-danger" />

                        <div clas="form-control">
                            <p>
                                <form:label path="direccion">Buscar dirección de hotel:</form:label>
                                <form:input path="direccion" cssClass="form-control" />

                            </p>
                        </div>
                        <div class="row text-center" >
                            <input type="submit" value="Buscar hotel" class="btn btn-primary"  />
                        </div>

                    </form:form>
                </div>

                <div class="col-md-3"> </div>
            </div>

        </div>
    </body>
</html>
