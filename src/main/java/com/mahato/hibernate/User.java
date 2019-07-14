package com.mahato.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USERS")
public class User {

   @Id
   @GeneratedValue
   @Column(name = "USER_ID")
   private Long id;

   @Column(name = "USER_NAME")
   private String name;

   @Column(name = "USER_EMAIL", unique = true)
   private String email;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("User [id=").append(id).append(", name=").append(name).append(", email=").append(email).append("]");
	return builder.toString();
}
   
}