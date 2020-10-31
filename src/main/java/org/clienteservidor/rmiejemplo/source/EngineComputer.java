package org.clienteservidor.rmiejemplo.source;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class EngineComputer implements IProcesamiento {

	public EngineComputer() {
		super();
	}

	
	public static void main(String[] args) {
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String nombre = "engine";
			EngineComputer engine = new EngineComputer();
			IProcesamiento stubd = (IProcesamiento) UnicastRemoteObject.exportObject(engine, 0);
			Registry registro = LocateRegistry.getRegistry();
			registro.rebind(nombre, stubd);
			System.out.println("Motor de Computo incluido");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
	}

	public <T> T ejecutarTarea(Task<T> tarea) {
		// TODO Auto-generated method stub
		return tarea.ejecutarTarea();
	}	
}
