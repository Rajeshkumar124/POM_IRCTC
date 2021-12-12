package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers {

	public BookYourHotelPage clickOnTopHotelDisplayed()
	{
		//clickByXpath("(//div[@class='mid-searchpack'])[1]/h5");
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div/h5");
		return new BookYourHotelPage();
		//(//img[@class='img-fluid ng-star-inserted'])[1]
	}
	public HotelListPage waitInHotelListPage(long time) {
		threadSleep(time);
		return this;
	}
}
