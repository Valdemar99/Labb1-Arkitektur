package examples.ejb.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.ejb.basic.Employee;
import examples.ejb.basic.EmployeeLocal;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private EmployeeLocal e;
	@EJB
	private EmployeeLocal e1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>Stateless Employee</title>");
		out.println("<meta charset=\"ISO-8859-1\"></head>");
		out.println("<body>");
		
		try{
			if (e != null) {
				e.setName("Rolke Af Sturup");
				out.println("<h4>Employee e skapad (Injection): ");
				out.println(e.getName() + "</h4><br>");
			}
			if (e1 != null) {
				out.println("<h4>Employee e1 skapad:");
				e1.setName("Mats Af Lund");
				out.println(e1.getName() + "</h4><br>");
				out.println("<h4>Hämtar namnet på den första</h4>");
				out.println("Employee e: " + e.getName() + 
						" -Borde vara <b>Rolke Af Sturup</b><br>");
			}
		} catch (Exception e) {
			out.println("Exeption kastad." + e.getMessage());
		}
		out.println("</body></html>");
	}

}
