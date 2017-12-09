package com.example.android.contactsactivity;

/**
 * Created by Администратор on 04.12.2017.
 */

public class Contact {

        private String name;
        private String secondName;
        private long id;
        private String phone;
        private String email;


        public Contact(long id,String secondName,  String name, String phone, String email) {
            this.secondName = secondName;
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.email = email;

        }

        public String getSecondName() {
            return secondName;
        }

        public void getSecondName(String name) {
            this.secondName = secondName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
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

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }




}
