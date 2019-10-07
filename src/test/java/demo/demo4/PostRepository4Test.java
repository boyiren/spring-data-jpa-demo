package demo.demo4;

import demo.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author boyiren
 * @date 2019-10-07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepository4Test {
    @Autowired
    private PostRepository4 postRepository4;

    @Test
    public void findByTitle() {
        Post post = new Post(1L, "文章1");
        postRepository4.save(post);
        System.out.println(postRepository4.findByTitle("文章1"));
    }

    @Test
    public void findPostByTitle() {
        Post post = new Post(1L, "文章1");
        postRepository4.save(post);
        System.out.println(postRepository4.findPostByTitle("文章1"));
    }

    @Test
    public void findPostByTitleIgnoreCase() {
        Post post1 = new Post(1L, "a");
        postRepository4.save(post1);
        Post post2 = new Post(2L, "A");
        postRepository4.save(post2);
        System.out.println(postRepository4.findPostByTitleIgnoreCase("a"));
    }

    @Test
    public void findAllOrderByVisitsDesc() {
        Post post1 = new Post(1L, "1", 100L);
        postRepository4.save(post1);
        Post post2 = new Post(2L, "2", 200L);
        postRepository4.save(post2);
        Post post3 = new Post(3L, "3", 300L);
        postRepository4.save(post3);
        System.out.println(postRepository4.findAllByOrderByVisitsDesc());
    }
}