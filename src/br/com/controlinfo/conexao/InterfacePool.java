// Projeto Control_Info

package br.com.controlinfo.conexao;

import java.sql.Connection;

public interface InterfacePool {

	public abstract Connection getConnection();
	public void liberarConnection(Connection con);
	
}
