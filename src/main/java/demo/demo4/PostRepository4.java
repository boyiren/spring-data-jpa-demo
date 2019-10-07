package demo.demo4;

import demo.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 自定义查询方法
 *
 * @author boyiren
 * @date 2019-10-07
 */
public interface PostRepository4 extends CrudRepository<Post, Long> {
    /**
     * 根据文章标题来查找文章
     * @param title 文章标题
     * @return List<Post>
     */
    List<Post> findByTitle(String title);

    /**
     * 根据文章标题来查找文章,跟上面是等价的,但是我个人觉得这种命名会更严谨一点
     * @param title 文章标题
     * @return List<Post>
     */
    List<Post> findPostByTitle(String title);

    /**
     * 根据文章标题查找文章时,忽略标题的大小写字母
     * @param title 文章标题
     * @return List<Post>
     */
    List<Post> findPostByTitleIgnoreCase(String title);

    /**
     * 查找所有文章,并按阅读数量降序(desc)排列
     * findAllOrderByVisitsDesc 这种命名是行不通的,必须在中间加一个By
     * @return List<Post>
     */
    List<Post> findAllByOrderByVisitsDesc();
}
