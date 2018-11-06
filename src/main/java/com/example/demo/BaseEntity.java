package com.example.demo;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

  @CreatedBy
  @Column(name = "create_user")
  protected int createUser;

  @CreatedDate
  @Column(name = "create_datetime")
  protected LocalDateTime createDatetime;

  @Version
  protected int version;

  @LastModifiedBy
  @Column(name = "update_user")
  protected int updateUser;

  @LastModifiedDate
  @Column(name = "update_datetime")
  protected LocalDateTime updateDatetime;

  @Column(name = "delete_flag")
  protected boolean deleteFlag;
}
