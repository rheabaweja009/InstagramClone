package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gUU6WfHfy7wMIpR6hImoxXQNblgIozSabOYc8GRT")
                .clientKey("JzDeznZoMd8SxH70vm2biD6ixzlojoZAba9JRBFC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
