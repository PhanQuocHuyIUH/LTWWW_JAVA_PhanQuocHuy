package iuh.fit.se.mssv22714321_phanquochuy_tuan04.bai1.model;

import lombok.Data;

import java.util.Date;

/**
 * @author: QUOC HUY
 * @date: 18/09/2025
 */

@Data
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date birthday;
    private Boolean gender;
}
