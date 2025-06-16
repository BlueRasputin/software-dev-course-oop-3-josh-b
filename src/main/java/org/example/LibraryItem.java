package org.example;


import java.time.Duration;


    class LibraryItem {

        protected String title;
        protected int year;
        protected String author;

        public LibraryItem (String title, String author, int year) {
            this.title = title;
            this.year = year;
            this.author = author;


        }
        public String toString() {

            return title + " by " + author + " (" + year + ") ";
        }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
    class Album extends LibraryItem {
        public int trackCount;
        public Album(String title, String author, int year, int trackCount) {
            super(title, author, year );
            this.trackCount = trackCount;

        }

        public int getTrackCount() {
            return trackCount;
        }

       public void setTrackCount(int trackCount) {
           this.trackCount = trackCount;
       }
       @Override
       public String toString() {

           return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
       }
   }
   class Movie extends LibraryItem {
        public int durationInMinutes;
        public Movie(String title, String author, int year, int durationInMinutes) {
           super(title, author, year);
           this.durationInMinutes = durationInMinutes;

        }
        public int getDurationInMinutes() {
            return durationInMinutes;
        }

       public void setDurationInMinutes(int durationInMinutes) {
           this.durationInMinutes = durationInMinutes;
       }
       @Override
       public String toString() {

           return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
       }

   }
   class Book extends LibraryItem {
        public int pageCount;
        public Book(String title, String author, int year, int pageCount) {
            super(title, author, year);
            this.pageCount = pageCount;

        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public void readBook() {
            System.out.println("Reading " + title + " by " + author);
        }

       @Override
       public String toString() {

           return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
       }
     }

