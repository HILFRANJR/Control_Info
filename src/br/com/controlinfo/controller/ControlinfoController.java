// Projeto Control_Info

package br.com.controlinfo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.controlinfo.model.command.InterfaceCommand;
import br.com.controlinfo.model.helper.ControlinfoHelper;
/**
 * Servlet implementation class ControlinfoController
 */
@WebServlet("/ControlinfoController")
public class ControlinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlinfoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processarRequisicao(request, response);
	
	}
	
	private void processarRequisicao(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Processar Requisição");
		ControlinfoHelper controlinfoHelper = new ControlinfoHelper(request);
		InterfaceCommand comando = controlinfoHelper.getCommand();
		String pagina = comando.execute(request, response);
		request.getRequestDispatcher(pagina).include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processarRequisicao(request, response);
	}

}
