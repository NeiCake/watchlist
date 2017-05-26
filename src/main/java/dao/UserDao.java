//package dao;
//
//import javax.persistence.EntityManager;
//
//import base.PersistenceManager;
//import model.UserM;
//import tmdb.api.model.TvShowWithDetails;
//
//public class UserDao {
//	public void updateShowList(TvShowWithDetails show){
//		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//	    em.getTransaction()
//	        .begin();
//	   
//	    
//	    em.getTransaction()
//	        .commit();
//	    em.close();
//	}
//	
//	
//	public UserM findUserById(int id){
//		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//	    return em.find(UserM.class, id);
//	}
//
//}
