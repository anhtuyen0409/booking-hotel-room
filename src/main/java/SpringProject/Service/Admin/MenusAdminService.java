package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.MenusDAO;
import SpringProject.Entity.Menus;

@Service
public class MenusAdminService implements IMenusAdmin {

	@Autowired
	private MenusDAO menusDAO;

	public int addMenu(Menus menu) {
		return menusDAO.addMenu(menu);
	}

	public int deleteMenu(int id) {
		return menusDAO.deleteMenu(id);
	}

	public Menus getMenu(int id) {
		Menus menu = menusDAO.getMenu(id);
		if (menu != null) {
			return menu;
		}
		return null;
	}

	public int updateMenu(Menus menu) {
		return menusDAO.updateMenu(menu);
	}

}
