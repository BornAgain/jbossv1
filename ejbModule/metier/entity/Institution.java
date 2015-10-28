package metier.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Institution {
	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private int type;
	private String name;
	private int nbreEmployes;
	private int nbreBranches;
	private String externalAuditors;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Form> forms = new ArrayList<Form>();		
	
	
	public List<Form> getForm() {
		return forms;
	}
	public void setCells(List<Form> forms) {
		this.forms = forms;
	}
	public void addCell(Form form) {
		this.forms.add(form);
		form.setInstitution(this);
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbreEmployes() {
		return nbreEmployes;
	}
	public void setNbreEmployes(int nbreEmployes) {
		this.nbreEmployes = nbreEmployes;
	}
	public int getNbreBranches() {
		return nbreBranches;
	}
	public void setNbreBranches(int nbreBranches) {
		this.nbreBranches = nbreBranches;
	}
	public String getExternalAuditors() {
		return externalAuditors;
	}
	public void setExternalAuditors(String externalAuditors) {
		this.externalAuditors = externalAuditors;
	}

	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Institution [id=" + id + ", code=" + code + ", type=" + type
				+ ", name=" + name + "]";
	}


	public Institution() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
