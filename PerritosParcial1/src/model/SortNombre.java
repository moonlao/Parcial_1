package model;

import java.util.Comparator;

public class SortNombre implements Comparator<Datos>{

	@Override
	public int compare(Datos o1, Datos o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
