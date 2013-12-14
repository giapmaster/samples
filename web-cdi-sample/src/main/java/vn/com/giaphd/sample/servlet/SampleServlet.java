package vn.com.giaphd.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.com.giaphd.sample.service.HelloService;

/**
 * @author giapmaster@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@WebServlet("/sample")
public class SampleServlet extends HttpServlet {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	static String PAGE_HEADER = "<html><head /><body>";

	static String PAGE_FOOTER = "</body></html>";

	@Inject
	private HelloService helloService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.println(PAGE_HEADER);
		writer.println("<h1>" + helloService.createHelloMessage("GiapHD") + "</h1>");
		writer.println(PAGE_FOOTER);
		writer.close();

	}

}
