package com.app.androidnewsapp.config;

public class AppConfig {

    //your Server Key obtained from the admin panel
    public static final String SERVER_KEY = "WVVoU01HTklUVFpNZVRsb1lsaFdlbUpIYkhSTVZ6RndZbTFSZFZreU9YUk1Na1pyWWxkc2RWZ3pRbWhpYlZaeldESkdkMk5IZUhCWk1rWXdZVmM1ZFZOWFVtWlpNamwwVEcxR2QyTkROV2hpYlZKNVlqSnNhMkp0VmpOak1rWjNZMEU5UFE9PQ==";

    //your Rest API Key obtained from the admin panel
    public static final String REST_API_KEY = "cda11v2OkqSI1rhQm37PBXKnpisMtlaDzoc4w0U6uNATgZRbJG";

    //show one latest news as header view
    public static final boolean DISPLAY_HEADER_VIEW = true;

    //show short description in the news list
    public static final boolean ENABLE_EXCERPT_IN_POST_LIST = true;

    //show total news in each category
    public static final boolean ENABLE_POST_COUNT_IN_CATEGORY = true;

    //video player orientation
    public static final boolean FORCE_VIDEO_PLAYER_TO_LANDSCAPE = false;

    //date display configuration
    public static final boolean ENABLE_DATE_DISPLAY = true;
    public static final boolean DATE_DISPLAY_AS_TIME_AGO = false;

    //enable view count in the news description
    public static final boolean ENABLE_VIEW_COUNT = true;

    //display alert dialog when user want to close the app
    public static final boolean ENABLE_EXIT_DIALOG = false;

    //set false to disable copy text in the news description
    public static final boolean ENABLE_TEXT_SELECTION = false;

    //open link in the news description using external web browser
    public static final boolean OPEN_LINK_INSIDE_APP = true;

    //GDPR EU Consent
    public static final boolean USE_LEGACY_GDPR_EU_CONSENT = true;

    //load more for next news list
    public static final int LOAD_MORE = 10;

    public static final int DELAY_SPLASH_SCREEN = 1000;

    //if you use RTL Language e.g : Arabic Language or other, set true
    public static final boolean ENABLE_RTL_MODE = false;

}