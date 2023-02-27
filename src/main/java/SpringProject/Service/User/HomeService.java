package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.MenusDAO;
import SpringProject.DAO.PostsDAO;
import SpringProject.DAO.RoomsDAO;
import SpringProject.DAO.ServicesDAO;
import SpringProject.DAO.SlidesDAO;
import SpringProject.DAO.TypeRoomDAO;
import SpringProject.Entity.Menus;
import SpringProject.Entity.Posts;
import SpringProject.Entity.Rooms;
import SpringProject.Entity.Services;
import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;

@Service
public class HomeService implements IHome {
	@Autowired
	private SlidesDAO slidesDao;
	@Autowired
	private TypeRoomDAO typeRoomDao;
	@Autowired
	private MenusDAO menusDao;
	@Autowired
	private ServicesDAO servicesDao;
	@Autowired
	private PostsDAO postsDao;
	@Autowired
	private RoomsDAO roomsDao;

	public List<Slides> GetDataSlides() {

		return slidesDao.GetDataSlides();
	}

	public List<TypeRoom> GetDataTypeRoom() {

		return typeRoomDao.GetDataTypeRoom();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	public List<Services> GetDataServices() {
		return servicesDao.GetDataServices();
	}

	public List<Posts> GetDataPosts() {
		return postsDao.GetDataPosts();
	}

	public List<Rooms> GetDataNormalRooms() {
		return roomsDao.GetDataNormalRooms();
	}

	public List<Rooms> GetDataVipRooms() {
		return roomsDao.GetDataVipRooms();
	}

	public List<Rooms> GetDataHomestayRooms() {
		return roomsDao.GetDataHomestayRooms();
	}

	public List<Rooms> GetDataNewRooms() {
		return roomsDao.GetDataNewRooms();
	}

	public List<Posts> GetDataNewPosts() {
		return postsDao.GetDataNewPosts();
	}

}
