package Cohesion;

//High Cohesion
class HighCohesive {
    // -------------- functions related to read resource
    // read the resource from disk
    public String readFromDisk(String fileName) {
         return "reading data of " + fileName;
    }

    // read the resource from web
    public String readFromWeb(String url) {
         return "reading data of " + url;
    }

     // read the resource from network
    public String readFromNetwork(String networkAddress) {
         return "reading data of " + networkAddress;
    }
}