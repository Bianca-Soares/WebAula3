package servletsExerc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle-usuario")
public class ControleUsuario extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		String nome = req.getParameter("nome");
		
		Usuario usuario = new Usuario(nome);
		req.getSession().setAttribute("USUARIO", usuario);
		req.getRequestDispatcher("blog.jsp").forward(req, resp);
		
	}
		
}
