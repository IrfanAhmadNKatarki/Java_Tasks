package Valtechspring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;



import Valtechspring.orm.Bike;
import Valtechspring.orm.BikeDetails;



public class BikeDAOImpl implements BikeDAO {
	
    private DataSource datasource;
    
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }
    
    @Override
    public void save(Bike bike) {
        JdbcTemplate temp=new JdbcTemplate(datasource);
        temp.queryForInt("select max(id) from Bike");
        temp.update("insert into bike(kms,validInsurance,numOfOwners,make,model,color,yearManufactured,price,version)"+
        " values(?,?,?,?,?,?,?,?,?,?) ",bike.getId(),bike.getBikeDetails().getKms(),bike.getBikeDetails().isValidInsurance(),bike.getBikeDetails().getNumOfOwners(),
        bike.getMake(),bike.getModel(),bike.getColor(),bike.getYearManufactured(),bike.getPrice(),bike.getVersion());
    }
    @Override
	public void update(Bike bike) {
        JdbcTemplate temp=new JdbcTemplate(datasource);



       temp.update("update bike set kms= ?,numOfOwners=?,validInsurance=?,color=?,make=?,model=?,price=?,version=?,yearManufactured=? where id=? ",bike.getBikeDetails().getKms(),
    		   bike.getBikeDetails().getNumOfOwners(),bike.getBikeDetails().isValidInsurance(),bike.getColor(),bike.getMake(),bike.getModel(),bike.getPrice(),bike.getVersion(),bike.getYearManufactured(),bike.getId());
            
    }
    @Override
    public void delete(Bike bike) {
        JdbcTemplate temp=new JdbcTemplate(datasource);
        temp.update("delete from car where id= ?",bike.getId());
    }
    private static class BikeRowMapper implements org.springframework.jdbc.core.RowMapper<Bike> {



       @Override
        public Bike mapRow(ResultSet rs, int row) throws SQLException {
            
            int kms=rs.getInt(1);
            int numofowners=rs.getInt(2);
            boolean validinsurance=rs.getBoolean(3);
            BikeDetails cd=new BikeDetails(kms,validinsurance,numofowners);
//            
            String color=rs.getString(4);
            String make=rs.getString(5);
            String model=rs.getString(6);
            float price=rs.getFloat(7);
            int yearmfg=rs.getInt(8);
            int version=rs.getInt(9);
            
            int id=rs.getInt(10);
            Bike bike=new Bike(id,make,color,model,yearmfg,price,cd);
            return bike;
        
    }
    /* (non-Javadoc)
     * @see ValtechSpring.jdbc.BikeDAO#get(int)
     */
   


}
	@Override
	public Bike get(int id) {
		// TODO Auto-generated method stub
		JdbcTemplate temp = new JdbcTemplate(datasource);
        return temp.queryForObject("Select kms,numOfOWners,color,make,model,price,yearManufactured,version,id from bike where id=?",new BikeRowMapper(),id);
	}

	@Override
	public List<Bike> getAll() {
		// TODO Auto-generated method stub
		 JdbcTemplate temp = new JdbcTemplate(datasource);
         return temp.query("Select kms,numOfOWners,color,make,model,price,yearManufactured,version,id from bike ",new BikeRowMapper());
	}
}