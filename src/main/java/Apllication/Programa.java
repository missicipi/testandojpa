package Apllication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Programa {

	public static void main(String[] args) {

		/*
		 * Inicio do teste Pessoa p1 = new Pessoa(null,"Joaozinho", "joaonjo");
		 * System.out.println(p1);
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/*
		 * Para criar uma entidade e iniserir esse dado na tabela///
		 * em.getTransaction().begin(); em.persist(p1); em.getTransaction().commit();
		 * System.out.println("Salvo!");
		 */

		//Sempre que for realizar uma ação no JPA tem que iniciar uma transaction,
		//seja em.persist (para selecionar, em.remove e etc
		
		/*Para buscar no banco
		Pessoa p = em.find(Pessoa.class, 1);
		System.out.println(p);*/

		em.close();
		emf.close();
	}

}
