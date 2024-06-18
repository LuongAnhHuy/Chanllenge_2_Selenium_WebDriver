package ui;

import testdata.DataTests;

public class HomePageUI {
    public static final String CHON_DIEM_DI_BUTTON = "//input[@class='mktnd_frm_flight_departure form-control des-input flight_from']";
    public static final String CHON_DIEM_DEN_BUTTON = "//input[@class='mktnd_frm_flight_destination form-control des-input flight_to']";
    public static final String DIEM_DI_SELECT = "//div[@class='list-flight-des']//ul[@class='clearfix ul-flight-des collapse fade active in flight_from_domestic']//li//strong[text()='"+DataTests.DIEM_DI+"']";

    public static final String DIEM_DEN_SELECT  = "//div[@class='list-flight-des']//ul[@class='clearfix ul-flight-des collapse fade active in flight_to_domestic']//li//strong[text()='" + DataTests.DIEM_DEN + "']";
    public static final String NGAY_DI_DATEPICKER = "//input[@name='Depart']";
    public static final String NGAY_VE_DATEPICKER = "//input[@name='Return']";
    public static final String HANH_KHACH_BUTTON = "//label[@for='flight_passenger']";
    public static final String CHILDREN_PLUS_BUTTON = "//div[@class='popover-content']//div[@class='input-group input-group-number']//div[@data-field='nb_children' and @data-type='plus']//i";
    public static final String TIM_CHUYEN_BAY_BUTTON = "//button[@class='mktnd_btn_flight_search_flight btn btn-orange btn-block btn-orange--mod']";
    public static final String GIA_TIEN_LABEL = "//label[@class='mktnd_btn_flight_book_now radio btn btn-flight-price flight-select btn-sm']";
}
