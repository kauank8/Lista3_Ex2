package controller;

import br.com.kauanpaulino.listaint.listaint;
import br.com.kauanpaulino.quicksort.QuickSort;

public class ListaController {
	
	public listaint GeraListas(listaint listaPri, listaint listaSec) {
		
		//Lista Primaria
		listaPri.addFirst(1);
		try {
			listaPri.addLast(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//lista secundaria
		
		listaSec.addFirst(3);
		try {
			listaSec.addLast(4);
			listaSec.addLast(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//lista Terciaria
		listaint listaTerc = new listaint();
		int tamanhoPri = listaPri.size();
		int tamanhoSec = listaSec.size();
		for(int i=0;i<tamanhoPri;i++) {
			int valor;
			try {
				valor = listaPri.get(i);
				listaTerc.add(valor,i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tamanhoTerc = listaTerc.size();
		for(int i=0;i<tamanhoSec;i++) {
			int valor;
			try {
				valor = listaSec.get(i);
				listaTerc.add(valor,i+tamanhoTerc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listaTerc;
	}
	
	public void ordenacao(listaint listaTerc) {
		QuickSort qk = new QuickSort();
		int tamanho = listaTerc.size();
		int[] vt = new int [tamanho];
		for(int i=0;i<tamanho;i++) {
			try {
				int valor=listaTerc.get(i);
				vt[i]=valor;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		vt=qk.quicksort(vt, 0, tamanho-1);
		//mostra
		for(int i=0;i<tamanho;i++) {
			System.out.print(vt[i] + " ");
		}
	}
	
}
