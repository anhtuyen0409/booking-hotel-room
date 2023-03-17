package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.SlidesDAO;
import SpringProject.Entity.Slides;

@Service
public class SlidesAdminService implements ISlidesAdmin {
	@Autowired
	private SlidesDAO slidesDAO;

	public int addSlide(Slides slide) {
		return slidesDAO.addSlide(slide);
	}

	public int deleteSlide(int id) {
		return slidesDAO.deleteSlide(id);
	}

	public Slides getSlide(int id) {
		Slides slide = slidesDAO.getSlide(id);
		if (slide != null) {
			return slide;
		}
		return null;
	}

	public int updateSlide(Slides slide) {
		return slidesDAO.updateSlide(slide);
	}

}
