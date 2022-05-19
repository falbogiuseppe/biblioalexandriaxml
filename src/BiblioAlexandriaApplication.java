import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.Bibliotecaria;
import entities.Cliente;
import entities.Libro;
import entities.Persona;

public class BiblioAlexandriaApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.XML");
		
		Bibliotecaria Elena = context.getBean("BeanBibliotecaria", Bibliotecaria.class);
		Elena.setNome("Elena");
		
		Cliente Luigi = context.getBean("BeanCliente", Cliente.class);
		Luigi.setNome("Luigi");
		
		Libro Holden = context.getBean("BeanLibro", Libro.class);
		Holden.setTitolo("Il Giovane Holden");
		
		Libro Gatsby = context.getBean("BeanLibro", Libro.class);
		Gatsby.setTitolo("Il Grande Gatsby");
		
		System.out.println(Elena.iniziaTurno());
		System.out.println(Luigi.chiediLibro(Holden));
		System.out.println(Elena.prestaLibro(Holden));
		System.out.println(Luigi.restituisciLibro(Gatsby));
		System.out.println(Elena.recuperaLibro(Gatsby));
		System.out.println(Elena.mantieniSilenzio());
		System.out.println(Elena.finisciTurno());
		
		context.close();

	}

}
