/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Estudiantes
 */
public class Calculo extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String s1 = request.getParameter("Num");
            String s2 = request.getParameter("Num2");
            String s3 = request.getParameter("Num3");
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);
            String res,resd = null;
            /*
            double Xuno = (-b+(Math.sqrt(Math.pow(b, 2)-4*(a*c))/2*a));
            double Xdos = (-b-(Math.sqrt(Math.pow(b, 2)-4*(a*c))/2*a));
            String resp1 = String.valueOf(Xuno);
            String resp2 = String.valueOf(Xdos);*/
            double disc=Math.pow(b,2)-4*a*c;
            if(a!=0){
                if(disc<0){
                    res="Tiene raices imaginarias";
                }else{
                    double x1=(-b+Math.sqrt(disc))/(2*a);
                    double x2=(-b-Math.sqrt(disc))/(2*a);
                    res="X1 = "+x1;
                    resd=" X2 = "+x2;
                }
            }else{
                res="El coeficiente cuadratico debe ser diferente de 0";
            }      
            request.setAttribute("raiz1", res);
            request.setAttribute("raiz2", resd);
            request.getRequestDispatcher("index.jsp").forward(request, response);           
        }
        finally {
            out.close();
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

}
