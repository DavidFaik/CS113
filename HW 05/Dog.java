import java.util.Scanner;

class Dog implements Comparable<Dog> {
    private int age;
    private String breed;

    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "Breed: " + breed + ", Age: " + age;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog other = (Dog) obj;
        return this.breed.equals(other.breed);
    }

    public int compareTo(Dog other) {
        return Integer.compare(this.age, other.age);
    }
}