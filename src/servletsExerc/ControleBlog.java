package servletsExerc;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle-blog")
public class ControleBlog extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws
		ServletException, IOException{
		
		String nome = req.getParameter("nome");
		
		Usuario usuario = new Usuario(nome);
		req.getSession().setAttribute("USUARIO", usuario);
		List listMsg= new ArrayList<Msg>();
		

		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");		
		SimpleDateFormat hf = new SimpleDateFormat("HH:mm:ss");
		
		String hoje = hf.format(new Date());
		String time = hf.format(new Date());
		String mensagem = req.getParameter("mensagem");
		System.out.println("oi");
		Msg msg= new Msg(mensagem, hoje, time);
		
		listMsg.add(msg);
		
			
		//req.setAttribute("list_msg_bean", listMsg);	
		req.getSession().setAttribute("list_msg_bean", listMsg);
		req.getRequestDispatcher("blog.jsp").forward(req, resp);
	
	}
}
