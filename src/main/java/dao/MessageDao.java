package dao;

import javax.persistence.EntityManager;

import base.PersistenceManager;
import io.fouad.jtb.core.beans.Message;
import model.MessageM;

public class MessageDao {

	public void saveMessage(MessageM pMessage) {
	
		System.out.println("getting EM");
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		System.out.println("got the EM......................................");
	    em.getTransaction()
	        .begin();
	    em.persist(pMessage);
	    em.getTransaction()
	        .commit();
	    em.close();
	   // PersistenceManager.INSTANCE.close();
		System.out.println("COMMITEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEED");
		
	}

}
