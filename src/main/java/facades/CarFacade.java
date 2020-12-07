package facades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;



public class CarFacade {
    
    private static CarFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private CarFacade() {}
    
    public static CarFacade emfManager(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CarFacade();
        }
        return instance;
    }
    
    public long getPlateCount(){
        EntityManager em = emf.createEntityManager();
        try{
            long renameMeCount = (long)em.createQuery("SELECT COUNT(r) FROM Car r").getSingleResult();
            return renameMeCount;
        }finally{  
            em.close();
        }
        
    }
}