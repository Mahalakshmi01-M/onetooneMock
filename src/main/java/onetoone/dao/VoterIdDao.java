package onetoone.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.PersonDto;
import onetoone.dto.VoterDto;


public class VoterIdDao {
	public void savevoterCard(int personId, VoterDto voterId) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		PersonDto dbPerson = entityManager.find(PersonDto.class, personId);
		if(dbPerson != null)
		{

			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(voterId);
		    dbPerson.setVoterId(voterId);
		    entityManager.merge(dbPerson);
		    
		    entityTransaction.commit();
		}
		else {

			System.out.println("Sorry invalid person ID");
		}
	}
	 public void updatevoterCard(int vId,VoterDto voterId) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 VoterDto dbVoterDto = entityManager.find(VoterDto.class, voterId);
		 if(dbVoterDto!=null)
		 {

			 EntityTransaction entityTransaction=entityManager.getTransaction();
			 entityTransaction.begin();
			 voterId.setVoterCardId(vId);
			 entityManager.merge(voterId);
			 entityTransaction.commit();
		 }
		 else {
			 System.out.println("Sorry adharcard id is not present");
		 }
	 }
	 public void findvoterCard(int voterId) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 VoterDto dbVoterDto = entityManager.find(VoterDto.class,voterId);

		 if(dbVoterDto!=null) {
			 System.out.println(dbVoterDto);
		 }
		 else {
			 System.out.println("Sorry ID is not present");
		 }
	 }
	 public void deletevoterCard(int voterId) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 VoterDto dbVoterDto = entityManager.find(VoterDto.class,voterId);
		 if(dbVoterDto!=null) {
			 EntityTransaction entityTransaction=entityManager.getTransaction();
			 entityTransaction.begin();
			 entityManager.remove(dbVoterDto);
			 entityTransaction.commit();
		 }
		 else {
		 }
	 }
	}


