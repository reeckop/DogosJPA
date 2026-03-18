package itson.dogosjpa;

import jakarta.persistence.*;

/**
 *
 * @author Ricardo
 */
public class DogosJPA {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DogosPU");
        EntityManager em = emf.createEntityManager();

    }
}
