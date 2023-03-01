package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Menus;
import SpringProject.Entity.Posts;
import SpringProject.Entity.Rooms;
import SpringProject.Entity.Services;
import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;

@Service
public interface IHome {
	@Autowired
	public List<Slides> GetDataSlides();

	@Autowired
	public List<TypeRoom> GetDataTypeRoom();

	@Autowired
	public List<Menus> GetDataMenus();

	@Autowired
	public List<Services> GetDataServices();

	@Autowired
	public List<Posts> GetDataPosts();

	@Autowired
	public List<Posts> GetDataNewPosts();

	@Autowired
	public List<Rooms> GetDataNormalRoom();

	@Autowired
	public List<Rooms> GetDataNormalRoomPaginate(int start, int totalPage);

	@Autowired
	public List<Rooms> GetDataVipRoom();

	@Autowired
	public List<Rooms> GetDataHomestayRoom();

	@Autowired
	public List<Rooms> GetDataNewRooms();

	@Autowired
	public List<Rooms> GetDataRoom(int id);
}
