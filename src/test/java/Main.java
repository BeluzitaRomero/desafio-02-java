import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.coderhouse.clases.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona("Jose", "Garcia");
		Persona persona2 = new Persona("Laura", "Arana");
		Persona persona3 = new Persona("Sofia", "Martinez");
		Persona persona4 = new Persona("Angel", "Cabrera");
		Persona persona5 = new Persona("Mariana", "Dominguez");
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		
		//Ordenamiento alfabetico por nombre
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
		
		System.out.println("--------------Por nombre-------------");
		
		for (Persona persona: listaPersonas) {
			
			System.out.println(persona.getNombre()+" " + persona.getApellido());
		}
		
		System.out.println("--------------Por apellido-------------");
		
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
		//Ordenamiento alfabetico por apellido
		for (Persona persona: listaPersonas) {
			System.out.println(persona.getApellido()+ ", " + persona.getNombre());
		}
		
		System.out.println("--------------Por apellido al reves-------------");
		
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
		//Ordenamiento alfabetico por apellido de Z-A
		for (Persona persona: listaPersonas) {
			System.out.println(persona.getApellido()+ ", " + persona.getNombre());
		}
		
	}

}
