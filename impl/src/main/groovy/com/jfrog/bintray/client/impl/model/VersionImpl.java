package com.jfrog.bintray.client.impl.model;

import com.jfrog.bintray.client.api.model.Version;
import org.joda.time.DateTime;

import java.util.List;

/**
 * @author Noam Y. Tenne
 */
public class VersionImpl implements Version {

    String name;
    String description;
    String pkg;
    String repository;
    String owner;
    private List<String> labels;
    List<String> attributeNames;
    private DateTime created;
    private DateTime updated;
    DateTime released;
    int ordinal;
    String vcsTag;

    public VersionImpl() {
    }

    public VersionImpl(String name, String description, String pkg, String repository, String owner, List<String> labels,
                       List<String> attributeNames, DateTime created, DateTime updated, DateTime released, int ordinal, String vcsTag) {
        this.name = name;
        this.description = description;
        this.pkg = pkg;
        this.repository = repository;
        this.owner = owner;
        this.labels = labels;
        this.attributeNames = attributeNames;
        this.created = created;
        this.updated = updated;
        this.released = released;
        this.ordinal = ordinal;
        this.vcsTag = vcsTag;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public String pkg() {
        return pkg;
    }

    public String repository() {
        return repository;
    }

    public String owner() {
        return owner;
    }

    public List<String> labels() {
        return labels;
    }

    public List<String> attributeNames() {
        return attributeNames;
    }

    public DateTime created() {
        return created;
    }

    public DateTime updated() {
        return updated;
    }

    public DateTime released() {
        return released;
    }

    public int ordinal() {
        return ordinal;
    }

    public String vcsTag() {
        return vcsTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionImpl version = (VersionImpl) o;

        if (!name.equals(version.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Version{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pkg='" + pkg + '\'' +
                ", repository='" + repository + '\'' +
                ", owner='" + owner + '\'' +
                ", labels=" + labels +
                ", attributeNames=" + attributeNames +
                ", created=" + created +
                ", updated=" + updated +
                ", released=" + released +
                ", ordinal=" + ordinal +
                '}';
    }
}
