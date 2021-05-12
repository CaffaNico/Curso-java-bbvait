package repaso.dao.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import repaso.Cuadrado;
import repaso.dao.FiguraDao;
import util.ConnectionManager;

public class FiguraDaoTest {
	
	Cuadrado cua;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//aca genero un lote de pruebas un cuadrado para eliminar modifica 4 inserciones como minimo
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// eliminar los 4 registros mas el agregado del metodo agregar
	}

	@Before
	public void setUp() throws Exception {
		cua = new Cuadrado("cuadradoTest",15.5f);
	}

	@After
	public void tearDown() throws Exception {
		
		cua = null;
	}

	@Test
	public void testAgregar() {
		FiguraDao figdao = new FiguraDao();
		try {
			figdao.agregar(cua);
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConexion();
			Statement stm = con.createStatement();
		    ResultSet rs = stm.executeQuery("select fig_nombre,fig_tipo, fig_lado from figuras where fig_nombre='cuadradoTest'");
		    assertTrue(rs.next());
		} catch (ClassNotFoundException | SQLException e) {
			 assertTrue(false);
			e.printStackTrace();
		}
		//deberia leer el agregado hacer equals con
		
		
	}

}
