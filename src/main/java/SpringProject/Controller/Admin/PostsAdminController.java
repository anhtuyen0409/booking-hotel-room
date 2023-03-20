package SpringProject.Controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Entity.Posts;
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.PostsAdminService;

@Controller
public class PostsAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	PostsAdminService postAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-bai-viet")
	public ModelAndView PostsList() {
		_myShare.setViewName("admin/bai-viet-admin");
		_myShare.addObject("posts", homeAdminService.GetDataPosts());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-post", method = RequestMethod.GET)
	public ModelAndView AddPost() {
		_myShare.setViewName("admin/add-post-admin");
		_myShare.addObject("post", new Posts());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-post", method = RequestMethod.POST)
	public ModelAndView createPost(@ModelAttribute("post") Posts post, @RequestParam("files_1") MultipartFile files_1,
			@RequestParam("files_2") MultipartFile files_2, @RequestParam("files_3") MultipartFile files_3,
			@RequestParam("files_4") MultipartFile files_4) {
		String nameImage_1 = uploadFile(files_1);
		String nameImage_2 = uploadFile(files_2);
		String nameImage_3 = uploadFile(files_3);
		String nameImage_4 = uploadFile(files_4);
		if (nameImage_1 != null) {
			post.setImg_1(nameImage_1);
		}
		if (nameImage_2 != null) {
			post.setImg_2(nameImage_2);
		}
		if (nameImage_3 != null) {
			post.setImg_3(nameImage_3);
		}
		if (nameImage_4 != null) {
			post.setImg_4(nameImage_4);
		}
		int count = postAdminService.addPost(post);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-bai-viet");
		return _myShare;
	}

	private String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// String rootPath = System.getProperty("catalina.home");
				File dir = new File("F:/JavaWeb/SpringProject/src/main/webapp/assets/user/img/post");
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String name = "post-" + String.valueOf(new Date().getTime()) + ".jpg";
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				System.out.println("Path: " + serverFile.getPath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				return name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {

		}
		return null;
	}

	@RequestMapping(value = "/quan-tri/id-post={id}", method = RequestMethod.GET)
	public ModelAndView deletePost(@PathVariable int id) {
		int count = postAdminService.deletePost(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-bai-viet");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-post/id-post={id}", method = RequestMethod.GET)
	public ModelAndView editPost(@PathVariable int id) {
		_myShare.addObject("postDetail", postAdminService.getPost(id));
		_myShare.setViewName("admin/post-detail");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-post/id-post={id}", method = RequestMethod.POST)
	public ModelAndView updatePost(@ModelAttribute("postDetail") Posts post,
			@RequestParam("files_1") MultipartFile files_1, @RequestParam("files_2") MultipartFile files_2,
			@RequestParam("files_3") MultipartFile files_3, @RequestParam("files_4") MultipartFile files_4) {
		String nameImage_1 = uploadFile(files_1);
		String nameImage_2 = uploadFile(files_2);
		String nameImage_3 = uploadFile(files_3);
		String nameImage_4 = uploadFile(files_4);
		if (nameImage_1 != null) {
			post.setImg_1(nameImage_1);
		}
		if (nameImage_2 != null) {
			post.setImg_2(nameImage_2);
		}
		if (nameImage_3 != null) {
			post.setImg_3(nameImage_3);
		}
		if (nameImage_4 != null) {
			post.setImg_4(nameImage_4);
		}
		int count = postAdminService.updatePost(post);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-bai-viet");
		return _myShare;
	}
}
