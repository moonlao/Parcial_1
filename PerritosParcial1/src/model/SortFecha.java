package model;

import java.util.Comparator;

public class SortFecha implements Comparator<Datos>{

	@Override
	public int compare(Datos arg0, Datos arg1) {
		// TODO Auto-generated method stub
		return arg0.compareToFecha(arg1);
	}

	
}
