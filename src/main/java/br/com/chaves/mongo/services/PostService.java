package br.com.chaves.mongo.services;

import br.com.chaves.mongo.domain.Post;
import br.com.chaves.mongo.repositories.PostRepository;
import br.com.chaves.mongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("User not found"));

    }
}
