package metier.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/*
 * Les cellules du tableau
 */
@Entity
public class Cell implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ram_value;
	private int ram_type;
	private Boolean head;
	
	// Cell position
	private int ram_column;
	private int ram_line;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "form_id", nullable = true)
	private Form ram_form;

	
	@Override
	public String toString() {
		return "Cell [id=" + id + ", ram_value=" + ram_value + ", ram_type="
				+ ram_type + ", head=" + head + ", ram_column=" + ram_column
				+ ", ram_line=" + ram_line + ", ram_form=" + ram_form + "]";
	}

	public Cell() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Boolean getHead() {
		return head;
	}

	public void setHead(Boolean head) {
		this.head = head;
	}

	public Long getId() {
		return id;
	}
	
	public String getRam_value() {
		return ram_value;
	}

	public void setRam_value(String ram_value) {
		this.ram_value = ram_value;
	}

	public int getRam_type() {
		return ram_type;
	}

	public void setRam_type(int ram_type) {
		this.ram_type = ram_type;
	}

	public int getRam_column() {
		return ram_column;
	}

	public void setRam_column(int ram_column) {
		this.ram_column = ram_column;
	}

	public int getRam_line() {
		return ram_line;
	}

	public void setRam_line(int ram_line) {
		this.ram_line = ram_line;
	}

	public Form getRam_form() {
		return ram_form;
	}

	public void setRam_form(Form ram_form) {
		this.ram_form = ram_form;
	}
	
}
