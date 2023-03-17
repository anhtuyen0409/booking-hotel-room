package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperSlides;
import SpringProject.Entity.Slides;

@Repository
public class SlidesDAO extends BaseDAO {

	public List<Slides> GetDataSlides() {
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}

	// thêm slide
	public int addSlide(Slides slide) {
		String sql = "INSERT INTO slides (img, caption, content, is_delete) " + "VALUES ('" + slide.getImg() + "', '"
				+ slide.getCaption() + "', '" + slide.getContent() + "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá slide
	public int deleteSlide(int id) {
		String sql = "UPDATE slides SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy slide
	public Slides getSlide(int id) {
		String sql = "SELECT * FROM slides WHERE id = " + id;
		List<Slides> result = _jdbcTemplate.query(sql, new MapperSlides());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa slide
	public int updateSlide(Slides slide) {
		String sql = "UPDATE slides SET img = '" + slide.getImg() + "', caption = '" + slide.getCaption()
				+ "', content = '" + slide.getContent() + "' WHERE id = " + slide.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}

}
