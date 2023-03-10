package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Menus;

@Service
public interface IMenusAdmin {
	@Autowired
	public int addMenu(Menus menu);
	@Autowired
	public int deleteMenu(int id);
	@Autowired
	public Menus getMenu(int id);
	@Autowired
	public int updateMenu(Menus menu);
}
