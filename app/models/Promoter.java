package models;

import io.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name = "Promoter")
public class Promoter extends Model {

    @Id
    @Column(name = "PromoterId")
    private String Id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;
}
