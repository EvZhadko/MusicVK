package com.evzhadko.musickgroup;

import java.util.ArrayList;

public class GroupList {
    public int GroupIcon;
    public String GroupColor;
    public String GroupTitle;
    public String GroupUrl;
    public String GroupName;
    public GroupList(){
        super();
    }

    public GroupList(int GroupIcon, String GroupColor, String GroupTitle, String GroupName, String GroupUrl) {
        super();
        this.GroupIcon = GroupIcon;
        this.GroupColor = GroupColor;
        this.GroupTitle = GroupTitle;
        this.GroupName = GroupName;
        this.GroupUrl = GroupUrl;
    }
}