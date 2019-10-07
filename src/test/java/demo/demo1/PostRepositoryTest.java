package demo.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author boyiren
 * @date 2019-10-07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;

    @Test
    public void findAll() {
        System.out.println(postRepository.findAll().getClass());
        System.out.println(postRepository.findAll());
    }

    @Test
    public void count() {
        System.out.println(postRepository.count());
    }

    @Test
    public void save() {
        Post post = new Post(1L, "文章1");
        postRepository.save(post);
        assertEquals(postRepository.findById(1L).get().getTitle(), "文章1");
    }

    @Test
    public void saveAll() {
        Post post1 = new Post(1L, "文章1");
        Post post2 = new Post(2L, "文章2");
        Post post3 = new Post(3L, "文章3");
        List<Post> postList = new ArrayList<>(Arrays.asList(post1, post2, post3));
        postRepository.saveAll(postList);
        assertEquals(postRepository.count(), 3);
    }

    @Test
    public void existsById() {
        Post post = new Post(1L, "文章1");
        postRepository.save(post);
        assertTrue(postRepository.existsById(1L));
    }

}