package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.User;

@LocalBean
@Stateless
public class UserEJB {

	@PersistenceContext
	EntityManager em;

	public void saveUser(User user) {
		em.merge(user);
	}

	public void delteUser(User user) {
		em.remove(user);
	}

	public List<User> getAll() {
		Query q = em.createQuery("SELECT user FROM User user");
		return (List<User>) q.getResultList();
	}

}
