package repository;

import domain_model.DongSPDomain;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class DongSPRepository {
    Session hss ;
    public DongSPRepository (){
        this.hss = HibernateUtil.getFACTORY().openSession();
    }
     public void insert (DongSPDomain dsp){
         Transaction transaction = this.hss.getTransaction();
         try {
             transaction.begin();
             this.hss.persist(dsp);
             transaction.commit();
         }catch (Exception e){
             e.printStackTrace();
             transaction.rollback();
         }
     }
     public void delete(DongSPDomain dsp){
        Transaction transaction = hss.getTransaction();
        try {
            transaction.begin();
            this.hss.delete(dsp);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
     }
    public void update(DongSPDomain dsp){
        Transaction transaction = hss.getTransaction();
        try {
            transaction.begin();
            this.hss.merge(dsp);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<DongSPDomain> findAll(){
        String hql="SELECT obj FROM DongSPDomain obj";
        TypedQuery<DongSPDomain> query = this.hss.createQuery(hql,DongSPDomain.class);
        return query.getResultList();    }
    public DongSPDomain findByMa(String ma){
        String hql =" SELECT obj FROM DongSPDomain obj where obj.Ma=?1";
        TypedQuery<DongSPDomain> query=this.hss.createQuery(hql,DongSPDomain.class);
        query.setParameter(1,ma);
        return  query.getSingleResult();
    }
}
