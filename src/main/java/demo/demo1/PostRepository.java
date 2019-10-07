package demo.demo1;

import demo.entity.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * @author boyiren
 * @date 2019-10-07
 */
public interface PostRepository extends CrudRepository<Post, Long> {

}
