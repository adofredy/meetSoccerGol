
<h4><%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%></h4>
<div class="page-header">
    <h1>
        Gestionar registro de Reserva
        <small>
            <i class="ace-icon fa fa-angle-double-right"></i>
            >>
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
                    Registro de Reserva
                </div>

                <!-- div.table-responsive -->

                <!-- div.dataTables_borderWrap -->
                <div>
                    <!-- Registrar Categoria -->
                    <form method="POST" action="CCancha?accion=newcancha" class="form-horizontal">

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Codigo de Reserva:
                            </label> 

                            <div class="col-sm-9">
                                <input type="text" name="isbn" value="" placeholder="Codigo de Reserva">                                                                                                    
                            </div>
                        </div> 

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                N° reserva-pago:
                            </label> 

                            <div class="col-sm-9">
                                <input type="text" name="titulo" value="" placeholder="N° reserva-pago">                                                                                                    
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Descripción:
                            </label> 

                            <div class="col-sm-9">
                                <textarea rows="3" name="description" value="" placeholder="Descripción Libro"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Nombre Autor:
                            </label> 

                            <div class="col-sm-9">
                                <input type="text" name="autor" value="" placeholder="Nombre Autor">                                                                                                    
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Fecha de publicación:
                            </label> 

                            <div class="col-sm-9">
                                <input type="date" id="date" name="fecha" value="" placeholder="Fecha de publicación">                                                                                                    
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Seleccione Categoría:
                            </label> 

                            <div class="col-sm-9">
                                <select name="categoria">

                                    <option value="" style="color:#f59e00 ;">Seleccione una opción</option>

                                  
                                </select>
                                <!--mostrando error-->
                                <span><%
                                    String error = (String) request.getSession().getAttribute("Error");

                                    out.print(error);

                                    %>

                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right" >
                                Seleccione Reserva:
                            </label> 
                            <div class="col-sm-9">
                                <select name="editorial">
                                   
                                </select>
                            </div>

                        </div>                                              

                        <div class="form-group">
                            <button class="btn btn-primary " type="submit" name="accion" value="insert">
                                <i class="fa fa-save"></i> Registrar
                            </button>
                            <button class="btn btn-warning " type="submit" name="accion" value="update">
                                <i class="fa fa-upload "></i> Actualizar
                            </button>
                            <button class="btn btn-danger " type="submit" name="accion" value="delete">
                                <i class="fa fa-check"></i> Eliminar
                            </button>
                        </div>
                        <div style="color:red">
                            <%=(request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%>

                            <!--FORMA DOS DE RECUPERAR EERROE--->


                        </div>  
                    </form>
                </div>

            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>

    <!-- PAGE CONTENT ENDS -->
</div><!-- /.col -->