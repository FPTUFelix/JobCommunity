/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Dao.DaoPost;
import Dao.DaoWorkType;
import Model.Post;
import Model.WorkType;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author sontu
 */
public class ListPostController extends HttpServlet {

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
            String workType = request.getParameter("workType") == null ? "" : request.getParameter("workType");
            String dateStarted = request.getParameter("dateStarted") == null ? "" : request.getParameter("dateStarted");
            String startTime = request.getParameter("startTime");
            String endTime = request.getParameter("endTime");
            String timeDuration = (startTime != null && endTime != null && !startTime.isEmpty() && !endTime.isEmpty())
                    ? startTime + "-" + endTime
                    : "";
            String salaryPara = request.getParameter("salary");
            DaoPost daoPost = new DaoPost();
            DaoWorkType daoWorkType = new DaoWorkType();
            List<WorkType> listWorkType = daoWorkType.getAllWorkType();
            request.setAttribute("listWorkType", listWorkType);
            List<Post> listAllActivePost = daoPost.getAllPostActive(workType, dateStarted, timeDuration, salaryPara);
            request.setAttribute("listAllActivePost", listAllActivePost);
            request.getRequestDispatcher("Post.jsp").forward(request, response);
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
