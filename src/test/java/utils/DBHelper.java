package utils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;


public class DBHelper {


	protected static void executeSqlScript(String sqlResourcePath, boolean continueOnError, JdbcTemplate jdbcTemplate) throws DataAccessException {
		Resource resource = new ClassPathResource(sqlResourcePath);
		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
		databasePopulator.setContinueOnError(continueOnError);
		databasePopulator.setScripts(new Resource[]{resource});

		DatabasePopulatorUtils.execute(databasePopulator, jdbcTemplate.getDataSource());
	}
	
	
}
