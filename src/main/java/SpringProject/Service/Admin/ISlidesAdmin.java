package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Slides;

@Service
public interface ISlidesAdmin {
	@Autowired
	public int addSlide(Slides slide);

	@Autowired
	public int deleteSlide(int id);

	@Autowired
	public Slides getSlide(int id);

	@Autowired
	public int updateSlide(Slides slide);
}
