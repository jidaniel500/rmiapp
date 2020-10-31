package org.clienteservidor.rmiejemplo.source;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  IProcesamiento extends Remote {

	<T> T ejecutarTarea(Task<T> tarea) throws RemoteException;
}
