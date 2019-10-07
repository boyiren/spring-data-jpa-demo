package demo.entity;

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

    @Column(name = "visits")
    private Long visits;

    public Post() {

    }

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Post(Long id, String title, Long visits) {
        this.id = id;
        this.title = title;
        this.visits = visits;
    }

    @Override
    public String toString() {
        return String.format("Post(id=%d, title=%s, visits=%s)", this.id, this.title, this.visits);
    }
}
