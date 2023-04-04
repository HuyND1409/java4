package repository;

import domain_model.NSXDomain;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class NSXRepository {
    private Session hSS;

    public NSXRepository(){
        this.hSS = HibernateUtil.getFACTORY().openSession();
    }

    public void insert(NSXDomain nsx){
        Transaction transaction = hSS.getTransaction();
        try{
            transaction.begin();
            this.hSS.persist(nsx);
            transaction.commit();
        }catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void update(NSXDomain nsx){
        Transaction transaction = hSS.getTransaction();
        try{
            transaction.begin();
            this.hSS.merge(nsx);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void delete(NSXDomain nsx){
        Transaction transaction = hSS.getTransaction();
        try{
            transaction.begin();
            this.hSS.delete(nsx);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<NSXDomain> findAll(){
        String hql="SELECT obj FROM NSXDomain obj";
        TypedQuery<NSXDomain> query = this.hSS.createQuery(hql,NSXDomain.class);
        return query.getResultList();    }
    public NSXDomain findByMa(String ma){
        String hql =" SELECT obj FROM NSXDomain obj where obj.Ma=?1";
        TypedQuery<NSXDomain> query=this.hSS.createQuery(hql,NSXDomain.class);
        query.setParameter(1,ma);
        return  query.getSingleResult();
    }

}
