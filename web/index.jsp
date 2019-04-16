
<%@include  file="Views/Header.jsp"%>

<%@include  file="Views/Menu.jsp"%>


<%

    String pagina = "" + ((String) request.getAttribute("page"));

    if (pagina.equalsIgnoreCase("null")) {

        pagina = "Views/Home";

    }
    String ruta = pagina + ".jsp";

%>


<jsp:include page='<%= ruta%>'  flush='true'/> 

<%@include  file="Views/Footer.jsp"%>