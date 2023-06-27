package vy.com.fa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TTPhiChungCu")
public class TTPhiChungCu {
	@Id
	@Column(columnDefinition = "nvarchar(255)")
	private String matt;
	
	@Column(columnDefinition = "nvarchar(255)")
	private String macanho;
	
	@Column
	private int dientich;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "matoanha", nullable = false)
	private ToaNha matoanha;
	
	@Column(columnDefinition = "nvarchar(255)")
	private String tenchuho;
	
	@Column(columnDefinition = "nvarchar(255)")
	@NotBlank(message = "Chưa nhập số điện thoại")
	@Pattern(message = "Số điện thoại của quý khách chưa đúng", regexp = "()|(0[0-9]{9}$)")
	private String sodienthoai;
	
	@Column(columnDefinition = "date")
	@NotNull(message = "Chưa nhập ngày")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate thangbd;
	
	@Column
	private int sothang;
	
	@Column(columnDefinition = "date")
	@NotNull(message = "Chưa nhập ngày")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaydong;
	
	@Column(columnDefinition = "float")
	private double tongtien;

	public TTPhiChungCu() {
		super();
	}

	public TTPhiChungCu(String matt, String macanho, int dientich, ToaNha matoanha, String tenchuho, String sodienthoai,
			LocalDate thangbd, int sothang, LocalDate ngaydong, double tongtien) {
		super();
		this.matt = matt;
		this.macanho = macanho;
		this.dientich = dientich;
		this.matoanha = matoanha;
		this.tenchuho = tenchuho;
		this.sodienthoai = sodienthoai;
		this.thangbd = thangbd;
		this.sothang = sothang;
		this.ngaydong = ngaydong;
		this.tongtien = tongtien;
	}

	public String getMatt() {
		return matt;
	}

	public void setMatt(String matt) {
		this.matt = matt;
	}

	public String getMacanho() {
		return macanho;
	}

	public void setMacanho(String macanho) {
		this.macanho = macanho;
	}

	public int getDientich() {
		return dientich;
	}

	public void setDientich(int dientich) {
		this.dientich = dientich;
	}

	public ToaNha getMatoanha() {
		return matoanha;
	}

	public void setMatoanha(ToaNha matoanha) {
		this.matoanha = matoanha;
	}

	public String getTenchuho() {
		return tenchuho;
	}

	public void setTenchuho(String tenchuho) {
		this.tenchuho = tenchuho;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public LocalDate getThangbd() {
		return thangbd;
	}

	public void setThangbd(LocalDate thangbd) {
		this.thangbd = thangbd;
	}

	public int getSothang() {
		return sothang;
	}

	public void setSothang(int sothang) {
		this.sothang = sothang;
	}

	public LocalDate getNgaydong() {
		return ngaydong;
	}

	public void setNgaydong(LocalDate ngaydong) {
		this.ngaydong = ngaydong;
	}

	public double getTongtien() {
		return tongtien;
	}

	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}

	@Override
	public String toString() {
		return "TTPhiChungCu [matt=" + matt + ", macanho=" + macanho + ", dientich=" + dientich + ", matoanha="
				+ matoanha + ", tenchuho=" + tenchuho + ", sodienthoai=" + sodienthoai + ", thangbd=" + thangbd
				+ ", sothang=" + sothang + ", ngaydong=" + ngaydong + ", tongtien=" + tongtien + "]";
	}
	
	

}
