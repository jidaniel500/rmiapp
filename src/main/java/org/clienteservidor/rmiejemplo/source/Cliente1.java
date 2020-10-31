package org.clienteservidor.rmiejemplo.source;


import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente1 {
	 public static void main(String args[]) {
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
	        }
	        try {
	            String name = "Compute";
	            Registry registry = LocateRegistry.getRegistry(args[0]);
	            EngineComputer comp = (EngineComputer) registry.lookup(name);
	            Pi task = new Pi(Integer.parseInt(args[1]));
	            BigDecimal pi = comp.ejecutarTarea(task);
	            System.out.println(pi);
	        } catch (Exception e) {
	            System.err.println("ComputePi exception:");
	            e.printStackTrace();
	        }
	    }    

}
