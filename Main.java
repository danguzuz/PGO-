package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Telephone {
            String brand;
            int resolution;
            int number;
            String content;
            String MessagedNumber;

            public Telephone(String brand, int resolution, int number, String content, String MessagedNumber) {
                this.brand = brand;
                this.resolution = resolution;
                this.number = number;
                this.content = content;
                this.MessagedNumber = MessagedNumber;
            }

            public void sendWhat(String content) {
                this.content += content;
            }

            public void sendWhom(String MessagedNumber) {
                this.MessagedNumber = MessagedNumber;
            }
        }

    }
}
