package iuh.fit.se.thigk.dao;

import iuh.fit.se.thigk.entity.Post;
import iuh.fit.se.thigk.entity.User;
import iuh.fit.se.thigk.util.JPAUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Demo {
    public List<User> getAll() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM User u", User.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public List<User> findByEmail(String email) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class)
                    .setParameter("email", email)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public List<Post> findPostsByUserEmail(String email) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery(
                            "SELECT p FROM Post p WHERE p.user.email = :email", Post.class)
                    .setParameter("email", email)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public static void main(String[] args) {
        Demo userDAO = new Demo();
//        List<User> users = userDAO.getAll();
//
//        for (User user : users) {
//            System.out.println("User ID: " + user.getId() + ", Email: " + user.getEmail());
//        }
//        String searchEmail = "alice@example.com";  // sửa theo data bạn đã insert
//
//        List<User> users = userDAO.findByEmail(searchEmail);
//
//        if (users.isEmpty()) {
//            System.out.println("Không tìm thấy user với email: " + searchEmail);
//        } else {
//            for (User user : users) {
//                System.out.println("User ID: " + user.getId() + " | Email: " + user.getEmail());
//            }
//        }

        String email = "alice@example.com"; // sửa theo data của bạn
        List<Post> posts = userDAO.findPostsByUserEmail(email);

        if (posts.isEmpty()) {
            System.out.println("Không có bài viết nào cho user có email: " + email);
        } else {
            for (Post p : posts) {
                System.out.println("Post: " + p.getTitle() + " | User Email: " + p.getUser().getEmail() + p.toString());
            }
        }

    }
}
