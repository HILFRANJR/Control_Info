

// Projeto Control_Info

package br.com.controlinfo.model.helper;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import br.com.controlinfo.model.command.InterfaceCommand;

public class ControlinfoHelper {
	private HashMap<String, InterfaceCommand> mapaComandos;
	private HttpServletRequest request;
	
	public ControlinfoHelper (HttpServletRequest request)
	{
		this.request = request;
	}
	
	public InterfaceCommand getCommand()
	{
		return mapaComandos.get(request.getParameter("cmd"));
	}
}
