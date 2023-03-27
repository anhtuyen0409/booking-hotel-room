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

	public List<Rooms> GetDataNewRooms() {
		return roomsDao.GetDataNewRooms();
	}

	public List<Posts> GetDataNewPosts() {
		return postsDao.GetDataNewPosts();
	}

	public List<Rooms> GetDataNormalRoom() {
		return roomsDao.GetDataNormalRoom();
	}

	public List<Rooms> GetDataNormalRoomPaginate(int start, int totalPage) {
		return roomsDao.GetDataNormalRoomPaginate(start, totalPage);
	}

	public List<Rooms> GetDataVipRoom() {
		return roomsDao.GetDataVipRoom();
	}

	public List<Rooms> GetDataVipRoomPaginate(int start, int totalPage) {
		return roomsDao.GetDataVipRoomPaginate(start, totalPage);
	}

	public List<Rooms> GetDataHomestayRoom() {
		return roomsDao.GetDataHomestayRoom();
	}

	public List<Rooms> GetDataHomestayRoomPaginate(int start, int totalPage) {
		return roomsDao.GetDataHomestayRoomPaginate(start, totalPage);
	}

	public List<Rooms> GetDataRoom(int id) {
		return roomsDao.GetDataRoom(id);
	}

	public List<Posts> GetDataPostsPaginate(int start, int totalPage) {
		return postsDao.GetDataPostsPaginate(start, totalPage);
	}

	public List<Posts> GetDataPost(int id) {
		return postsDao.GetDataPost(id);
	}
}
