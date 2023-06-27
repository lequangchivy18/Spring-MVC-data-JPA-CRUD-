package vy.com.fa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Toanha")
public class ToaNha {
	@Id
	private String matoanha;
	@Column(columnDefinition = "nvarchar(255)")
	private String tentoanha;
	@OneToMany(mappedBy = "matoanha", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<TTPhiChungCu> ttPhiChungCus;
	
	
	public ToaNha() {
		super();
	}
	public ToaNha(String matoanha, String tentoanha) {
		super();
		this.matoanha = matoanha;
		this.tentoanha = tentoanha;
	}
	public String getMatoanha() {
		return matoanha;
	}
	public void setMatoanha(String matoanha) {
		this.matoanha = matoanha;
	}
	public String getTentoanha() {
		return tentoanha;
	}
	public void setTentoanha(String tentoanha) {
		this.tentoanha = tentoanha;
	}
	
}
