package _jav.something.aninym_class;

class MyThread {
   
    // Main driver method
    public static void main(String[] args)
    {
        // Using Anonymous Inner class that extends a class
        // Here a Thread class
        Thread t = new Thread() {
           
            // run() method for the thread
            public void run()
            {
                // Print statement for child thread
                // execution
                System.out.println("Child Thread");
            }
        };
 
        // Starting the thread
        t.start();
 
        // Displaying main thread only for readability
        System.out.println("Main Thread");
    }
}