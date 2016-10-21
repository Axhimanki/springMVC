package com.example.controllers;
import com.example.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Armando on 10/21/2016.
 */
@Controller
public class PostController{
    private PostService postService;


    @Autowired //Tells spring bean being injected
    public void setPostService(PostService postService){
        this.postService = postService;
    }
    //if this project fits a database  we can use any kind. It doesnt care where the list comes from.
    @RequestMapping("/Posts")
    public String listAllPosts(Model model){
        model.addAttribute("posties", postService.listAllPosts());
        return "posts";
    }

    @RequestMapping("/Posts/{id}")
    public String getPost(@PathVariable Integer id, Model model2){
        model2.addAttribute("post", postService.getPostByID(id));
        return "post";
    }
}
