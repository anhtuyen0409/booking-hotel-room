package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.SlidesDAO;
import SpringProject.Entity.Slides;

@Service
public class HomeService implements IHome{
	@Autowired
	private SlidesDAO slidesDao;

	public List<Slides> GetDataSlides() {
		
		return slidesDao.GetDataSlides();
	}

}
