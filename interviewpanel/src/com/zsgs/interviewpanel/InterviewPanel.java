package com.zsgs.interviewpanel;

import com.zsgs.interviewpanel.login.LoginView;

public class InterviewPanel {
    
    private static InterviewPanel interviewpanel;
    private String appName = "Interview Management System";
    private String appVersion = "0.1.0";

    private InterviewPanel() {}

    public static InterviewPanel getInstance() {
        if(interviewpanel == null) {
            interviewpanel = new InterviewPanel();
        }
        return interviewpanel;
    }

    private void create() {
        LoginView loginView = new LoginView();
        loginView.init();
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public static void main(String[] args) {
        InterviewPanel.getInstance().create();
    }
}