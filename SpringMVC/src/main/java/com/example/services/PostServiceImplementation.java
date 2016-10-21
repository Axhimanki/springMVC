package com.example.services;

import com.example.domain.Post;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Armando on 10/21/2016.
 */
@Service
public class PostServiceImplementation implements PostService {
    private Map<Integer,Post> posts;

    @Override
    public Post getPostByID(Integer id){
        return posts.get(id);
    }
    public PostServiceImplementation(){
        loadSampleData();
    }
    @Override
    public List<Post> listAllPosts() {
        ArrayList<Post> e = new ArrayList<Post>(posts.values());
        System.out.println(e.toString());
        return e;

    }



    public void loadSampleData(){
        // Instead of Adding arbitarry data, This class will house a PostServiceRepository Object. This object will
        // be able to interact with the database.
        posts = new HashMap<Integer,Post>();

        Post firstPost = new Post();
        firstPost.setText("This is the first sample post of the WADC Website.");
        firstPost.setDate(Date.valueOf(LocalDate.now()));
        firstPost.setPostID(1);
        firstPost.setRespondEmail("Respond to: Armando.Xhimanki@StonyBrook.edu");
        posts.put(1,firstPost);

        Post secondPost = new Post();
        firstPost.setText("This is the first sample post of the WADC Website.");
        firstPost.setDate(Date.valueOf(LocalDate.now().minusDays(5)));
        firstPost.setPostID(1);
        firstPost.setRespondEmail("Respond to: Armando.Xhimanki@StonyBrook.edu");
        posts.put(1,secondPost);

    }
}
