package pe.edu.upc.deudasservice2.dao.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.deudasservice2.dao.GenericDao;
import pe.edu.upc.deudasservice2.view.VwDeuda;
import pe.edu.upc.deudasservice2.view.VwDeudaDetalle;

@Repository
public class GenericDaoImpl implements GenericDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<?> findByNamedQuery(String queryName) throws Exception {
		return entityManager.createNamedQuery(queryName).getResultList();
	}

	@Override
	public int ultimo(String id, String objeto) throws Exception {
		Query q = entityManager.createQuery("SELECT max(" + id + ") FROM " + objeto + " x");
		Integer max = (Integer) q.getSingleResult();
		int result = 0;
		if (max != null) {
			result = max.intValue();
		}
		return result;
	}

	@Override
	@Transactional
	public void insert(Object object, Collection<?> collection) throws Exception {
		try {
			entityManager.persist(object);
			for (Iterator<?> it = collection.iterator(); it.hasNext();) {
				Object o = it.next();
				entityManager.persist(o);
				entityManager.flush();
				entityManager.clear();
			}
		} catch (Exception e) {
			throw new Exception("ERROR insert(Object object, Collection collection) : " + e);
		}
	}

	@Override
	public List<VwDeuda> getDeudas(Map<String, Object> params) throws Exception {

		Session session = (Session) entityManager.getDelegate();
		try {
			List<VwDeuda> lista = null;
			lista = session.createNativeQuery("CALL _CON_DEUDA(:id, :idper, :dep, :tel)", VwDeuda.class)
					.setParameter("id", params.get("id"))
					.setParameter("idper", params.get("idper"))
					.setParameter("dep", params.get("dep"))
					.setParameter("tel", params.get("tel"))
					.list();
			return lista;
		} catch (Exception e) {
			throw new Exception("ERROR sp_deuda : " + e);
		}
	}

	@Override
	public List<VwDeudaDetalle> sp_deuda_detalle(int iddeu) throws Exception {
		Session session = (Session) entityManager.getDelegate();
		try {
			List<VwDeudaDetalle> lista = null;
			lista = session.createNativeQuery("CALL _CON_DEUDA_DETALLE(:iddeu)", VwDeudaDetalle.class)
					.setParameter("iddeu", iddeu)
					.list();
			for(VwDeudaDetalle d: lista){
				System.out.println(d.toString());
			}
			return lista;
		} catch (Exception e) {
			throw new Exception("ERROR sp_deuda_detalle : " + e);
		}
	}

}
