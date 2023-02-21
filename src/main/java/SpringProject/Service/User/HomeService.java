package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.MenusDAO;
import SpringProject.DAO.SlidesDAO;
import SpringProject.DAO.TypeRoomDAO;
import SpringProject.Entity.Menus;
import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;

@Service
public class HomeService implements IHome{
	@Autowired
	private SlidesDAO slidesDao;
	@Autowired
	private TypeRoomDAO typeRoomDao;
	@Autowired
	private MenusDAO menusDao;

	public List<Slides> GetDataSlides() {
		
		return slidesDao.GetDataSlides();
	}

	public List<TypeRoom> GetDataTypeRoom() {
		
		return typeRoomDao.GetDataTypeRoom();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

}
