package br.com.chaves.mongo.config;

import br.com.chaves.mongo.domain.Post;
import br.com.chaves.mongo.domain.User;
import br.com.chaves.mongo.repositories.PostRepository;
import br.com.chaves.mongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        userRepository.deleteAll();
        postRepository.deleteAll();

        User u1 = new User(null, "Maria Brown", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "alex@gmail.com");
        User u3 = new User(null, "Bob Grey", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem", "Vou viajar para São Paulo. Abraços!", u1);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz!", u1);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
