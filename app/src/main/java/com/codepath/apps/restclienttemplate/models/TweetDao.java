package com.codepath.apps.restclienttemplate.models;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TweetDao {

    @Query("SELECT Tweet.body AS Tweet_body, Tweet.createdAt AS Tweet_createAt, Tweet.id AS Tweet_id " +
            "FROM Tweet INNER JOIN USER ON Tweet.userId = User.id ORDER BY Tweet.createdAt DESC LIMIT 5")
    List<TweetWithUser> recentItems();
}
