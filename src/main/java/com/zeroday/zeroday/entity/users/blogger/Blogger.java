package com.zeroday.zeroday.entity.users.blogger;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "blogger")
public class Blogger implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloggerId;

    @OneToOne(mappedBy = "blogger")
    private BloggerProfile profile;

    @ManyToMany
    @JoinTable(
            name = "blogger_follower",
            joinColumns = @JoinColumn(name = "blogger_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id")
    )
    private List<Blogger> following;

    public Blogger() {

    }

    public Blogger(Long bloggerId, BloggerProfile profile) {
        this.bloggerId = bloggerId;
        this.profile = profile;
    }

    public Long getBloggerId() {
        return bloggerId;
    }

    public void setBloggerId(Long bloggerId) {
        this.bloggerId = bloggerId;
    }

    public BloggerProfile getProfile() {
        return profile;
    }

    public void setProfile(BloggerProfile profile) {
        this.profile = profile;
    }
}
