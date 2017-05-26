//package dao;
//
//import javax.persistence.EntityManager;
//
//import base.PersistenceManager;
//import tmdb.api.model.TvShowWithDetails;
//
//public class TvShowWithDetailsDao {
//	
//
//	public void saveTvShowWithDetails(TvShowWithDetails show) {
//		
//		
//		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//	    em.getTransaction()
//	        .begin();
//	    if((findTvShowWithDetailsById(show))==null){
//
//		    em.persist(show);
//	    }
//	    
//	    em.getTransaction()
//	        .commit();
//	    em.close();
//	   // PersistenceManager.INSTANCE.close();
//	    
//		
//	}
//	
//	public TvShowWithDetails findTvShowWithDetailsById(TvShowWithDetails show){
//		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//	    return em.find(TvShowWithDetails.class, show.getId());
//	}
//
//}
