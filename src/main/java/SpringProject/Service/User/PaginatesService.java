package SpringProject.Service.User;

import org.springframework.stereotype.Service;

import SpringProject.DTO.PaginatesDTO;

@Service
public class PaginatesService implements IPaginates {

	public PaginatesDTO GetInfoPaginates(int totalData, int limit, int currentPage) {
		PaginatesDTO paginates = new PaginatesDTO();
		paginates.setLimit(limit);
		paginates.setTotalPage(setInfoTotalPage(totalData, limit));
		paginates.setCurrentPage(checkCurrentPage(currentPage, paginates.getTotalPage()));
		paginates.setStart(findStart(paginates.getCurrentPage(), limit));
		paginates.setEnd(findEnd(paginates.getStart(), limit, totalData));
		return paginates;
	}

	private int findEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int findStart(int currentPage, int limit) {
		return ((currentPage - 1) * limit);
	}

	private int setInfoTotalPage(int totalData, int limit) {
		int totalPage = 0;
		totalPage = totalData/limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}
	
	public int checkCurrentPage(int currentPage, int totalPage) {
		if(currentPage < 1) {
			return 1;
		}
		if(currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}
}
