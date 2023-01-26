package ru.netology.post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Рамазан";
        post.passport = "4444 № 44444444";
        post.patronymic = "Сулейманович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Алипов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        System.out.println(post.name);
    }
}
