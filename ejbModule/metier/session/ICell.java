package metier.session;

import java.util.List;

import javax.ejb.Local;

import metier.entity.Cell;

@Local
public interface ICell {
	public List<Cell> findAll();
	public void persist(Cell c);
}
