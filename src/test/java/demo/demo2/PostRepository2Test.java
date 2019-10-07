package demo.demo2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author boyiren
 * @date 2019-10-07
 */
public class PostRepository2Test {
    @Autowired
    private PostRepository2 postRepository2;

    @Test
    public void noDeleteMethod() {
        // postRepository.delete(); 选择性暴露接口后就没有delete方法了
    }
}