package org.esc.BO.SQL;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Sanciones;

public class alumnosSancionSQL {

	connectionSQL cc = new connectionSQL();
		
	public void cargarSancion(Sanciones s,Alumnos a){
	
		
		cc.conectar();
		cc.ejecutar("INSERT INTO sanciones(idSanciones,fecha,DNIAlumno,codSancion,observacion,totalSanciones,nroSanciones)"
				+ "VALUES (null,"+s.getFecha()+","+a.getDni()+","+s.getIdSanciones()+","+s.getObservacion()+",0,"+s.getNroSanciones()+")");
	}
		
}
