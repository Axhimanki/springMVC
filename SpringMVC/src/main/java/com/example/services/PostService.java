package com.example.services;

import com.example.domain.Post;

import java.util.List;

/**
 * Created by Armando on 10/21/2016.
 */
public interface PostService {

    public Post getPostByID(Integer id);

    List<Post> listAllPosts();
}
