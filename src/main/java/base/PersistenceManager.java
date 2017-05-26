package base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public enum PersistenceManager {
	INSTANCE;
	private EntityManagerFactory emFactory;

	private PersistenceManager() {
		Logger log = Logger.getLogger("org");
		log.setLevel(Level.WARN);

		BasicConfigurator.configure();
		// "jpa-example" was the value of the name attribute of the
		// persistence-unit element.
		//System.out.println(Persistence.getPersistenceUtil());
		emFactory = Persistence.createEntityManagerFactory("mappy");
		
	}

	public EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}

	public void close() {
		emFactory.close();
	}
}