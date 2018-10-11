package fr.aplicaen.erp.controller;

import fr.aplicaen.erp.dao.AdherentDAO;
import fr.aplicaen.erp.dao.impl.AdherentDAOImpl;
import fr.aplicaen.erp.kernel.SpringConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adherents")
public class AdherentController extends HttpServlet {

    @Autowired
    private AdherentDAO adherentDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfiguration.class);
        context.refresh();

        adherentDAO.getAllAdherents();


        this.getServletContext().getRequestDispatcher( "/WEB-INF/liste_adherents.jsp" ).forward( req, resp );
    }

    public AdherentDAO getAdherentDAO() {
        return adherentDAO;
    }

    public void setAdherentDAO(AdherentDAO adherentDAO) {
        this.adherentDAO = adherentDAO;
    }

}
