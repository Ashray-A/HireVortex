package com.ashray.joblisting.repository;

import com.ashray.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}