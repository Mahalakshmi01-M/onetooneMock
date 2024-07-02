package onetoone.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import onetoone.dto.PersonDto;


	public class PersonnDao {
		public void savePerson(PersonDto person) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
		}
		public void updatePerson(int personId,PersonDto person)
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maha");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			PersonDto dbPerson= entityManager.find(PersonDto.class, personId);
			if(dbPerson!=null)
			{
//				person is present then i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
//				person=name,address
				person.setPersonId(personId);
//				person=id name address
				person.setVoterId(dbPerson.getVoterId());
				entityManager.merge(person);
				entityTransaction.commit();
			}
			else {
				System.out.println("Sorry person ID is not present");
			}
		}
		public void findPerson(int personId) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maha");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			PersonDto dbPerson= entityManager.find(PersonDto.class, personId);
			if(dbPerson!=null) {
				System.out.println(dbPerson);
			}
			else {
				System.out.println("Sorry Id is not present ");
			}
		}
		public void deletePerson(int personId)
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maha");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			PersonDto dbPerson = entityManager.find(PersonDto.class, personId);
			if(dbPerson!=null) {
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.remove(dbPerson);
				entityTransaction.commit();
				
			}
			else {
				System.out.println("Sorry Id is not present to delete ");
			}
			
		}
		
	
	}

