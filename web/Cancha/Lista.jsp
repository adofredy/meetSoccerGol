
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CanchaDao"%>
<%@page import="DTO.Cancha"%>
<div class="page-header">
    <h1>
        
        <small>
            <i class="ace-icon fa fa-angle-double-right"></i>
            <h4><%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%></h4>

        </small>
    </h1>
</div><!-- /.page-header -->


<div class="row">
    <div class="col-xs-12">
        <!-- PAGE CONTENT BEGINS -->
        <!-- /.row -->

        <div class="row">
            <div class="col-xs-12">
                <div class="table-header">
                    <h5><%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%></h5>

                </div>
                <!-- div.table-responsive -->
                <!-- div.dataTables_borderWrap -->
                <div>
                    <!--- Listade  libros-->
                    <table id="dynamic-table" class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Items</th>
                                <th>Nombre</th>
                                <th class="hidden-480">Descripción</th>
                                <th>
                                    <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                    Tipo Cancha
                                </th>
                                <th>Localidad</th>
                                <th class="hidden-480">Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                           <% 
                           //-llenando la tabla libros-
                            
                            CanchaDao cdao = new CanchaDao();
                            List<Cancha> lista = cdao.ListAll();
                            Iterator<Cancha> citer = lista.iterator();
                            Cancha cancha = null;
                            if (lista.size() > 0) {
                                  
                                while(citer.hasNext()){
                                    cancha = citer.next();
                            %>
                            <tr>
                                <td>
                                    <a href="#"><%=cancha.getId()%></a> <!--1254-3256-9856-652-->
                                </td>
                                <td class="hidden-480"><%=cancha.getNombre()%></td>
                                <td><%=cancha.getDescripcion()%></td>
                                <td><%=cancha.getTipoCancha()%></td>                                                
                                <td><span class="label label-sm label-success"><%=cancha.getIdLocalidad() %></span></td>
                                <td>
                                    <div class="hidden-sm hidden-xs action-buttons">
                                        <a class="blue" href="#">
                                            <i class="ace-icon fa fa-search-plus bigger-130"></i>
                                        </a>

                                        <a class="green" href="#">
                                            <i class="ace-icon fa fa-pencil bigger-130"></i>
                                        </a>

                                        <a class="red" href="#">
                                            <i class="ace-icon fa fa-trash-o bigger-130"></i>
                                        </a>
                                    </div>

                                    <div class="hidden-md hidden-lg">
                                        <div class="inline pos-rel">
                                            <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                <i class="ace-icon fa fa-caret-down icon-only bigger-120"></i>
                                            </button>

                                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                <li>
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
                                                        <span class="blue">
                                                            <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                        </span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
                                                        <span class="green">
                                                            <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                        </span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
                                                        <span class="red">
                                                            <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                        </span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <% }}else{%>
                            
                            <h3>No hay datos </h3>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>