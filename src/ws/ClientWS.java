package ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import models.Exame;
import webService.ExameWS;
import webService.ExameWSServiceLocator;

public class ClientWS {
	
	public static void main(String[] args) {
		ExameWSServiceLocator wsLocator = new ExameWSServiceLocator();
		try {
			ExameWS exameWS = wsLocator.getExameWS();
			long id = 11;
			try {
				Exame exame = exameWS.getExame(id);
				System.out.println(exame.getId());
				System.out.println(exame.getId_Medico());
				System.out.println(exame.getId_Paciente());
				System.out.println(exame.getDt_Exame());
				System.out.println(exame.getTp_Sanguineo());
			} catch (RemoteException e) {
				System.out.println("Não foi possível encontrar exame!");
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			System.out.println("Não foi possível realizar operação!");
			e.printStackTrace();
		}
	}
	
}