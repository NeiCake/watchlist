package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * A JPA DAO factory for providing reference to EntityManager.
 *
 */
public class JPADaoFactory {


	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	/**
	 * Returns reference to EntityManager instance. If null then create it using
	 * the persistence unit name as defined in the persistence.xml
	 *
	 * @return EntityManager
	 */
	public static EntityManager createEntityManager() {

		if (entityManager == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("mappy");
		
			entityManager = entityManagerFactory.createEntityManager();
		}
		return entityManager;
	}

	public static void close() {
		entityManager.close();
		entityManagerFactory.close();
		
	}

}