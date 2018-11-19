package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Repos {
//   @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String name;
   private String full_name;
//   private ArrayList<String> languages_url;
//   private ArrayList<String> collaborators_url;
//   private ArrayList<String> pulls_url;
   private long forks_count;
   private long unique_views;
   private long unique_cloners;
   //Repository traffic (unique visitors and unique cloners)

   @ManyToMany
   private User Owner;

   public Repos() {
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFull_name() {
      return full_name;
   }

   public void setFull_name(String full_name) {
      this.full_name = full_name;
   }

//   public ArrayList<String> getLanguages_url() {
//      return languages_url;
//   }
//
//   public void setLanguages_url(ArrayList<String> languages_url) {
//      this.languages_url = languages_url;
//   }
//
//   public ArrayList<String> getCollaborators_url() {
//      return collaborators_url;
//   }
//
//   public void setCollaborators_url(ArrayList<String> collaborators_url) {
//      this.collaborators_url = collaborators_url;
//   }
//
//   public ArrayList<String> getPulls_url() {
//      return pulls_url;
//   }
//
//   public void setPulls_url(ArrayList<String> pulls_url) {
//      this.pulls_url = pulls_url;
//   }

   public long getForks_count() {
      return forks_count;
   }

   public void setForks_count(long forks_count) {
      this.forks_count = forks_count;
   }

   public long getUnique_views() {
      return unique_views;
   }

   public void setUnique_views(long unique_views) {
      this.unique_views = unique_views;
   }

   public long getUnique_cloners() {
      return unique_cloners;
   }

   public void setUnique_cloners(long unique_cloners) {
      this.unique_cloners = unique_cloners;
   }

   public User getOwner() {
      return Owner;
   }

   public void setOwner(User owner) {
      Owner = owner;
   }

   @Override
      public String toString(){
         return "Repos_url{ id=" +id+
                 "Name="+name+"Full Name=" +full_name+
//                 "Languages used:" +languages_url+
//                 "Collaborators:" +collaborators_url+
//                 "pulls_url" +pulls_url+
                 "Forks" +forks_count+"}";
//                 "unique views" +unique_views+
//                 "unique cloners"+unique_cloners+"}";
      }

}
