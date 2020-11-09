package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mega-sena")
public class MegaSena extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html>"); 
		writer.println("<head>"); 
		writer.println("<title>Question 5</title>");
		writer.println("</head>"); 
		writer.println("<body>"); 
		writer.println("<h3>Quest 5</h3>");
		
		writer.println("<h4><form action=\"megasena.jsp\">\r\n" + 
				"		<label for=\"nome\">Entre com a quantidade de jogos de megasena: </label> <input type=\"number\"\r\n" + 
				"			name=\"quant\"><br>\r\n" + 
				"		<br> <input type=\"submit\" value=\"Enviar\">\r\n" + 
				"	</form></h4>");	
		
		writer.println("</body>");
		writer.println("</html>"); 
		
	}
}
