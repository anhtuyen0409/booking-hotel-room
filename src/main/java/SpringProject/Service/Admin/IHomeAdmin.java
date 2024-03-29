package SpringProject.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Booking;
import SpringProject.Entity.Menus;
import SpringProject.Entity.Posts;
import SpringProject.Entity.Rooms;
import SpringProject.Entity.Services;
import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;
import SpringProject.Entity.Users;

@Service
public interface IHomeAdmin {
	@Autowired
	public List<Slides> GetDataSlides();

	@Autowired
	public List<Posts> GetDataPosts();

	@Autowired
	public List<Menus> GetDataMenus();

	@Autowired
	public List<TypeRoom> GetDataTypeRoom();

	@Autowired
	public List<Rooms> GetDataRooms();

	@Autowired
	public List<Services> GetDataServices();

	@Autowired
	public List<Users> GetDataUsers();
	
	@Autowired
	public List<Booking> GetDataBooking();
}
