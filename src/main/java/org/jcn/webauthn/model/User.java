package org.jcn.webauthn.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "user_table")
@Entity
public class User extends PanacheEntity {
  @Column(unique = true, nullable = false)
  public String userName;
}
