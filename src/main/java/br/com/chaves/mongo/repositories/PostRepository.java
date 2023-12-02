package br.com.chaves.mongo.repositories;

import br.com.chaves.mongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
