package com.gurukul.day5;

class Publication {
    private String title;
    private int price;

    Publication() {
    }

    Publication(String title, int price) {
	this.title = title;
	this.price = price;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public int getPrice() {
	return price;
    }

    public void setPrice(int price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "Publication " + title + " priced " + price;
    }

}

class Book extends Publication {
    int pages;

    Book() {
	super();
    }

    Book(String title, int price, int pages) {
	super(title, price);
	this.pages = pages;
    }

    public String toString() {
	return super.toString() + " has " + pages + " pages" + ".";
    }

}

class Movie extends Publication {
    String dir;
    String actor;

    Movie() {
	super();
    }

    Movie(String title, int price, String dir, String actor) {
	super(title, price);
	this.dir = dir;
	this.actor = actor;
    }

    public String toString() {
	return super.toString() + " is directed by " + dir + " and has lead actor " + actor + ".";
    }

}

public class PublicationOOP {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Book x = new Book("Kafka on the shore", 510, 505);
	Movie y = new Movie("Oppenheimer", 320, "Christopher Nolan", "Cillian Murphy");

	if (x.getPrice() > y.getPrice())
	    System.out.print(y);
	else
	    System.out.println(x);

    }

}
