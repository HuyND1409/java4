package repository;

import domain_model.CuaHangDomain;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class CuaHangRepository {
    private Session hss;

    public CuaHangRepository() {
        this.hss = HibernateUtil.getFACTORY().openSession();
    }

    public void insert(CuaHangDomain ch) {
        Transaction transaction = this.hss.getTransaction();
        try {
            transaction.begin();
            this.hss.persist(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(CuaHangDomain ch) {
        Transaction transaction = this.hss.getTransaction();
        try {
            transaction.begin();
            this.hss.merge(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(CuaHangDomain ch) {
        Transaction transaction = this.hss.getTransaction();
        try {
            transaction.begin();
            this.hss.delete(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public List<CuaHangDomain> findAll() {
        String hql = "Select obj From CuaHangDomain obj";
        TypedQuery<CuaHangDomain> query = this.hss.createQuery(hql, CuaHangDomain.class);
        return query.getResultList();
    }

    public CuaHangDomain findByMa(String ma) {
        String hql = "SELECT obj FROM CuaHangDomain obj where obj.Ma=?1";
        TypedQuery<CuaHangDomain> query = this.hss.createQuery(hql, CuaHangDomain.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
