package com.danilo.aoc.day04;

public class Passport {
    private String birthYear;
    private String issueYear;
    private String expirationYear;
    private String height;
    private String hairColor;
    private String eyeColor;
    private String passportId;
    private String countryId;

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(String issueYear) {
        this.issueYear = issueYear;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public boolean isValid() {
        return (
                this.getHeight() != null && this.getBirthYear() != null &&
                        this.getExpirationYear() != null && this.getIssueYear() != null &&
                        this.getEyeColor() != null && this.getHairColor() != null && this.getPassportId() != null);
    }
}
