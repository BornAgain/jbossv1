package metier.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Form implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private String heading;
	private String subHeading;
	private String footer;
	private Date dueDate;
	private Boolean model;
	private int nbLines;
	private int nbCols;
	private int lineBegan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequency_id", nullable = true)	
	private Frequency frequency;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "institution_id", nullable = true)
	private Institution institution;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Cell> cells = new ArrayList<Cell>();		
	
	
	public List<Cell> getCells() {
		return cells;
	}
	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}
	public void addCell(Cell cell) {
		this.cells.add(cell);
		cell.setRam_form(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getSubHeading() {
		return subHeading;
	}
	public void setSubHeading(String subHeading) {
		this.subHeading = subHeading;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getModel() {
		return model;
	}
	public void setModel(Boolean model) {
		this.model = model;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public Institution getInstitution() {
		return institution;
	}
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}
	public Long getId() {
		return id;
	}
	
	public int getNbLines() {
		return this.nbLines;
	}
	public void setNbLines(int nbLines) {
		this.nbLines = nbLines;
	}
	public int getNbCols() {
		return this.nbCols;
	}
	public void setNbCols(int nbCols) {
		this.nbCols = nbCols;
	}
	public int getLineBegan() {
		return this.lineBegan;
	}
	public void setLineBegan(int lineBegan) {
		this.lineBegan = lineBegan;
	}	
	
	
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", model=" + model
				//+ ", frequency=" + frequency + ", institution=" + institution
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form other = (Form) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
}
