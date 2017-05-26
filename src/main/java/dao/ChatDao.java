package dao;

import javax.persistence.EntityManager;

import base.PersistenceManager;
import model.ChatM;

public class ChatDao {

	public void saveChat(ChatM chatM) {
		
		
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction()
	        .begin();
	    if((findChatById(chatM))==null){

		    em.persist(chatM);
	    }
	    
	    em.getTransaction()
	        .commit();
	    em.close();
	   // PersistenceManager.INSTANCE.close();
	    
		
	}
	
	public ChatM findChatById(ChatM chatM){
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    return em.find(ChatM.class, chatM.getId());
	}
}
