package demo.demo1;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author boyiren
 * @date 2019-10-07
 */
@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    Post() {

    }

    Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Post(id=%d, title=%s)", this.id, this.title);
    }
}
