package repaso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;
import util.ConnectionManager;

public class FiguraDao implements DAO {

	@Override
	public void agregar(Object obj) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		//armar el sql de acuerdo a la figura
		StringBuilder sql = new StringBuilder("insert into figuras(fig_nombre,fig_tipo,");
		PreparedStatement stm = null;
		
		if(obj instanceof Cuadrado ) {
			Cuadrado cua = (Cuadrado)obj;
			sql.append("fig_lado) values(?,?,?)");
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cua.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cua.getLado());
			
		}else if(obj instanceof Circulo ) {
			Circulo cir = (Circulo)obj;
			sql.append("fig_lado) values(?,?,?)");
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cir.getNombre());
			stm.setInt(2, 2);
			stm.setFloat(3, cir.getRadio());
			
		}else if(obj instanceof Triangulo ) {
			Triangulo t1 = (Triangulo)obj;
			sql.append("fig_altura, fig_base) values(?,?,?,?)");
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, t1.getNombre());
			stm.setInt(2, 4);
			stm.setFloat(3, t1.getAltura());
			stm.setFloat(4, t1.getBase());
			
		}else if(obj instanceof Rectangulo ) {
			Rectangulo t1 = (Rectangulo)obj;
			sql.append("fig_altura, fig_base) values(?,?,?,?)");
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, t1.getNombre());
			stm.setInt(2, 3);
			stm.setFloat(3, t1.getAltura());
			stm.setFloat(4, t1.getBase());
			
		}else if(obj instanceof PoligonoRegular ) {
			PoligonoRegular pr1 = (PoligonoRegular)obj;
			sql.append("fig_lado, fig_numlados,fig_apotema) values(?,?,?,?,?)");
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, pr1.getNombre());
			stm.setInt(2, 5);
			stm.setFloat(3, pr1.getLado());
			stm.setInt(4, pr1.getCantidadDeLados());
			stm.setFloat(5, pr1.getApotema());
		}
		
		// agregar todos los demas instaceof
		
		stm.execute();
		stm.close();
		con.close();
		
	}

	@Override
	public void eliminar(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List leer(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
