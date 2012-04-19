package ningbo.media.dao.impl;

import java.util.List;
import ningbo.media.bean.Location;
import ningbo.media.core.dao.impl.BaseDaoImpl;
import ningbo.media.core.page.Pagination;
import ningbo.media.dao.LocationDao;
import ningbo.media.rest.util.Constant;
import ningbo.media.util.Pinyin;
import org.springframework.stereotype.Repository;
import ningbo.media.core.page.Finder ;

@Repository("locationDao")
public class LocationDaoImpl extends BaseDaoImpl<Location, Integer> implements
		LocationDao {

	
	public LocationDaoImpl() {
		super(Location.class);
	}
	
	public List<Location> queryLocationByName(String locationName){
		if(locationName == null){
			return null ;
		}
		StringBuffer sb = new StringBuffer() ;
		sb.append("from Location m where 1=1 ") ;
		if(Pinyin.isChinese(locationName)){
			sb.append(" and m.name_cn like ? ") ;
		}else{
			sb.append(" and m.name_en like ? ") ;
		}
		List<Location> list = this.findByHql(sb.toString(), true, Constant.LIMIT, locationName) ;
		return list ;
	}

	public Pagination<Location> queryLocationByPage(int pageNo, int pageSize) {
		Finder f = Finder.create("from Location bean where 1=1 ");
		f.append(" order by bean.id desc ") ;
		return findByPage(f, pageNo, pageSize);
	}
}