package com.Crms.dao;
    import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
    import com.Crms.bean.Crms;
	import com.Crms.util.CrmsUtil;
	public class CrmsDao {
			// TODO Auto-generated method stub
			
				public int insertCar(Crms car)
				{
					int n=0;
					try 
					{
						Connection con=CrmsUtil.getDBConnection();
						String sql="insert into carDetails values(?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setInt(1,car.getCarId());
					    ps.setString(2,car.getCarType());
					    ps.setString(3,car.getCarModel());
					    ps.setInt(4,car.getRatePerKm());
					    ps.setString(5,car.getSeatCapacity());
					    
					    
						n=ps.executeUpdate();			
					}
					catch (Exception e)
					{
						System.out.println(e);
					}
					
					return n;
				}
				
				

				public int deleteCar(int id) {
					
					int n=0;
					try {
						Connection con=CrmsUtil.getDBConnection();
						String sql="delete from carDetails Where carId=?";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setInt(1, id);
						n=ps.executeUpdate();
						}
					catch (Exception e) 
					{
						System.out.println(e);
					}
					return n;
					
					
				}
				
				public int updateCar(Crms car) {
					int n=0;
					try {
						Connection con=CrmsUtil.getDBConnection();
						String sql="update carDetails set carModel=? where carId=?";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setString(1, car.getCarModel());
						ps.setInt(2,car.getCarId());
						n=ps.executeUpdate();
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					return n;
				}
				
				public int findCar(int id) {
					int n=0;
					try {
						Connection con=CrmsUtil.getDBConnection();
						String sql="select *from carDetails where carId=?";
						PreparedStatement ps=con.prepareStatement(sql);
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						
						while (rs.next()) {
							System.out.println("id:"+rs.getInt(1)+"\nType:"+rs.getString(2)+"\nModel:"+rs.getString(3)+"\nRatePerKM:"+rs.getString(4)+"\nSeatCapacity:"+rs.getString(5));
							n=1;
							
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					return n;
				}
				
				public int findAll() {
					int n=0;
					try {
						Connection con=CrmsUtil.getDBConnection();
						String sql="select *from carDetails";
						PreparedStatement ps=con.prepareStatement(sql);
						ResultSet rs=ps.executeQuery();
						
						while (rs.next()) {
							System.out.println("id: "+rs.getInt(1)+"\nType: "+rs.getString(2)+"\nModel: "+rs.getString(3)+"\nRatePerKM: "+rs.getString(4)+"\nSeatCapacity: "+rs.getString(5)+"\t");
							n=1;
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					System.out.println();
					return n;
				
			

		}



				
	}


