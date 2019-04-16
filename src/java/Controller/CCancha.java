/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CanchaDao;
import DTO.Cancha;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author QfloresRA
 */
public class CCancha extends HttpServlet {
    String page = "";
    String sms = "";
    String ruta = "";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String acc = request.getParameter("accion");
        if (acc.equals("listpool")) {
            this.ViewListpool(request, response);
            
        }else if(acc.equals("VInsertpool")){
            this.ViewInsertPool(request, response);
        }else if(acc.equals("VUpdatePool") ){
                this.ViewsUpdatePoll(request, response);
                
        }else if(acc.equals("newcancha")){
            this.insertarCancha(request, response);
        
        }
        
        else{
            ViewHome(request, response);
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void ViewListpool(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ruta = "Cancha/";
        page = "Lista";       
        
        sms = "Lista de Canchas";
        
        request.setAttribute("page", ruta + page);
        request.setAttribute("mensaje", sms);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    private void ViewInsertPool(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ruta = "Cancha/";
        page = "Insert";       
        
        sms = "Inserte Nueva Cancha";
        
        request.setAttribute("page", ruta + page);
        request.setAttribute("mensaje", sms);
        request.getRequestDispatcher("index.jsp").forward(request, response); 
    }

    private void ViewHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ruta = "Views/";
        page = "Home";       
        
        sms = "Página de Inicio";
        
        request.setAttribute("page", ruta + page);
        request.setAttribute("mensaje", sms);
        request.getRequestDispatcher("index.jsp").forward(request, response); 
    }

    private void ViewsUpdatePoll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ruta = "Cancha/";
        page = "Update";       
        
        sms = "Actualiza Producto";
        
        request.setAttribute("page", ruta + page);
        request.setAttribute("mensaje", sms);
        request.getRequestDispatcher("index.jsp").forward(request, response); 
    }

    private void insertarCancha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String name = request.getParameter("namecancha");
        String desc = request.getParameter("namecancha");
        
        
        
        
        CanchaDao canchad = new CanchaDao();
       
        // insertando cancha
        Cancha cancha = new Cancha(name, desc, "gigante", 1);
        
        if (canchad.InsertT(cancha)) {
            
           // System.out.println("Cancha nueva se insertó");
            sms = " ok";
        }else{
            //System.out.println("No se inserto la cancha nueva");
            sms = " errors";
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ruta = "Cancha/";
        page = "Insert";       
        
        
        
        request.setAttribute("page", ruta + page);
        request.setAttribute("mensaje", sms);
        request.getRequestDispatcher("index.jsp").forward(request, response); 
        
    }

}
