package com.inv.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.inv.bean.Inventory;
import com.inv.util.DBUtil;
public class InventoryDao {
	public int insert(Inventory inv) {
		Connection con=DBUtil.getDBCOnnection();
		String sql="insert into  inventory_db.inventory values(?,?,?,?,?,?)";
		int n=0;
		try {
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1, inv.getItemID());
			p.setString(2, inv.getItemName());
			p.setInt(3, inv.getQuantity_Available());
			p.setString(4, inv.getManufacturer());
			p.setString(5, inv.getMfg_date());
			p.setFloat(6, inv.getPrice());
			n=p.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;		
	}
	
	public int update(Inventory inv) {
		Connection con=DBUtil.getDBCOnnection();
		String sql="UPDATE `inventory_db`.`inventory` SET  `Itemname` =?, `QuantityAvailable` = ?, `Manufacturer` = ?, `Mfg_date` = ?, `price` = ? WHERE (`ItemID` = ?);";
		int n=0;
		try {
			PreparedStatement p=con.prepareStatement(sql);
			
			p.setString(1, inv.getItemName());
			p.setInt(2, inv.getQuantity_Available());
			p.setString(3, inv.getManufacturer());
			p.setString(4, inv.getMfg_date());
			p.setFloat(5, inv.getPrice());
			p.setInt(6, inv.getItemID());
			n=p.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;		
	}
	
	public int delete(int id) {
		int n=0;
        try {
            Connection con=DBUtil.getDBCOnnection();
            String sql="delete from inventory_db.inventory where ItemID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            n=ps.executeUpdate();
        }
        catch (Exception e) {
			System.out.println(e);
		}
		
		return n;		
	}
	
	public int Find(int id1) {
		int n=0;
        try {
            Connection con=DBUtil.getDBCOnnection();
            String sql="Select * from inventory_db.inventory where ItemID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id1);
            ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 System.out.print("Item ID: "+rs.getInt(1)+"\nItem Name: "+rs.getString(2)+"\nAvailable Quantity: "+rs.getInt(3)+"\nManufacturer: "+rs.getString(4)+"\nMfg_date: "+rs.getString(5)+"\nPrice: "+rs.getFloat(6));
				 System.out.println("\n--------------------------------------------------------------------------------------------------");
			 }
        }
        catch (Exception e) {
			System.out.println(e);
		}
		return n;		
	}
	
	 public int findAll() {
		 int n=0;
		  
		 try {
			 Connection con=DBUtil.getDBCOnnection();
			 String sql="select * from inventory_db.inventory";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.print("Item ID: "+rs.getInt(1)+"\nItem Name: "+rs.getString(2)+"\nAvailable Quantity: "+rs.getInt(3)+"\nManufacturer: "+rs.getString(4)+"\nMfg_date: "+rs.getString(5)+"\nPrice: "+rs.getFloat(6));
				 System.out.println("\n--------------------------------------------------------------------------------------------------");
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;		 
	 }

}
