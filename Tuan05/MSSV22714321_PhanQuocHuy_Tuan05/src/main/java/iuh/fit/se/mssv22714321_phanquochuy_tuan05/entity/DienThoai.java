package iuh.fit.se.mssv22714321_phanquochuy_tuan05.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: QUOC HUY
 * date: 25/09/2025
 */
@Entity
@Table(name = "dien_thoai")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DienThoai {
    @Id
    private Integer maDT;
    private String tenDT;
    private Integer namSanXuat;
    private String cauHinh;
    private String hinhAnh;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maNCC", nullable = false)
    private NhaCungCap nhaCungCap;
}
