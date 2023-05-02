package com.zeroday.zeroday.entity.users.blogger;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "blogger_profile")
public class BloggerProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bloggerProfileId;

    private String firstname;

    private String lastname;

    private LocalDateTime birthdate;

    private String gender;

    private String phone;

    private String work;

    private String bio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "blogger_id", referencedColumnName = "bloggerId")
    private Blogger blogger;

    public BloggerProfile() {

    }

    public BloggerProfile(Long bloggerProfileId, String firstname, String lastname, LocalDateTime birthdate, String gender, String phone, String work, String bio, Blogger blogger) {
        this.bloggerProfileId = bloggerProfileId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.phone = phone;
        this.work = work;
        this.bio = bio;
        this.blogger = blogger;
    }

    public Long getBloggerProfileId() {
        return bloggerProfileId;
    }

    public void setBloggerProfileId(Long bloggerProfileId) {
        this.bloggerProfileId = bloggerProfileId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }
}
