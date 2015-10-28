package metier.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entity.Cell;

@Stateless
public class CellSession implements ICell{

	@PersistenceContext(unitName="UP_TREPORTING")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cell> findAll() {
		Query qr = em.createQuery("FROM Cell ");
		return qr.getResultList();
		
	}
	@Override
	public void persist(Cell c) {
		em.persist(c);
		
	}

}
