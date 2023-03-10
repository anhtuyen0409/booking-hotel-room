package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperMenus;
import SpringProject.Entity.Menus;

@Repository
public class MenusDAO extends BaseDAO {

	public List<Menus> GetDataMenus() {
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}

	// thêm menu
	public int addMenu(Menus menu) {
		String sql = "INSERT INTO menus (name, url, is_delete) " + "VALUES ('" + menu.getName() + "', '" + menu.getUrl()
				+ "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá menu
	public int deleteMenu(int id) {
		String sql = "UPDATE menus SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy menu
	public Menus getMenu(int id) {
		String sql = "SELECT * FROM menus WHERE id = " + id;
		List<Menus> result = _jdbcTemplate.query(sql, new MapperMenus());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa menu
	public int updateMenu(Menus menu) {
		String sql = "UPDATE menus SET name = '" + menu.getName() + "', url = '" + menu.getUrl() + "' WHERE id = "
				+ menu.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
