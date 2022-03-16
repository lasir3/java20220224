package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App05 {
	public static void main(String[] args) {
		Animal animal1 = method01();
		animal1.breathe();
		animal1.cry();
		
		Animal animal2 = method02();
		animal2.breathe();
		animal2.cry();
		
		Animal animal3 = method03();
		animal3.breathe();
		animal3.cry();
		
		Animal animal4 = method04();
		animal4.breathe();
		animal4.cry();
		
		Animal animal5 = method05();
		animal5.breathe();
		animal5.cry();
	}
	public static Animal method01() {
		return new Animal();
	}
	public static Animal method02() {
		return new Canine();
	}
	public static Animal method03() {
		return new Feline();
	}
	public static Animal method04() {
		return new Chihuahua(); 
	}
	public static Animal method05() {
		return new StreetCat();
	}
}
