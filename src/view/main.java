package view;

import br.com.kauanpaulino.listaint.listaint;
import controller.ListaController;

public class main {

	public static void main(String[] args) {
		 listaint listaPrimaria = new listaint();
		 listaint listaSec = new listaint();
		 listaint listaTerc = new listaint();
		
		ListaController l = new ListaController();
		
		listaTerc=l.GeraListas(listaPrimaria, listaSec);
		l.ordenacao(listaTerc);
		
				
	}

}
