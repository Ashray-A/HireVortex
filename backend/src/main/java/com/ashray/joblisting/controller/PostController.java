package com.ashray.joblisting.controller;

import com.ashray.joblisting.model.Post;
import com.ashray.joblisting.repository.PostRepository;
import com.ashray.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController
{

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }


}