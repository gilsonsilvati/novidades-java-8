import java.util.Arrays;
import java.util.List;

public class Capitulo2 {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		/* 1º maneira */
//		for (Usuario u : usuarios) {
//			System.out.println("Nome: " + u.getNome());
//		}
		
		/* 2º maneira */
//		Mostrador mostrador = new Mostrador();
//		usuarios.forEach(mostrador);
		
		/* 3º maneira */
//		Consumer<Usuario> mostrador = new Consumer<Usuario>() {
//			
//			@Override
//			public void accept(Usuario u) {
//				System.out.println("Nome: " + u.getNome());
//			}
//		};
//		
//		usuarios.forEach(mostrador);
		
		/* 4º maneira */
//		usuarios.forEach(new Consumer<Usuario>() {
//			
//			@Override
//			public void accept(Usuario u) {
//				System.out.println("Nome: " + u.getNome());
//			}
//		});
		
		/* 5º maneira */
//		usuarios.forEach(u -> System.out.println("Nome: " + u.getNome()));
		
		/* Tornando todos moderadores */
		usuarios.forEach(u -> u.tornaModerador());
		
	}

}
