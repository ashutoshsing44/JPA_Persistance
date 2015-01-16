package jpa;

import java.util.ArrayList;
import java.util.List;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.persistence.EntityTransaction;
//import jpa.*;
//import ashu.sqlconnection.MySqlConnectionSetup;

import javax.persistence.EntityManagerFactory;
//import oracle.toplink.essentials.ejb.cmp3.EntityManager;
/**
 * Session Bean implementation class Students_Records_EJB
 */

//@EJB(mappedName="Students_Records_EJB")
@Stateless
public class Students_Records_EJB implements Students_Records_EJBRemote{

    /**
     * Default constructor. 
     */
	 protected EntityManagerFactory emf;
	  @PersistenceContext(unitName="Students_Records_EJB")
	   EntityManager em;
	  //See more at: http://middlewaremagic.com/jboss/?tag=toplink#sthash.fn8OB1oF.dpuf'
	  String sql;
    public Students_Records_EJB() {
        // TODO Auto-generated constructor stub
    }
   // protected EntityManagerFactory emf;
    
    public EntityManagerFactory getEMF (){
       if (emf == null){
           emf = Persistence.createEntityManagerFactory("default", new java.util.HashMap());
       }
       return emf;
   }
	@Override
	public void saveStudentRecord(RegitrationsBean inputBean) 
	{
		
		 System.out.println("Calling JPA for save student bean ");
	     em.getTransaction().begin();
         em.persist(inputBean);
         em.getTransaction().commit();
         System.out.println("All Saved...");
		
	}

	

}
