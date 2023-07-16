package com.danilo.aoc.day04;

public class PassportBuilder {
    private final Passport passport;

    public PassportBuilder() {
        this.passport = new Passport();
    }

    public Passport build() {
        return this.passport;
    }

    public PassportBuilder birthYear(String birthyear) {
        this.passport.setBirthYear(birthyear);
        return this;
    }

    public PassportBuilder issueYear(String issueYear) {
        this.passport.setIssueYear(issueYear);
        return this;
    }

    public PassportBuilder expirationYear(String expirationYear) {
        this.passport.setExpirationYear(expirationYear);
        return this;
    }

    public PassportBuilder height(String height) {
        this.passport.setHeight(height);
        return this;
    }

    public PassportBuilder hairColor(String hairColor) {
        this.passport.setHairColor(hairColor);
        return this;
    }

    public PassportBuilder eyeColor(String eyeColor) {
        this.passport.setEyeColor(eyeColor);
        return this;
    }

    public PassportBuilder passportId(String passportId) {
        this.passport.setPassportId(passportId);
        return this;
    }

    public PassportBuilder countryId(String countryId) {
        this.passport.setCountryId(countryId);
        return this;
    }
}
