package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperServices;
import SpringProject.Entity.Services;

@Repository
public class ServicesDAO extends BaseDAO {
	public List<Services> GetDataServices() {
		List<Services> list = new ArrayList<Services>();
		String sql = "SELECT * FROM services WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperServices());
		return list;
	}

	// thêm service
	public int addService(Services service) {
		String sql = "INSERT INTO services (name, img, is_delete) " + "VALUES ('" + service.getName() + "', '"
				+ service.getImg() + "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá service
	public int deleteService(int id) {
		String sql = "UPDATE services SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy service
	public Services getService(int id) {
		String sql = "SELECT * FROM services WHERE id = " + id;
		List<Services> result = _jdbcTemplate.query(sql, new MapperServices());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa service
	public int updateService(Services service) {
		String sql = "UPDATE services SET name = '" + service.getName() + "', img = '" + service.getImg()
				+ "' WHERE id = " + service.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
