package vy.com.fa.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class TTPhiChungCuDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Chưa nhập mã thông tin")
	private String matt;

	@NotBlank(message = "Chưa nhập mã căn hộ")
	private String macanho;

	@NotNull(message = "Chưa nhập diện tích")
	private int dientich;

	@NotBlank(message = "Chưa nhập mã toà nhà")
	private String matoanha;

	@NotBlank(message = "Chưa nhập tên chủ hộ")
	private String tenchuho;

	@NotBlank(message = "Chưa nhập số điện thoại")
	@Pattern(message = "Số điện thoại của quý khách chưa đúng", regexp = "()|(0[0-9]{9}$)")
	private String sodienthoai;

	@NotNull(message = "Chưa nhập ngày")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate thangbd;
	
	@NotNull(message = "Chưa nhập số tháng")
	private int sothang;

	@NotNull(message = "Chưa nhập ngày")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaydong;

	private double tongtien;

	public TTPhiChungCuDTO() {
		super();
	}

	public TTPhiChungCuDTO(String matt, String macanho, int dientich, String matoanha, String tenchuho,
			String sodienthoai, LocalDate thangbd, int sothang, LocalDate ngaydong, double tongtien) {
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

	public String getMatoanha() {
		return matoanha;
	}

	public void setMatoanha(String matoanha) {
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

}
