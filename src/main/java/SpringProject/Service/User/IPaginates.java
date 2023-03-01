package SpringProject.Service.User;

import org.springframework.stereotype.Service;

import SpringProject.DTO.PaginatesDTO;

@Service
public interface IPaginates {
	public PaginatesDTO GetInfoPaginates(int totalData, int limit, int currentPage);
}
