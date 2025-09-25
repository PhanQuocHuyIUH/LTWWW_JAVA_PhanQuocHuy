package iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
@Entity
@Table(name = "nha_cung_cap")
@Data
public class NhaCungCap {
    @Id
    private Integer maNCC;
    private String tenNCC;
    private String diaChi;
    private String soDienThoai;

    @OneToMany(mappedBy = "nhaCungCap", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DienThoai> dsDienThoai;
}
