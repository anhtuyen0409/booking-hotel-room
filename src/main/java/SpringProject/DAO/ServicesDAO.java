package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperServices;
import SpringProject.Entity.Services;

@Repository
public class ServicesDAO extends BaseDAO{
	public List<Services> GetDataServices(){
		List<Services> list = new ArrayList<Services>();
		String sql = "SELECT * FROM services";
		list = _jdbcTemplate.query(sql, new MapperServices());
		return list;
	}
}
