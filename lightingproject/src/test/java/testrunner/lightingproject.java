package testrunner;

import org.apache.poi.ss.formula.functions.Value;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Constant1.Baseclass;
import Pages.Clickquantity;
import Pages.Createaccount;
import Pages.Livachart;
import Pages.Livechart1;
import Pages.Login;
import Pages.Logo;
import Pages.Removeproduct;
import Pages.Scrollupdown;
import Pages.Search;
import Pages.Signout;
import Pages.Specificproductinfilter;
import Pages.Tab;
import Pages.Verifyhomepage;
import Pages.Verifytitle;
import Pages.Verifyzipcode;

public class lightingproject extends Baseclass {
	Createaccount Accountcreation;
	Login Signinapplication;
	Verifytitle Title;
	Tab Secltproduct;
	Specificproductinfilter Features;
	Verifyhomepage Homepage;
	Logo Verifilogo;
	Scrollupdown Up;
	Signout Page;
	Pages.Addcartproduct Check;
	Verifyzipcode Codechek;
	Clickquantity Value;
	Removeproduct Cart;
	Livechart1 Chartemail;
	Livachart emailchart;
	Search Itemfan;

	public lightingproject() {
		super();

	}

//Browser initialization

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		Accountcreation = new Createaccount();
		Signinapplication = new Login();
		Title = new Verifytitle();
		Secltproduct = new Tab();
		Features = new Specificproductinfilter();
		Homepage = new Verifyhomepage();
		Verifilogo = new Logo();
		Up = new Scrollupdown();
		Page = new Signout();
		Check = new Pages.Addcartproduct();
		Codechek = new Verifyzipcode();
		Value = new Clickquantity();
		Cart = new Removeproduct();
		Chartemail = new Livechart1();
		emailchart = new Livachart();
		Itemfan = new Search();
	}

	// Create Account
	@Test(enabled = true, priority = 1)
	public void creteaccount() throws InterruptedException {
		Accountcreation.Account();

	}

//Login
	@Test(enabled = true, priority = 2)
	public void Login() throws InterruptedException {
		Signinapplication.Clicklogin();
	}

	// TitleChecking
	@Test(enabled = true, priority = 3)
	public void Verifytitle() throws InterruptedException {
		Signinapplication.Clicklogin();
		Title.titlechecking();

	}
	// User select product and price and addcart

	@Test(enabled = true, priority = 4)

	public void Tab() throws InterruptedException {
		Signinapplication.Clicklogin();
		Secltproduct.Addproduct();

	}

	@Test(enabled = true, priority = 5)

	public void Specifiproductfilter() throws InterruptedException {
		Signinapplication.Clicklogin();
		Features.Specificitem();

	}

	@Test(enabled = true, priority = 6)

	public void Verifyhomepage() throws InterruptedException {
		Signinapplication.Clicklogin();
		Homepage.homepagedsipaly();
		driver.navigate().back();

	}

	@Test(enabled = true, priority = 7)
	public void Logo() throws InterruptedException {
		Verifilogo.Checklogo();

	}

	@Test(enabled = true, priority = 8)
	public void Scrollupdown() throws InterruptedException {
		Up.pagedown();

	}

	@Test(enabled = true, priority = 9)
	public void Signout() throws InterruptedException {
		Signinapplication.Clicklogin();
		Page.Login1();

	}

	@Test(enabled = true, priority = 10)
	public void Addcartproduct() throws InterruptedException {
		Signinapplication.Clicklogin();
		Check.Specificproduct();

	}

	@Test(enabled = true, priority = 11)
	public void Verifyzipcode() throws InterruptedException {
		Signinapplication.Clicklogin();
		Check.Specificproduct();
		Codechek.Code();

	}

	@Test(enabled = true, priority = 12)
	public void Value() throws InterruptedException {
		Signinapplication.Clicklogin();
		Check.Specificproduct();
		Value.Verifyquantity1();

	}

	@Test(enabled = true, priority = 13)
	public void Removeproduct() throws InterruptedException {
		Signinapplication.Clicklogin();
		Check.Specificproduct();
		Cart.removecart();

	}

	@Test(enabled = true, priority = 14)
	public void Livechart1() throws InterruptedException {
		Chartemail.LiveChart();

	}

	@Test(enabled = true, priority = 15)
	public void Livachart() throws InterruptedException {
		emailchart.LiveChart();

	}

	@Test(enabled = true, priority = 16)
	public void Search() throws InterruptedException {
		Signinapplication.Clicklogin();
		Itemfan.searchitem();

	}

	@Test(enabled = true, priority = 17)

	public void filter() throws InterruptedException {
		Signinapplication.Clicklogin();
		Features.Specificitem();

	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	

}
