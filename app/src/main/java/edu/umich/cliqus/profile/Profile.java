package edu.umich.cliqus.profile;

import android.nfc.Tag;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by somcom3x on 11/3/17.
 */

public class Profile {

    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String email;
    private String phone;

    public Profile() {
        this.firstName = null;
        this.lastName = null;
        this.gender = null;
        this.dob = null;
        this.email = null;
        this.phone = null;
    }

    public Profile(String firstName, String lastName, String gender, String dob, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean checkData() {
        if(firstName.isEmpty() || lastName.isEmpty() || gender.isEmpty() || dob.isEmpty() ||
                email.isEmpty() || phone.isEmpty())
            return false;
        return true;
    }

}