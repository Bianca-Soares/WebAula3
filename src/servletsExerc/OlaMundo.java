package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ola-mundo")
public class OlaMundo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Olá Mundo</h1>");
		writer.println("<h3>Quest 1</h3>");
		String reqNome = req.getParameter("nome");
		if (reqNome == null || reqNome.trim().length() == 0) {
			req.getRequestDispatcher("index.jsp?erro=ERRO NO NOME").forward(req, resp);
		} else {
			req.getRequestDispatcher("bemvindo.jsp?nome=" + reqNome.toUpperCase()).forward(req, resp);

		}
	}
}
