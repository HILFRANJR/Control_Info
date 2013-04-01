// Projeto Control_Info

package br.com.controlinfo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public interface InterfaceDataSource 

{
	public abstract Connection getConnection() throws SQLException;
}