package iuh.fit.se.mssv22714321_phanquochuy_tuan05.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
public class JPAUtil {
    private static final String puName = "default";
    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory(puName);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Khởi tạo EntityManagerFactory thất bại: " + e);
        }
    }

    // Lấy EntityManager từ factory
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Đóng factory khi ứng dụng shutdown
    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }

//    public static void main(String[] args) {
//        JPAUtil.getEntityManager();
//    }
}
