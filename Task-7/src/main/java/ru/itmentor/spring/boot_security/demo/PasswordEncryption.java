package ru.itmentor.spring.boot_security.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryption {
    public static void main(String[] args) {
        // Создаем экземпляр BCryptPasswordEncoder
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Указываем пароль, который нужно зашифровать
        String rawPassword = "password";

        // Шифруем пароль
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // Выводим зашифрованный пароль
        System.out.println("Зашифрованный пароль: " + encodedPassword);
    }
}

