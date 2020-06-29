package com.advanced.bank.bank.system.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "feature_packages")
public class FeaturePackage {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Long price;

    @ManyToMany
    @JoinTable(
            name = "feature_packages_features",
            joinColumns = @JoinColumn(name = "feature_package_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private Set<Feature> features = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }
}
