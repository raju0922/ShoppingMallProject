package ShopModule;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shopId;
	//private Employee shopEmployementID;
	private String shopCategory;
	private String shopName;
	private String shopStatus;
    //private shopowner Shopowner;
	private String leaseStatus;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	//public Employee getShopEmployementID() {
	//	return shopEmployementID;
	//}
	//public void setShopEmployementID(Employee shopEmployementID) {
	//	this.shopEmployementID = shopEmployementID;
	//}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	//public shopowner getShopowner() {
	//	return Shopowner;
	//}
	//public void setShopowner(shopowner shopowner) {
	//	Shopowner = shopowner;
	//}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", shopStatus="
				+ shopStatus + ", leaseStatus=" + leaseStatus + "]";
	}
	
}
