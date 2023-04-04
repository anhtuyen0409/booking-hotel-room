package SpringProject.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.BookingDAO;
import SpringProject.DAO.MenusDAO;
import SpringProject.DAO.PostsDAO;
import SpringProject.DAO.RoomsDAO;
import SpringProject.DAO.ServicesDAO;
import SpringProject.DAO.SlidesDAO;
import SpringProject.DAO.TypeRoomDAO;
import SpringProject.DAO.UsersDAO;
import SpringProject.Entity.Booking;
import SpringProject.Entity.Menus;
import SpringProject.Entity.Posts;
import SpringProject.Entity.Rooms;
import SpringProject.Entity.Services;
import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;
import SpringProject.Entity.Users;

@Service
public class HomeAdminService implements IHomeAdmin {
	@Autowired
	private PostsDAO postsDao;
	@Autowired
	private SlidesDAO slidesDao;
	@Autowired
	private MenusDAO menusDao;
	@Autowired
	private TypeRoomDAO typeRoomDao;
	@Autowired
	private RoomsDAO roomsDao;
	@Autowired
	private ServicesDAO servicesDao;
	@Autowired
	private UsersDAO usersDao;
	@Autowired
	private BookingDAO bookingDao;

	public List<Posts> GetDataPosts() {
		return postsDao.GetDataPosts();
	}

	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	public List<TypeRoom> GetDataTypeRoom() {
		return typeRoomDao.GetDataTypeRoom();
	}

	public List<Rooms> GetDataRooms() {
		return roomsDao.GetDataRooms();
	}

	public List<Services> GetDataServices() {
		return servicesDao.GetDataServices();
	}

	public List<Users> GetDataUsers() {
		return usersDao.GetDataUsers();
	}

	public List<Booking> GetDataBooking() {
		return bookingDao.GetDataBooking();
	}

}
