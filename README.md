# OXSwipe
Providing swipe feature for android applications.

##Installation

To use the library, first include it your project using Gradle

        allprojects {
            repositories {
                jcenter()
                maven { url "https://jitpack.io" }
            }
        }
and:

        dependencies {
                compile 'com.github.10uroi:OXSwipe:1.0.0'
        }
        
##How to use
  
    imageView_example.setOnTouchListener(new OXSwipe(){
          @Override 
          public void leftSwipe() {

          }

          @Override 
          public void rightSwipe() {

          }

          @Override 
          public void upSwipe() {

          }

          @Override 
          public void downSwipe() {

          }
          
          @Override 
          public void oneTouch() {

          }
      });
