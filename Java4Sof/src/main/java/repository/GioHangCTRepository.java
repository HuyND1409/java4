package repository;

import viewmodel.QLGioHangChiTiet;

import java.util.ArrayList;

public class GioHangCTRepository {
private ArrayList<QLGioHangChiTiet> litsSanPhams ;
    public GioHangCTRepository() {
        litsSanPhams = new ArrayList<>();
    }
    public  void insert(QLGioHangChiTiet sp){
        litsSanPhams.add(sp);
    }

    public void update(QLGioHangChiTiet sp){
        for (int i = 0; i < litsSanPhams.size(); i++) {
            QLGioHangChiTiet item = litsSanPhams.get(i);
            if(item.getIdGioHang().equals(sp.getIdGioHang())){
                litsSanPhams.set(i,sp);
            }
        }
    }
    public void delete(QLGioHangChiTiet sp){
        for (int i = 0; i < litsSanPhams.size(); i++) {
            QLGioHangChiTiet item = litsSanPhams.get(i);
            if(item.getIdGioHang().equals(sp.getIdGioHang())){
                litsSanPhams.remove(i);
            }
        }
    }
    public  ArrayList<QLGioHangChiTiet > findAll(){
        return litsSanPhams;
    }
    public  QLGioHangChiTiet findByMa(String ma){
        for (int i = 0; i < litsSanPhams.size(); i++) {
            QLGioHangChiTiet item = litsSanPhams.get(i);
            if(item.getIdGioHang().equals(ma)){
                return litsSanPhams.get(i);
            }
        }
        return null;
    }
}
//    private Session hSS;
//
//    public GioHangCTRepository() {
//        this.hSS = HibernateUtil.getFACTORY().openSession();
//    }
//    public void update(GioHangChiTietDomain ghct){
//        Transaction transaction = this.hSS.getTransaction();
//        try {
//            transaction.begin();
//            this.hSS.merge(ghct);
//            transaction.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            transaction.rollback();
//        }
//    }
//    public void insert(GioHangChiTietDomain ghct) {
//        Transaction transaction = this.hSS.getTransaction();
//        try{
//            transaction.begin();
//            this.hSS.persist(ghct);
//            transaction.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            transaction.rollback();
//        }
//    }
//    public void delete(GioHangChiTietDomain ghct) {
//        Transaction transaction = this.hSS.getTransaction();
//        try{
//            transaction.begin();
//            this.hSS.delete(ghct);
//            transaction.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            transaction.rollback();
//        }
//    }
//    public GioHangChiTietDomain findById(UUID id) {
//        return this.hSS.find(GioHangChiTietDomain.class,id);
//    }
//
//    public List<GioHangChiTietDomain> findAll(){
//        String hql="select o from GioHangChiTietDomain o";
//        TypedQuery<GioHangChiTietDomain> query = this.hSS.createQuery(hql,GioHangChiTietDomain.class);
//        return query.getResultList();    }
//    public CuaHangDomain findByMa(String ma){
//        String hql =" SELECT obj FROM CuaHangDomain obj where obj.Ma=?1";
//        TypedQuery<CuaHangDomain> query=this.hsession.createQuery(hql,CuaHangDomain.class);
//        query.setParameter(1,ma);
//        return  query.getSingleResult();
//    }