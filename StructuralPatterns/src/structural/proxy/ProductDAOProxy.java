package structural.proxy;

import java.util.List;
import java.util.logging.Logger;

public class ProductDAOProxy extends ProductDAO {
	private static final Logger LOG = Logger.getLogger(ProductDAOProxy.class.getName());
	private static final Integer SLOW = 5000;
	private  ProductDAO dao;
	
	public ProductDAOProxy(ProductDAO dao) {
		super(dao.findAll());
		this.dao = dao;
	}
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		LOG.info ("Starting method ProductDao.findAll");
		var ret = this.dao.findAll();
		LOG.info ("Finished method ProductDao.findAll");
		
		logSlowQuery(start);
		return ret; 
	}

	@Override
	public Product find(Integer id) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		LOG.info ("Starting method ProductDao.find");
		var ret = this.dao.find(id);
		LOG.info ("Finished method ProductDao.find");
		
		logSlowQuery(start);
		return ret;
	}
	
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		LOG.info ("Starting method ProductDao.save");
		super.save(product);
		LOG.info ("Finished method ProductDao.save");
		
		logSlowQuery(start);
	}
	
	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		LOG.info ("Starting method ProductDao.delete");
		super.save(product);
		LOG.info ("Finished method ProductDao.delete");
		
		logSlowQuery(start);
	}
	
	private void logSlowQuery(long start) {
		long timelapse = System.currentTimeMillis() - start;
		StackTraceElement frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];
		if (timelapse >= SLOW) {
			LOG.warning("Method ProductDAO."+ frame.getMethodName() +" took too much time to finish. Timelapse: " + timelapse);
		}
	}
}
