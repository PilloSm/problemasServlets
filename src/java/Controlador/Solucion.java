/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Problema4;
import Modelo.Problema5;
import Modelo.Problema9;
import ModeloDAO.Problema4DAO;
import ModeloDAO.Problema5DAO;
import ModeloDAO.Problema9DAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author artem
 */
public class Solucion extends HttpServlet {
    Problema4 pcua=new Problema4();
    Problema4DAO pdcua=new Problema4DAO();
    Problema5 pcin=new Problema5();
    Problema5DAO pdcin=new Problema5DAO();
    Problema9 pnue=new Problema9();
    Problema9DAO pdnue=new Problema9DAO();

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Solucion</title>");            
            out.println("</head>");
            out.println("<body>"
                +"Se han guardado los datos");
            out.println("<h1>Servlet Solucion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String acceso="Vista/consulta.jsp";
        String action=request.getParameter("accion");
        if (action.equalsIgnoreCase("calis"))
        {
        String nombre=request.getParameter("nombreA");
        int califpar=Integer.parseInt(request.getParameter("calificacion1"));
        int califexf=Integer.parseInt(request.getParameter("examenfinal"));
        int califtraf=Integer.parseInt(request.getParameter("trabajofinal"));
        pcua.setNombre(nombre);
        pcua.setCalifpar(califpar);
        pcua.setCalifexf(califexf);
        pcua.setCaliftraf(califtraf);
        pcua.promediar();
        pdcua.registrar(pcua);
        }
        else if (action.equalsIgnoreCase("porcentaje"))
        {
        String grupo=request.getParameter("grupo");
        int nHombres=Integer.parseInt(request.getParameter("alumnosh"));
        int nMujeres=Integer.parseInt(request.getParameter("alumnosm"));
        pcin.setGrupo(grupo);
        pcin.setnHombres(nHombres);
        pcin.setnMujeres(nMujeres);
        pcin.porcentaje();
        pdcin.registrar(pcin);
        }
        else if(action.equalsIgnoreCase("cuota"))
        {
        String nombre=request.getParameter("nombreT");
        int salario=Integer.parseInt(request.getParameter("salario"));
        int horas=Integer.parseInt(request.getParameter("horastotales"));
        pnue.setNombre(nombre);
        pnue.setHorasT(horas);
        pnue.setSalario(salario);
        pnue.pago();
        pdnue.registrar(pnue);
        }
        RequestDispatcher vistas=request.getRequestDispatcher(acceso);
        vistas.forward(request, response);
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

}
