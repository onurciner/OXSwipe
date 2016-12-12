# OXSwipe
Providing swipe feature for android applications.

### Log 
  v1.0.1 -> Api 14 support came.

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
                compile 'com.github.10uroi:OXSwipe:1.0.1'
        }
        
##How to use
  
    imageView_example.setOnTouchListener(new OXSwipe(){
          @Override 
          public void leftSwipe() {
                //Actions to be performed when imageView_example is swiped to the left
          }

          @Override 
          public void rightSwipe() {
                //Actions to be performed when imageView_example is swiped to the right
          }

          @Override 
          public void upSwipe() {
                //Actions to be performed when imageView_example is swiped to the up
          }

          @Override 
          public void downSwipe() {
                //Actions to be performed when imageView_example is swiped to the down
          }
          
          @Override 
          public void oneTouch() {
                //Actions to be performed when imageView_example is touched
          }
      });
