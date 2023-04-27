package ru.nina.hibernatever.model;

import jakarta.persistence.*;

@Entity
@Table(name = "numbers")
public class PhoneNumber {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String number;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private User user;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }


}
