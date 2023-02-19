package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Slides;

@Service
public interface IHome {
	@Autowired
	public List<Slides> GetDataSlides();
}
